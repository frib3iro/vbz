package cursojava.aula19.labs;

import java.util.Scanner;

// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
// um vetor C, onde cada elemento de C é a multiplicação dos
// respectivos elementos em A e B, ou seja:
// C[i] = A[i] * B[i].

public class Exer08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o vetor vetA de posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o vetor vetB de posição " + i + ": ");
            vetorB[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println();
        System.out.print("Vetor vetorA: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor vetorB: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor vetorC: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        System.out.println();
        
        scan.close();
    }

}
