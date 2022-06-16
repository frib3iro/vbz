package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 10 elementos inteiros. Implementar um programa
// que determine a soma dos elementos armazenados neste vetor que
// são múltiplos de 5.
// O que são múltiplos de um número?
// O múltiplo de um número é o produto deste número por qualquer número natural 
// (0, 1, 2, 3, ...). 

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o indice " + i + ": ");
            vetor[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 5 == 0) {
                soma += vetor[i];
            }
        }
        
        System.out.println("A soma dos multiplos de 5 é: " + soma);

        scan.close();
    }

}
