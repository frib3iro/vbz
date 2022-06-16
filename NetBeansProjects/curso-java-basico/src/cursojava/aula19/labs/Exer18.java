package cursojava.aula19.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer18 {

    // Ler um vetor A com 10 elementos inteiros correspondentes as idades
    // de um grupo de pessoas. Escreva um programa que determine e
    // escreva a menor e a maior idades e suas respectivas posições.
    
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);

        int[] v = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(80) + 18;
        }

        System.out.print("Idades: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        System.out.println();
        int maior = v[0];
        int iMaior = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
                iMaior = i;
            }
        }
        System.out.println("Maior: " + maior + " está na posição: " + iMaior);

        System.out.println();
        int menor = v[0];
        int iMenor = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
                iMenor = i;
            }
        }
        System.out.println("Menor: " + menor + " está na posição: " + iMenor);

        System.out.println();

        scan.close();
    }
}
