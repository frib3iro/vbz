package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
// mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
// ser o quadrado do respectivo elemento de A, ou seja:
// B[i] = A[i] * A[I].

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite o elemento de posição " + i + ": ");
            vetA[i] = scan.nextInt();
            vetB[i] = vetA[i] * vetA[i];
        }

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

        scan.close();
    }

}
