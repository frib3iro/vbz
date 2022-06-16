package cursojava.aula19.labs;

import java.util.Scanner;

// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
// um vetor C, onde cada elemento de C é a subtração dos respectivos
// elementos em A e B, ou seja: C[i] = A[i] – B[i].
public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o vetor A de posição " + i + ": ");
            A[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o vetor B de posição " + i + ": ");
            B[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println();
        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor C: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println();
        scan.close();
    }

}
