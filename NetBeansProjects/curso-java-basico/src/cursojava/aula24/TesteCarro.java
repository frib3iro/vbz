package cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        Carro fusca = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println("Especificações da van:");
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println();
        
        System.out.println("Especificações do fusca:");
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
