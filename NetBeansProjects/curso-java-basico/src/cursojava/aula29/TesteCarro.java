package cursojava.aula29;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Especificações da van:");
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println();
        
        van.exibirAutonomia();
        System.out.println();
        
        System.out.println("A autonomia é: " + van.obterAutonomia() + " km");
        System.out.println();
        
        double qtdCombustivle = van.calcularCombustivel(10);
        System.out.println("Quantidade de combustivel: " + qtdCombustivle);
    }
}
