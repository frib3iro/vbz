package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
// que defina o percentual de elementos pares e ímpares,
// respectivamente, armazenados neste vetor.

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double percentualPar = 0;
        double percentualImpar = 0;
        double x = 0;
        double y = 0;
        int[] A = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o indice " + i + ": ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println();

        System.out.println("Numeros pares: " + pares);
        percentualPar = (pares * 100) / A.length;
        System.out.println("O percentual de numeros pares é: " + percentualPar + "%");

        System.out.println();

        percentualImpar = (impares * 100) / A.length;
        System.out.println("Numeros impares: " + impares);
        System.out.println("O percentual de numeros impares é: " + percentualImpar + "%");

        scan.close();
    }
}
