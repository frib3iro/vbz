package pacote_teste;

public class Carro {

    String cor;
    String modelo;
    double velocidadeAtual;
    double VelocidadeMaxima;
    Motor motor;

    // liga o carro
    void liga() {
        System.out.println("O carro esta ligado");
    }

    // acelera uma quantidade
    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    // devolve a marcha do carro
    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}
