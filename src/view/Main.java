package view;

import dao.ProdutoDao;
import model.Produto;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ProdutoDao dao = new ProdutoDao();

        try {
//            dao.adicionarProduto(new Produto(2, "Café",
//                    20f, LocalDate.of(2025,
//                    10,8)));
            System.out.println(dao.getProdutos());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}