package cursojava.contem;

public class SimpleTesting02 {

    public static void main(String[] args) {
        
        int[] array = {10, 25, 23, 14, 85, 65};
        int key = 10;
        boolean val = contains(array, key);
        System.out.println("O número " + key + " está no array? \n" + val);
    }

    public static boolean contains(final int[] array, final int key) {
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true;
                break;
            }
        }
        return found;
    }

}
