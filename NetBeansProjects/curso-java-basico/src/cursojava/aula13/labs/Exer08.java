package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {        
        
        // Faça um Programa que pergunte quanto você ganha por hora e o
        // número de horas trabalhadas no mês. Calcule e mostre o total do seu
        // salário no referido mês.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite quanto ganha por hora: ");
        double porHora = scan.nextDouble();
        
        System.out.print("Digite a quantidade de horas trabalhadas nomes: ");
        double porMes = scan.nextDouble();
        
        double salario = porHora * porMes;
        
        System.out.println("O seu salário é: " + salario);
        scan.close();
    }
    
}
