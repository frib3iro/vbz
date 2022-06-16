package cursojava.aula19.labs;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa
//que defina e escreva a quantidade de elementos armazenados neste
//vetor que são pares.

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int aux = 0;
        int[] vetA = new int[3];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posição " + i + " do vetor: ");
            vetA[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] % 2 == 0) {
                aux++;
            }
        }

        if (aux > 1) {
            System.out.println("Existem " + aux + " números pares no vetor.");
        } else {
            System.out.println("Existe " + aux + " número par no vetor.");
        }

        System.out.println();

        scan.close();
    }

}
