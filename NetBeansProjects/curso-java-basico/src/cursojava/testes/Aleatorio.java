package cursojava.testes;

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {

        Random r = new Random();
        int valor = 0;

        System.out.println("Nomero gerado: ");
        System.out.println();
        
        for (int i = 0; i < 30; i++) {
            valor = r.nextInt(60) + 18;
            System.out.print(valor + " ");
        }
        
        System.out.println();
        System.out.println();

    }
}
