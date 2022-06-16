package cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {

    // Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
    // 9. Após isso determine o maior número da matriz e a sua posição
    // (linha, coluna).

    public static void main(String[] args) {

        Random r = new Random();

        int[][] matriz = new int[4][4];

        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        // Imprimindo o maior numero da matriz
        System.out.println("Maior numero  da matriz: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
        
        System.out.println();

        System.out.println("Imprimindo a matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Posição: " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

    }

}
