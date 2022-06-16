package cursojava.aula19.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        // mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o 
        // respectivo elemento de A multiplicado por sua posição (ou índice), 
        // ou seja: B[i] = A[i] * i.
        
        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite o valor de posição " + i + ": ");
            vetA[i] = scan.nextInt();
            vetB[i] = vetA[i] * i;
        }

        System.out.println();

        System.out.print("Vetor vetA: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();

        System.out.print("vetor vetB: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        System.out.println();
        System.out.println();

        scan.close();
    }
}
