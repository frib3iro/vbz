package cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

    // Gere e imprima uma matriz M 10x10 com valores aleatórios entre
    // 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
    // qual é o maior e o menor valor da coluna 7.
    
    public static void main(String[] args) {
        Random r = new Random();

        // int[i][j] matriz = new int[linha][coluna];
        
        int linha5 = 5;
        int maiorL5 = 0;
        int menorL5 = 0;
        int maiorC7 = 0;
        int menorC7 = 0;
        int[][] matriz = new int[10][10];

        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(10) + 1;
            }
        }
        
        // Imprimindo a matriz
        System.out.println("Imprimindo a matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("posição: " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%02d] ", matriz[i][j]);
            }
            System.out.println();
        }

        // Achando o maior e o menor valor da linha 5
        for (int i = 0; i < matriz[linha5].length; i++) {
            if (matriz[linha5][i] > maiorL5) {
                maiorL5 = matriz[linha5][i];
            }
            if (matriz[linha5][i] < matriz[linha5][i] + 1) {
                menorL5 = matriz[linha5][i];
            }
        }
        System.out.println();
        
        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da Linha 5: " + menorL5);
        System.out.println();
//        
//        // Achando o maior e o menor valor da coluna 7
//        for (int i = 0; i < matriz.length; i++) {
//            if (matriz[i][maiorC7] > maiorC7) {
//                maiorC7 = matriz[i][maiorC7];
//            }
//            if (matriz[i][menorC7] < menorC7) {
//                menorC7 = matriz[i][menorC7];
//            }
//        }
//        System.out.println();
//
//        // Achando o menor e o maior valor da coluna 7
//        System.out.println("Maior da coluna 7: " + maiorC7);
//        System.out.println("Menor da coluna 7: " + menorC7);

        System.out.println();

        
    }

}
