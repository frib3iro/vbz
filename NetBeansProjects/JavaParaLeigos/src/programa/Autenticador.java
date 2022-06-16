package programa;

import javax.swing.JOptionPane;

public class Autenticador {

    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Nome do " + " Usuário:");
        String password = JOptionPane.showInputDialog("senha:");

        if (username != null
                && password != null
                && ((username.equals("bburd")
                && password.equals("swordfish"))
                || (username.equals("hritter")
                && password.equals("preakston")))) {
            JOptionPane.showMessageDialog(null, "você está conectado.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é suspeito.");
        }
    }
}
