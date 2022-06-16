package fabio.fogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Fogo {

    private static int larguraDoFogo = 20;
    private static int alturaDoFogo = 20;
    private static int paletaDeCores = 19;
    private int[] arrayDePixelsDoFogo;
    private int temporario = 0;
    private boolean debug = false;

    private static Color[] colorArray = {
        new Color(7, 7, 7), new Color(31, 7, 7), new Color(47, 15, 7),
        new Color(71, 15, 7), new Color(87, 23, 7), new Color(103, 31, 7),
        new Color(119, 31, 7), new Color(143, 39, 7), new Color(159, 47, 7), 
        new Color(175, 63, 7), new Color(191, 71, 7), new Color(199, 71, 7), 
        new Color(223, 79, 7), new Color(223, 87, 7), new Color(223, 87, 7),
        new Color(215, 95, 7), new Color(215, 95, 7), new Color(215, 103, 15),
        new Color(207, 111, 15), new Color(207, 119, 15), new Color(207, 127, 15), 
        new Color(207, 135, 23), new Color(207, 135, 23), new Color(199, 135, 23), 
        new Color(199, 143, 23), new Color(199, 151, 31), new Color(191, 159, 31), 
        new Color(191, 159, 31), new Color(191, 167, 39), new Color(191, 167, 39),
        new Color(191, 175, 47), new Color(183, 175, 47), new Color(183, 183, 47), 
        new Color(183, 183, 55), new Color(207, 207, 111), new Color(223, 223, 159), 
        new Color(239, 239, 199), new Color(255, 255, 255)};

    public Fogo() {
        criarEstruturaDados();
        mostrarEstruturaDoFogo();
        criarFonteDeFogo();
    }

    private void criarEstruturaDados() {
        arrayDePixelsDoFogo = new int[larguraDoFogo * alturaDoFogo];
        for (int i = 0; i < arrayDePixelsDoFogo.length; i++) {
            arrayDePixelsDoFogo[i] = 0;
        }
    }

    private void mostrarEstruturaDoFogo() {
        for (int linha = 0; linha < alturaDoFogo; linha++) {
            System.out.println("");
            for (int coluna = 0; coluna < larguraDoFogo; coluna++) {
                int indexPixel = coluna + (larguraDoFogo * linha);
                int intensidadeDeFogo = arrayDePixelsDoFogo[indexPixel];
                System.out.print(arrayDePixelsDoFogo[indexPixel] + "");
            }
        }
        System.out.println("\n-----------------------------------------------");
    }

    private void criarFonteDeFogo() {
        for (int coluna = 0; coluna < larguraDoFogo; coluna++) {
            int pixelFogoSobreposto = larguraDoFogo * alturaDoFogo;
            int indicePixel = (pixelFogoSobreposto - larguraDoFogo) + coluna;
            arrayDePixelsDoFogo[indicePixel] = paletaDeCores;
        }
    }

    private void calcularProoagacaoDoFogo() {
        for (int coluna = 0; coluna < larguraDoFogo; coluna++) {
            for (int linha = 0; linha < alturaDoFogo; linha++) {
                int indicePixelAtual = coluna + (larguraDoFogo * linha);
                atualizarIntensidadeDoFogo(indicePixelAtual);
            }
        }
        mostrarEstruturaDoFogo();
    }

    private void atualizarIntensidadeDoFogo(int indicePixelAtual) {
        Random r = new Random();
        int indicePixelAbaixo = indicePixelAtual + larguraDoFogo;
        if (indicePixelAbaixo >= alturaDoFogo * larguraDoFogo) {
            return;
        }
        int declinio = 1;
        //int declinio = r.nextInt(3) * 3;
        int intensidadePixelAbaixo = arrayDePixelsDoFogo[indicePixelAbaixo];
        int novaIntensidade = intensidadePixelAbaixo - declinio >= 0 ? indicePixelAbaixo - declinio : 0;
        arrayDePixelsDoFogo[indicePixelAtual] = novaIntensidade;

    }

    public void tick() {
        calcularProoagacaoDoFogo();
    }

    public void render(Graphics g) {
        g.setColor(new Color(0, 255, 0));
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Estrutura de dados = " + arrayDePixelsDoFogo.length, 20, 550);
        g.drawString("Estrutura de cores = " + colorArray.length, 20, 570);
        for (int y = 0; y < alturaDoFogo; y++) {
            for (int x = 0; x < larguraDoFogo; x++) {
                int posX = x * 22;
                int posY = y * 22;
                if (debug) {
                    g.drawString(" " + arrayDePixelsDoFogo[temporario], posX, posY);
                } else {
                    g.setColor(colorArray[arrayDePixelsDoFogo[temporario]]);
                    g.fillRect(posX, posY, 32, 32);
                }
                temporario++;
            }
        }
        temporario = 0;
    }

}
