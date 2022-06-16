package cursojava.testes;

// import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    
    public static void main(String[] args) {        
        Random r = new Random();
        
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }
        
        //Arrays.sort(array);
        //Arrays.fill(array, 10);
        
        
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
