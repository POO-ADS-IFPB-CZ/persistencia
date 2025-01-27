package dao;

import model.Produto;

import java.io.*;
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

    public boolean adicionarProduto(Produto produto) throws IOException,
            ClassNotFoundException {
        Set<Produto> produtos = getProdutos();
        if(produtos.add(produto)){
            try(ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))){
                out.writeObject(produtos);
            }
        }
        return false;
    }

    public boolean removerProduto(Produto produto) throws IOException,
            ClassNotFoundException {
        Set<Produto> produtos = getProdutos();
        if(produtos.remove(produto)){
            try(ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))){
                out.writeObject(produtos);
            }
        }
        return false;
    }

    public Set<Produto> getProdutos() throws IOException,
            ClassNotFoundException {
        if(arquivo.length()==0){
            return new HashSet<>();
        }
        try(ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(arquivo))){
            return (Set<Produto>) in.readObject();
        }
    }

}
