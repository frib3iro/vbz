package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 10 elementos inteiros. Implementar um programa
// que defina e escreva a média aritmética simples dos elementos
// ímpares armazenados neste vetor.

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                media++;
            } 
        }
        
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        System.out.println("A soma: " + soma);
        System.out.println("A media: " + (soma / media));

        scan.close();
    }

}
