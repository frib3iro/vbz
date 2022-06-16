package arrays;

public class ArraysDeUmaDimensao {

    public static void main(String[] args) {

        String[] a;
        String b[];

        a = new String[5];
        b = new String[5];

//        Carregando dados no array a
        a[0] = "João";
        a[1] = "Maria";
        a[2] = "Marcos";
        a[3] = "Clara";
        a[4] = "Rogério";

//        Carregando dados no array b
        b[0] = "Silva";
        b[1] = "Fernando";
        b[2] = "Pereira";
        b[3] = "Lins";
        b[4] = "Gomes";

//        Exibindo dados do array a
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println("-");

//        Exibindo dados do array b
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println("-");
    }

}
