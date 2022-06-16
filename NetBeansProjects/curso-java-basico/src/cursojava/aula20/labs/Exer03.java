package cursojava.aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer03 {

    // Capture do teclado valores para preenchimento de uma matriz M
    // 3x3. Após a captura imprima a matriz criada e encontre a
    // quantidade de números pares, a quantidade de números ímpares.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int linhas = 3;
        int colunas = 3;
        int pares = 0;
        int impares = 0;

        int[][] matriz = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                //System.out.print("Digite: ");
                //matriz[l][c] = scan.nextInt();
                matriz[l][c] = r.nextInt(10) + 1;
                if (matriz[l][c] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println();
        for (int[] i : matriz) {
            for (int j : i) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A quantidade de pares é: " + pares);
        System.out.println("A quantidade de impares é: " + impares);
        System.out.println();
        scan.close();
    }

}
