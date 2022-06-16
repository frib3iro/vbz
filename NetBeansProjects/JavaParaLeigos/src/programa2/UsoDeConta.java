package programa2;

public class UsoDeConta {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.setNome("Barry Burd");
        minhaConta.setEndereco("Rua ciberespaço 222");
        minhaConta.setSaldo(24.02);

        suaConta.setNome("");
        suaConta.setEndereco("Rua do consumidor 111");
        suaConta.setSaldo(55.63);

        minhaConta.display();
        System.out.print(" e mais $");
        System.out.print(minhaConta.getJuros(5.00));
        System.out.print(" de juros ");

        System.out.println();

        suaConta.display();
        double suaTaxaJuros = 7.00;
        System.out.print(" e mais $");
        double seuValorJuros = suaConta.getJuros(suaTaxaJuros);
        System.out.print(seuValorJuros);
        System.out.print(" de juros ");

        System.out.println();
    }
}
