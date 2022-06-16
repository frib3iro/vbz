package cursojava.testes;

import java.security.SecureRandom;
import java.util.Random;

public class TesteRandom {
    
    public static void main(String[] args) {        
        
        SecureRandom sr = new SecureRandom();
        Random r = new Random();
        
        int num = r.nextInt(10);
        int num2 = sr.nextInt(60);
        
        System.out.println("O numero Random é: " + num);
        System.out.println("O numero SecureRandom é: " + num2);
    }
}
