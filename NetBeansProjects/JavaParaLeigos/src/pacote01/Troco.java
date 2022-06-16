package pacote01;

import static java.lang.System.out;

public class Troco {

    public static void main(String[] args) {
        
        int total = 248;
        int quartos = total / 25;
        int oqueSobra = total % 25;
        
        int dezcentavos = oqueSobra / 10;
        oqueSobra = oqueSobra % 10;
        
        int cincocentavos = oqueSobra /5;
        oqueSobra = oqueSobra % 5;
        
        int centavos = oqueSobra;
        
        out.println("De " + total + " centavos obtidos");
        out.println(quartos + " quartos");
        out.println(dezcentavos + " dezcentavos");
        out.println(cincocentavos + " cincocentavos");
        out.println(centavos + " centavos");
        
    }
}
