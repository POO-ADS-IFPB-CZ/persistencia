package dao;

import model.Produto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDaoBanco {

    private Connection connection;

    public ProdutoDaoBanco() throws SQLException, IOException,
            ClassNotFoundException {
        connection = new ConnectionFactory().getConnection();
    }

    public boolean adicionarProduto(Produto produto) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
                "INSERT INTO produto (descricao, preco, validade) " +
                        "VALUES (?,?,?)");
        stmt.setString(1, produto.getDescricao());
        stmt.setFloat(2, produto.getPreco());
        stmt.setDate(3, Date.valueOf(produto.getValidade()));
        return stmt.executeUpdate()>0;
    }

}
