package javaoo;

public class Main {

    public static void main(String[] args) {
        int x = 20;
        int y = 45;

        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("O numero é: " + i);
                System.out.println("Achei um número divisível por 19 entre x e y");
                break;
            }
        }

    }

}
