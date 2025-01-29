package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("img/logo.png");
        String tipos[] = {"Alimentício", "Limpeza", "Higiene"};
        int retorno = JOptionPane.showOptionDialog(
                null, "Selecione a opção",
                "Escolha", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon,
                tipos, tipos[0]
                );
        System.out.println(retorno);
    }
}