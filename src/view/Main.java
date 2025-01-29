package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("img/logo.png");
        String tipos[] = {"Alimentício", "Limpeza", "Higiene"};
        String retorno = (String) JOptionPane.showInputDialog(
                null, "Escolha o tipo do produto",
                "Entrada de dados",
                JOptionPane.WARNING_MESSAGE, icon,
                tipos, tipos[0]);
        System.out.println(retorno);
    }
}