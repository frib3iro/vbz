package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
// mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
// raiz quadrada do respectivo elemento de A, ou seja:
// B[i] = sqrt(A[i]).

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[3];
        double[] vetB = new double[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posição " + i + ": ");
            vetA[i] = scan.nextInt();
            vetB[i] = Math.sqrt(vetA[i]);
        }

        System.out.println();

        System.out.print("vetor vetA: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor vetB: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        System.out.println();
        System.out.println();

        scan.close();
    }
}
