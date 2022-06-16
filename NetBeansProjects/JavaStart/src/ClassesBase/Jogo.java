package ClassesBase;

import java.util.Random;

public class Jogo {

    // atributos
    private int aposta;
    private int resultado;

    // metodos getters
    public void setAposta(int aposta) {
        if (aposta > 6 || aposta < 1) {
            System.out.println("APOSTA INVÁLIDA!");
        }
        this.aposta = aposta;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    // métodos
    public void executaJogo() {
        Random rnd = new Random();
        this.resultado = rnd.nextInt(6) + 1;
    }

    public void executaJogo(int aposta) {
        this.aposta = aposta;
        this.executaJogo();
    }

    public void mostraResultado() {
        System.out.println("Sua aposta: " + aposta + " Resultado: " + resultado);
        if (this.resultado == this.aposta) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Errou. Mas, continue tentando...");
        }
    }

}
