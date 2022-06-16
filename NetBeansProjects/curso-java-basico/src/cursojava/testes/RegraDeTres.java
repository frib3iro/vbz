package cursojava.testes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegraDeTres {

    public static void main(String[] args) {

        // Objetos
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        // Variaveis
        double x, y, valor;

        // Entrada
        System.out.println("Regra de 3");
        System.out.println("x% de y = valor");
        System.out.print("Digite o valor de x: ");
        x = scan.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = scan.nextDouble();

        // Processamento
        valor = (x * y) / 100;

        // Saida
        System.out.println(x + "% de " + y + " = " + formatador.format(valor));

        scan.close();

    }

}
