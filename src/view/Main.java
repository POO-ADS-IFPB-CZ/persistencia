package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("img/logo.png");
        JOptionPane.showMessageDialog(null,
                "Hello World", "Título",
                JOptionPane.WARNING_MESSAGE, icon);
    }
}