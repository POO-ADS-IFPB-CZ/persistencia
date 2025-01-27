package dao;

import model.Produto;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ProdutoDao {

    private File arquivo;

    public ProdutoDao() {
        arquivo = new File("Produtos");
        if(!arquivo.exists()){
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean adicionarProduto(Produto produto){
        return produtos.add(produto);
    }

    public Set<Produto> getProdutos(){
        return produtos;
    }

}
