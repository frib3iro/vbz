package cursojava.aula19.labs;

import java.util.Random;

public class Exer30 {

    // Ler um vetor A com 20 elementos. Separar os elementos pares e
    // ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
    // do vetor B armazene os elementos pares de A e nas posições
    // restantes do vetor B armazene os elementos de A que são ímpares.
    
    public static void main(String[] args) {
        Random r = new Random();

        int num = 20;
        int aux = 0;
        int[] vetorA = new int[num];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = r.nextInt(num) + 1;
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[aux] = vetorA[i];
                aux++;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[aux] = vetorA[i];
                aux++;
            }
        }

        System.out.print("Vetor A: ");
        for (int a : vetorA) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.print("Vetor B: ");
        for (int b : vetorB) {
            System.out.print(b + " ");
        }

        System.out.println();
    }
}
