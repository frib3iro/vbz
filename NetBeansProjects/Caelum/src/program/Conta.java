package program;

public class Conta {

    int numero;
    private double saldo;
    Cliente titular = new Cliente();

    public double pegaSaldo(){
        return this.saldo;
    }
    
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}
