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
                "INSERT INTO produto (id, descricao, preco, validade) " +
                        "VALUES (?,?,?,?)");
        stmt.setInt(1, produto.getId());
        stmt.setString(2, produto.getDescricao());
        stmt.setFloat(3, produto.getPreco());
        stmt.setDate(4, Date.valueOf(produto.getValidade()));
        return stmt.executeUpdate()>0;
    }

}
