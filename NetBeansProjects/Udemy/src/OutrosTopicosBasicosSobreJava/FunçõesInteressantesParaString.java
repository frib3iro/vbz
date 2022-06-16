package OutrosTopicosBasicosSobreJava;

public class FunçõesInteressantesParaString {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("tolowercase: -" + s01 + "-");
        System.out.println("touppercase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring: (2) -" + s04 + "-");
        System.out.println("substring: (2, 9) -" + s05 + "-");
        System.out.println("replace: ('a', 'x') -" + s06 + "-");
        System.out.println("replace: ('abc', 'xy') -" + s07 + "-");
        System.out.println("indexof: ('bc') " + i);
        System.out.println("lastindexof: ('bc') " + j);
        System.out.println("");

        String s08 = "potato apple lemon";

        String[] vet = s08.split(" ");

        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);

        String word1 = vet[0];
        String word2 = vet[1];
        String word3 = vet[2];

        System.out.println("");

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
