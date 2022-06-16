package cursojava.aula19.labs;

import java.util.Scanner;

// Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
// mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
// ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
// seja: B[i] := A[i] % 2.
public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tam = 3;
        int[] vetA = new int[tam];
        int[] vetB = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Digite o vetor A de posição " + i + ": ");
            vetA[i] = scan.nextInt();
        }

        System.out.println();
        for (int i = 0; i < tam; i++) {
            vetB[i] = vetA[i] % 2;
        }

        System.out.println();
        System.out.print("Vetor vetA: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor vetB: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(vetB[i] + " ");
        }

        System.out.println();

        scan.close();
    }
}
