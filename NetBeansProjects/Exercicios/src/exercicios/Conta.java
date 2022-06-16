package exercicios;

public class Conta {

    private String titular;
    String agencia;
    Data dataDeAbertura;
    int numero;
    private double saldo;

    void saca(double valor) {
        // o que fazer aqui dentro?
        this.saldo -= valor;
    }

    void deposita(double valor) {
        // o que fazer aqui dentro?
        this.saldo += valor;
    }

    double calculaRendimento() {
        // o que fazer aqui dentro?
        return this.saldo *= 0.1;
    }

    String recuperaDadosParaImpressao() {
        System.out.println("--");
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\n Data de abertura: " + this.dataDeAbertura.dia;
        dados += "\n Data de abertura: " + this.dataDeAbertura.mes;
        dados += "\n Data de abertura: " + this.dataDeAbertura.ano;
        return dados;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

}
