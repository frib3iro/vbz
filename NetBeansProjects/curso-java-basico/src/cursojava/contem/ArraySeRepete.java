package cursojava.contem;

import java.util.Arrays;
import java.util.Random;

public class ArraySeRepete {

    public static void main(String[] args) {
        Random r = new Random();

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }

        Arrays.sort(array);

        for (int i : array) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.println("O elemento " + array[i] + " se repete");
            }
        }
    }

}
