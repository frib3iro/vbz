package cursojava.aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Metodo sem retorno
    void exibirAutonomia() {
        System.out.println("Metodo sem retorno.");
        System.out.println("A autonomia é: " + capCombustivel * consumoCombustivel + " km");
    }

    // Metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo com retorno.");
        return capCombustivel * consumoCombustivel;
    }
    
    // Metodo com parametro e retorno 
    double calcularCombustivel(double km){
        System.out.println("Metodo com parametro e retorno.");
        return km / consumoCombustivel;
    } 

}
