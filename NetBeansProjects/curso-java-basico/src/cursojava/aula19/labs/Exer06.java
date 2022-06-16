package cursojava.aula19.labs;

import java.util.Scanner;

// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
// um vetor C, onde cada elemento de C é a soma dos respectivos
// elementos em A e B, ou seja:
// C[i] = A[i] + B[i].
public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite o vetor vetA de posição " + i + ": ");
            vetA[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite o vetor vetB de posição " + i + ": ");
            vetB[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetA.length; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println();
        System.out.print("vetor vetA: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.print("vetor vetB: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        System.out.println();
        System.out.print("vetor vetC: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetC[i] + " ");
        }

        System.out.println();

        scan.close();
    }
}
