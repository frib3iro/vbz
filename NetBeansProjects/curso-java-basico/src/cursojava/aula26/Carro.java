package cursojava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Metodo sem retorno
    void exibirAutonomia() {
        System.out.println("A autonomia é: " + capCombustivel * consumoCombustivel + " km");
    }

    // Metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

}
