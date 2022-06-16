package exercicios;

public class ClasseTeste {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        
        c1.setTitular("Hugo");
        c1.setNumero(123);
        c1.setAgencia("45678-9");
        c1. = 50.0;
        c1.dataDeAbertura.dia = 10;
        c1.dataDeAbertura.mes = 5;
        c1.dataDeAbertura.ano = 2020;
        
        c1.deposita(1000.0);
        System.out.println("Saldo atual: " + c1.saldo);
        
        c1.saca(300.0);
        System.out.println("Saldo atual: " + c1.saldo);
        
        System.out.println("Rendimento mensal: " + c1.calculaRendimento());
        
        System.out.println(c1.recuperaDadosParaImpressao());
    }

}
