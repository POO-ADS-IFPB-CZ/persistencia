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

//            dao.removerProduto(new Produto(2, null,
//                    0, null));

            System.out.println(dao.getProdutos());
//            dao.atualizar(new Produto(2, "Cafe Santa Clara",
//                    15, LocalDate.of(2025,10,3)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}