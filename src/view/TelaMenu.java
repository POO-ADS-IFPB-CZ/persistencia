package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenu extends JFrame {
    private JPanel contentPane;
    private JButton produtosButton;
    private JButton clientesButton;
    private JButton vendasButton;
    private JButton buttonOK;

    public TelaMenu() {
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("img/supermercado.png");
        setIconImage(icon.getImage());
        setTitle("Supermercado POO");
        setSize(600,600);
        setResizable(false);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonOK);
        produtosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastroProduto cadastroProduto = new TelaCadastroProduto();
                dispose();
                cadastroProduto.pack();
                cadastroProduto.setLocationRelativeTo(null);
                cadastroProduto.setVisible(true);
                setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        TelaMenu dialog = new TelaMenu();
//        dialog.pack();
        dialog.setVisible(true);
    }
}
