package cursojava.testes;

import java.util.Arrays;
import java.util.Random;

public class ArraySemRepeticao {

    public static void main(String[] args) {

        int numero;
        int num2 = 10;
        int[] num = new int[6];
        Random r = new Random();

        for (int i = 0; i < num.length; i++) {
            numero = r.nextInt(num2) + 1;
            for (int j = 0; j < num.length; j++) {
                if (numero == num[j] && j != i) {
                    numero = r.nextInt(num2) + 1;
                } else {
                    num[i] = numero;
                }
            }
        }
        
        // Ordenando o array
        Arrays.sort(num);
        
        //Apresentar na tela o resultado
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
        System.out.println();
    }

}
