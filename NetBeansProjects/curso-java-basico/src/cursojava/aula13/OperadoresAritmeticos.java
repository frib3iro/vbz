package cursojava.aula13;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        int i = 3;

        System.out.println("Saida 0: " + i);
        i++;

        System.out.println("Saida 1: " + i);
        ++i;

        System.out.println("Saida 2: " + i);
        System.out.println("Saida 3: " + ++i);
        System.out.println("Saida 4: " + i++);
        System.out.println("Saida 5: " + i);

        System.out.println("---------------------------------");
        
        int j = 3;

        System.out.println("Saida 0: " + j);
        i--;

        System.out.println("Saida 1: " + j);
        --i;

        System.out.println("Saida 2: " + j);
        System.out.println("Saida 3: " + --j);
        System.out.println("Saida 4: " + j--);
        System.out.println("Saida 5: " + j);

    }
}