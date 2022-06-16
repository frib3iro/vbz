package cursojava.aula19.labs;

import java.util.Random;

public class Exer24 {

    // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
    // mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    // a) Bi deverá receber 1 quando Ai for par; 
    // b) Bi deverá receber 0 quando Ai for ímpar.
    
    public static void main(String[] args) {
        Random r = new Random();

        int[] A = new int[10];
        int[] B = new int[10];

        // Leitura dos dados
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10) + 1;
        }

        // Contruindo o vetor B
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }

        // imprimindo o vetor A
        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        // imprimindo o vetor B
        System.out.print("Vetor B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

}
