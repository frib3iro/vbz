package cursojava.aula19.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer19 {

    // Ler as duas notas bimestrais para um conjunto de 10 alunos.
    // Armazenar as notas informadas em dois vetores "Nota1" e "Nota2" do
    // tipo real. Escreva um programa que calcule a média aritmética simples
    // das notas informadas armazenando o resultado em um vetor "Result"
    // de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
    // de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
    // estará "aprovado", caso contrário, a situação do aluno será "reprovado".
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int bimestre = 10;
        int[] alunos = new int[10];
        double[] nota1 = new double[bimestre];
        double[] nota2 = new double[bimestre];
        double[] resultado = new double[bimestre];

        // Gerador das notas
        for (int i = 0; i < bimestre; i++) {
            nota1[i] = r.nextDouble() * 10;
            nota2[i] = r.nextDouble() * 10;
        }

        // Notas 1
        System.out.print("Nota1: ");
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("[%.2f] ", nota1[i]);
        }

        System.out.println();

        // Notas 2
        System.out.print("Nota2: ");
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("[%.2f] ", nota2[i]);
        }

        // Calcula media
        for (int i = 0; i < alunos.length; i++) {
            resultado[i] = (nota1[i] + nota2[i]) / 2;
        }
        System.out.println();
        System.out.println();
        // Mostrar resultado
        for (int i = 0; i < alunos.length; i++) {
            if (resultado[i] < 7.0) {
                System.out.printf("Resultado do aluno %d é reprovado: %.2f \n", i + 1, resultado[i]);
            } else {
                System.out.printf("Resultado do aluno %d é aprovado: %.2f \n", i + 1, resultado[i]);
            }
        }

        System.out.println();
        scan.close();
    }
}
