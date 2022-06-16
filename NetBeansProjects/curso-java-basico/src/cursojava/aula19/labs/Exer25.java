package cursojava.aula19.labs;

import java.util.Random;

public class Exer25 {

    // Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
    // um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
    // a) Ci deverá receber 1 quando Ai for maior que Bi;
    // b) Ci deverá receber 0 quando Ai for igual a Bi; 
    // c) Ci deverá receber -1 quando Ai for menor que Bi.
    
    public static void main(String[] args) {
        Random r = new Random();

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        // Preenchendo os arrays A e B
        for (int i = 0; i < 10; i++) {
            A[i] = r.nextInt(10) + 1;
            B[i] = r.nextInt(10) + 1;
        }

        // Preenchendo o array C
        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else if (A[i] < B[i]) {
                C[i] = -1;
            }
        }
        
        // Imprimindo o array A na tela
        System.out.print("Vetor A: ");
        for (int auxa : A) {
            System.out.print(auxa + " ");
        }
        System.out.println();
        
        // Imprimindo o array B na tela
        System.out.print("Vetor B: ");
        for (int auxb : B) {
            System.out.print(auxb + " ");
        }
        System.out.println();
        
        // Imprimindo o array C na tela
        System.out.print("Vetor C: ");
        for (int auxc : C) {
            System.out.print(auxc + " ");
        }
        System.out.println();
        
    }
}
