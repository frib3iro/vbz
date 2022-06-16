package cursojava.contem;

import java.util.Arrays;
import java.util.List;

public class ListaContem {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};

        List<Integer> lista = Arrays.asList(array);

        System.out.println("3 está no array? = " + (lista.contains(3)));
        System.out.println("5 está no array? = " + (lista.contains(5)));
        System.out.println("6 está no array? = " + (lista.contains(6)));

    }
}
