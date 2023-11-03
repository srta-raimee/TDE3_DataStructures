import java.util.Random;

public class Main {
    private static int iteracoesTotal = 0;
    private static long tempoTotal = 0;
    private static int trocasTotal = 0;

    public static void shellSort(int[] vetor) {
        int size = vetor.length;

        long start = System.nanoTime();
        int trocas = 0;
        int iteracoes = 0;

        for (int gap = size / 2; gap > 0; gap /= 2) {
            iteracoes++;
            for (int i = gap; i < size; i++) {
                iteracoes++;
                int temp = vetor[i];
                int l = i;
                while (l >= gap && vetor[l - gap] != temp) {
                    iteracoes++;
                    trocas++;
                    vetor[l] = vetor[l - gap];
                    l -= gap;
                }
                vetor[l] = temp;
            }
        }
        long end = System.nanoTime();

        tempoTotal += (end - start);
        trocasTotal += trocas;
        iteracoesTotal += iteracoes;

        System.out.println("\nTempo de execução: " + (end - start));
        System.out.println("Número de trocas: " + trocas);
        System.out.println("Número de iterações: " + iteracoes + "\n");
    }

    public static void main(String[] args) {
        Random random = new Random();

        for (int l = 0; l < 5; l++) { 
            System.out.println(" ======= Vetor " + (l + 1) + " =======\n");
          
            int[] vetor = new int[10000];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = random.nextInt(100000);
            }
            shellSort(vetor);
        }

        double mediaTempo = tempoTotal / 5; 
        double mediaTrocas = (double)trocasTotal / 5;
        double mediaIteracoes = iteracoesTotal / 5;

        System.out.println("========= Resultados =========");
        System.out.println("\nMédia de tempo de execução: " + mediaTempo);
        System.out.println("Média de número de trocas: " + mediaTrocas);
        System.out.println("Média de número de iterações: " + mediaIteracoes);
    }
}
