package arrays;

public class ArrayComFor {

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
        for (int n = 0; n < a.length; n++) {
            System.out.println(a[n]);
        }
        System.out.println("-");
        
//        Exibindo dados do array a
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("-");
        
//        Exibindo dados do array a e b
        for (int z = 0; z < a.length; z++) {
            System.out.println(a[z] + " " + b[z]);
        }
        System.out.println("-");
    }

}
