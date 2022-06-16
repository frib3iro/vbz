package cursojava.aula98;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TesteBigDecimal {

    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        
        System.out.println("Com uso de double");
        System.out.println(c);
        
        linha();
        
        System.out.println("Com uso de BigDecimal");
        BigDecimal vala = new BigDecimal("0.03");
        BigDecimal valb = new BigDecimal("0.04");
        BigDecimal valc = valb.subtract(vala);
        System.out.println(valc);
        
        linha();
        
        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");
        System.out.println(bd1.add(bd2));
        
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(new BigDecimal(2)));
        
        linha();
        
        BigInteger bi = new BigInteger("1000000000000000000000");
        System.out.println(bi);
        
    }
    
    public static void linha(){
        System.out.println("-------------------------------------------------");
    }

}
