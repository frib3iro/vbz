package cursojava.contem;

import java.util.Arrays;

public class SimpleTesting {

    public static void main(String[] args) {
        int[] arr = {10, 25, 23, 14, 85, 65};
        int key = 14;
        boolean val = contains(arr, key);
        System.out.println("Array contains " + key + "? \n" + val);
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

}
