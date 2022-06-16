package cursojava.aula19.labs;

import java.util.Random;

public class Exer28 {
    
    // Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
    // sendo este a junção dos dois outros vetores. Os primeiros 10
    // elementos de C deverão receber os elementos de A e os últimos
    // elementos C deverão receber os elementos de B. Desta forma, C
    // deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
    
    public static void main(String[] args) {        
        Random rand = new Random();
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];
        
        // Preenchendo o vetor A e B
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(10);
            vetorB[i] = rand.nextInt(10);
        }
        
        // Preencher o vetor C
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }
        
        // Imprimindo vetor A na tela
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        // Imprimindo vetor B na tela
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        // Imprimindo vetor C na tela
        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
        
        
        
        
    }
}
