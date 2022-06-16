package programa;

import javax.swing.JFrame;

public class MostreUmFrame {

    public static void main(String[] args) {
        
        JFrame meuFrame = new JFrame();
//      String meuTitulo = "Frame em Branco";
        
        meuFrame.setTitle("Frame em Branco");
        meuFrame.setSize(300, 200);
        meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meuFrame.setVisible(true);
    }

}
