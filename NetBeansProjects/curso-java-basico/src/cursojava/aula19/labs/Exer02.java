package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
// mesmo tipo e tamanho e com os elementos do vetor A multiplicados
// por 2, ou seja: B[i] = A[i] * 2.

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite o elemento de posição " + i + ": ");
            vetA[i] = scan.nextInt();
            vetB[i] = vetA[i] * 2;
        }

        System.out.print("Vetor vetA: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor vetB: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        System.out.println();

        scan.close();
    }
}
