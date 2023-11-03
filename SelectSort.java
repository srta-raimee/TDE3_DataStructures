import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        selectSort(100);
    }

    public static void selectSort(int size) {
        int numIteracoes = 0;
        Random random = new Random();
        int totalTrocas = 0;
        int totalIteracoes = 0;
        int totalTempo = 0;
        System.out.println(" ====== Vetor com tamanho " + size + " ======");

        for (int l = 0; l < 5; l++) {
            numIteracoes++;
            System.out.println("Lista numero " + (l+1));
            int[] vetor = new int[size];
            for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);}
            int numTrocas = 0;

            long inicio = System.nanoTime();
            for (int i = 0; i < vetor.length; i++) {
                numIteracoes++;
                int minIndex = i;
                for (int j = i + 1; j < vetor.length; j++) {
                  numIteracoes++;
                  if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                  }
                }
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                numTrocas++;
              }
            long fim = System.nanoTime();
            long tempoExecucao = fim - inicio;

            System.out.println("Tempo de execução: " + tempoExecucao);
            System.out.println("\nNúmero de trocas: " + numTrocas);
            System.out.println("\nNúmero de iteraçoes: " + numIteracoes);
            System.out.println("\n ==========================");

            totalTrocas += numTrocas;
            totalIteracoes += numIteracoes;
            totalTempo += tempoExecucao;
        }
         System.out.println("\nMédia de Tempo de Execução: " + (totalTempo / 5));
        System.out.println("\nMédia de Numero de Trocas: " + (totalTrocas / 5));
        System.out.println("\nMédia de Numero de Iterações: " + (totalIteracoes / 5));
    
 }
    

       }

