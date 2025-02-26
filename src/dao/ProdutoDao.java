package dao;

import model.Produto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

public interface ProdutoDao {

    boolean adicionarProduto(Produto produto) throws SQLException, IOException, ClassNotFoundException;
    boolean atualizar(Produto produto) throws SQLException, IOException, ClassNotFoundException;
    boolean removerProduto(Produto produto) throws SQLException, IOException, ClassNotFoundException;
    Set<Produto> getProdutos() throws SQLException, IOException, ClassNotFoundException;

}
