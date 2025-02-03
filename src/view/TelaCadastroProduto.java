package view;

import model.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TelaCadastroProduto extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel label1;
    private JTextField campoCodigo;
    private JTextField campoDescricao;
    private JTextField campoPreco;
    private JTextField campoValidade;

    public TelaCadastroProduto() {
        setContentPane(contentPane);
        setModal(true);
        setTitle("Cadastro de Produtos");
        ImageIcon icon = new ImageIcon("img/supermercado.png");
        setIconImage(icon.getImage());
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoString = campoCodigo.getText();
                int codigo = Integer.parseInt(codigoString);
                String descricao = campoDescricao.getText();
                String precoString = campoPreco.getText();
                float preco = Float.parseFloat(precoString);
                String validadeString = campoValidade.getText();
                LocalDate validade = LocalDate.parse(validadeString);

                Produto produto = new Produto(codigo, descricao, preco,
                        validade);
                System.out.println(produto);

            }
        });
    }

    public static void main(String[] args) {
        TelaCadastroProduto dialog = new TelaCadastroProduto();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        ImageIcon icon = new ImageIcon("img/supermercado.png");
        label1 = new JLabel();
        label1.setIcon(icon);

        buttonOK = new JButton();
        ImageIcon icon2 = new ImageIcon("img/salvar.png");
        buttonOK.setIcon(icon2);

        buttonCancel = new JButton();
        ImageIcon icon3 = new ImageIcon("img/lixeira.png");
        buttonCancel.setIcon(icon3);
    }
}
