package cursojava.aula19.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer17 {

//    Ler um vetor A com 10 elementos inteiros correspondentes as idades
//    de um grupo de pessoas. Escreva um programa que determine e
//    escreva a quantidade de pessoas que possuem idade superior a 35 anos.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vet = new int[30];
        int aux = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(80) + 18;
        }

        System.out.println();
        System.out.print("Idades: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        
        System.out.println();

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 35) {
                aux++;
            }
        }

        System.out.println();
        
        System.out.println("quantidade de pessoas maiores que 35 anos: " + aux);

        System.out.println();

        scan.close();
    }
}
