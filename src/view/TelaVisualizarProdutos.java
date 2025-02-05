package view;

import dao.ProdutoDao;
import model.Produto;

import javax.swing.*;
import java.io.IOException;
import java.util.Set;

public class TelaVisualizarProdutos extends JDialog {
    private JPanel contentPane;
    private JTable table1;
    private JButton buttonOK;

    public TelaVisualizarProdutos() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    private void createUIComponents() {
        ProdutoDao dao = new ProdutoDao();
        try {
            Set<Produto> produtos = dao.getProdutos();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
