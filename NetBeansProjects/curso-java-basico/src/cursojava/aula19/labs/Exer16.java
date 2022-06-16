package cursojava.aula19.labs;

import java.util.Random;
import java.util.Scanner;

// Criar um vetor A com 10 elementos inteiros. Escrever um programa
// que calcule e escreva: 
// a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
// b) a quantidade de elementos armazenados no vetor que são iguais a 15; 
// c) a média dos elementos armazenados no vetor que são superiores a 15.

public class Exer16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int soma = 0;
        int qtd = 0;
        int media = 0;
        int aux = 0;
        int[] vetA = new int[10];

        for (int i = 0; i < vetA.length; i++) {
            //System.out.print("Digite o indice " + i + ": ");
            //vetA[i] = scan.nextInt();
            vetA[i] = r.nextInt(30) + 1;
        }

        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] < 15) {
                soma += vetA[i];
            } else if (vetA[i] == 15) {
                qtd++;
            } else {
                media += vetA[i];
                aux++;
            }
        }

        System.out.print("O vetor: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("A soma de elementos inferiores a 15 é: " + soma);

        System.out.println();
        System.out.println("A quantidade de elementos iguais a 15 é: " + qtd);

        System.out.println();
        System.out.println("A média dos elementos superiores a 15 é: " + (media / aux));

        System.out.println();
        scan.close();
    }

}
