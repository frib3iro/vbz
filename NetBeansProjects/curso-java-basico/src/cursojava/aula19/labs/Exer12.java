package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 10 elementos inteiros. Implementar um programa
// que defina e escreva a soma de todos os elementos armazenados
// neste vetor.

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite a posição " + i + " do vetor: ");
            vet[i] = scan.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        System.out.println();
        System.out.println("A soma de todos os elementos do vetor é : " + soma);

        scan.close();
    }

}
