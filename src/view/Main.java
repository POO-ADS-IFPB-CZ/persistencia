package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("img/logo.png");
        int retorno = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?", "Escolha uma opção",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,
                null);
        switch (retorno) {
            case JOptionPane.OK_OPTION -> System.out.println("OK");
            case JOptionPane.CANCEL_OPTION -> System.out.println("Cancelou");
            case JOptionPane.CLOSED_OPTION -> System.out.println("Não escolheu nada");
        }
    }
}