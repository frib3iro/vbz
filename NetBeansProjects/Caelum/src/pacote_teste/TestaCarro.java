package pacote_teste;

public class TestaCarro {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.VelocidadeMaxima = 80;

        // liga carro
        meuCarro.liga();

        // acelera o carro
        meuCarro.acelera(20);

        System.out.println(meuCarro.velocidadeAtual);
    }
}
