import java.util.Random;

public class Main {
    private static int iteracoesTotal = 0;
    private static long tempoTotal = 0;
    private static int trocasTotal = 0;

    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int[] info = particionar(vetor, inicio, fim);
            int posicaoPivo = info[0];
            int iteracoes = info[1];

            quicksort(vetor, inicio, posicaoPivo - 1);
            quicksort(vetor, posicaoPivo + 1, fim);

            iteracoesTotal += iteracoes;
        }
    }

    public static int[] particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;
        int iteracoes = 0;
        for (int j = inicio; j < fim; j++) {
            iteracoes++;
            if (vetor[j] < pivo) {
                i++;
                trocasTotal++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        trocasTotal++;
        iteracoes++;

        int[] info = new int[2];
        info[0] = i + 1;
        info[1] = iteracoes;
        return info;
    }

    public static void main(String[] args) {
        Random random = new Random();

        for (int l = 0; l < 5; l++) {
            System.out.println(" ======= Vetor " + (l + 1) + " =======\n");

            int[] vetor = new int[100];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = random.nextInt(100);
            }

            long start = System.nanoTime();
            quicksort(vetor, 0, vetor.length - 1);
            long end = System.nanoTime();

            tempoTotal += (end - start);

            System.out.println("\nTempo de execução: " + (end - start));
            System.out.println("Número de trocas: " + trocasTotal);
            System.out.println("Número de iterações: " + iteracoesTotal + "\n");

            
        }

        double mediaTempo = tempoTotal / 5;
        double mediaTrocas = (double) trocasTotal / 5;
        double mediaIteracoes = (double) iteracoesTotal / 5;

        System.out.println("========= Resultados =========");
        System.out.println("\nMédia de tempo de execução: " + mediaTempo);
        System.out.println("Média de número de trocas: " + mediaTrocas);
        System.out.println("Média de número de iterações: " + mediaIteracoes);
    }
}
