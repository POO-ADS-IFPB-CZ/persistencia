package dao;

import model.Produto;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ProdutoDaoBanco implements ProdutoDao {

    private Connection connection;

    public ProdutoDaoBanco(){
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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

    public Set<Produto> getProdutos() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
                "SELECT * FROM produto");
        ResultSet rs = stmt.executeQuery();
        Set<Produto> produtos = new HashSet<>();
        while (rs.next()){
            int id = rs.getInt("id");
            String descricao = rs.getString("descricao");
            float preco = rs.getFloat("preco");
            LocalDate validade = rs.getDate("validade")
                    .toLocalDate();
            Produto produto = new Produto(id, descricao, preco,
                    validade);
            produtos.add(produto);
        }
        return produtos;
    }

    public boolean removerProduto(Produto produto) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
                "DELETE FROM produto WHERE id = ?");
        stmt.setInt(1, produto.getId());
        return stmt.executeUpdate()>0;
    }

    public boolean atualizar(Produto produto) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
                "UPDATE produto SET descricao=?, preco=?, validade=? WHERE id=?");
        stmt.setString(1, produto.getDescricao());
        stmt.setFloat(2, produto.getPreco());
        stmt.setDate(3, Date.valueOf(produto.getValidade()));
        stmt.setInt(4, produto.getId());
        return stmt.executeUpdate()>0;
    }

}
