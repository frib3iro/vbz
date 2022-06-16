package cursojava.aula19.labs;

import java.util.Scanner;

// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
// um vetor C, onde cada elemento de C é a divisão dos respectivos
// elementos em A e B, ou seja:
// C[i] = A[i] / float(B[i]).

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tam = 3;
        int[] vetA = new int[tam];
        int[] vetB = new int[tam];
        int[] vetC = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            System.out.print("Digite a posição do vetA: ");
            vetA[i] = scan.nextInt();
        }
        
        System.out.println();
        for (int i = 0; i < tam; i++) {
            System.out.print("Digite a posição do vetB: ");
            vetB[i] = scan.nextInt();
        }
        
        System.out.println();
        for (int i = 0; i < tam; i++) {
            vetC[i] = vetA[i] / vetB[i];
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
        System.out.print("Vetor vetC: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(vetC[i] + " ");
        }
        
        System.out.println();
        scan.close();
    }

}
