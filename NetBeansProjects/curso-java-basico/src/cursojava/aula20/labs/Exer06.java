package cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

    // Faça um programa para jogar o jogo da velha. O programa deve
    // permitir que dois jogadores façam uma partida do jogo da velha,
    // usando o computador para ver o tabuleiro. Cada jogador vai
    // alternadamente informando a posição onde deseja colocar a sua
    // peça ('O' ou 'X'). O programa deve impedir jogadas inválidas e
    // determinar automaticamente quando o jogo terminou e quem foi o
    // vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
    // deve atualizar a situação do tabuleiro na tela.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char sinal;
        int jogada = 1;
        int linha = 0, coluna = 0;
        boolean ganhou = false;
        char[][] jogoVelha = new char[3][3];

        System.out.println("jogador 1 = x");
        System.out.println("jogador 2 = o");

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1");
                sinal = 'x';
            } else {
                System.out.println("Vez do jogador 2");
                sinal = 'o';

            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2, 3)");
                linha = s.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
        }

        s.close();
    }

}
