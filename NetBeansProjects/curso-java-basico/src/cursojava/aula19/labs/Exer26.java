package cursojava.aula19.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer26 {

    // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
    // mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    // a) Bi deverá receber 'a' quando Ai for menor que 7; 
    // b) Bi deverá receber 'b' quando Ai for igual a 7; 
    // c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10; 
    // d) Bi deverá receber 'd' quando Ai for igual a 10;
    // e) Bi deverá receber 'e' quando Ai for maior que 10.
    // Sugestão: char B[10];
    
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        char[] B = new char[A.length];

        // Preenchendo o array A
        // for (int i = 0; i < A.length; i++) {
        //     System.out.print("Digite o numero da posição " + i + ": ");
        //     A[i] = scan.nextInt();
        // }

        // Preenchendo o array A
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(11);
        }
        
// Mostrando o vetor A
        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        // Preenchendo vetor B
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else if (A[i] > 10) {
                B[i] = 'e';
            }
        }

        // Imprimindo vetor B
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();
        System.out.println();
        scan.close();
    }
}
