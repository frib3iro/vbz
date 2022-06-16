package programa2;

public class Conta {

    private String nome;
    private String endereco;
    private double saldo;

    public double getJuros(double taxapercentual) {
        return saldo * taxapercentual / 100.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void display() {
        System.out.print(nome);
        System.out.print(" (");
        System.out.print(endereco);
        System.out.print(") tem $");
        System.out.print(saldo);
    }

}
