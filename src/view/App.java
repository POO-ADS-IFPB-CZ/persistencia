package view;

import model.Produto;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(1, "Arroz", 5.5f,
                LocalDate.of(2025,10,6)));
        produtos.add(new Produto(2, "Feijão", 8.5f,
                LocalDate.of(2025,12,10)));
        produtos.add(new Produto(3, "Picanha", 60f,
                LocalDate.of(2025,5,9)));
        produtos.add(new Produto(4, "Tomate", 5,
                LocalDate.of(2025, 3,1)));

        //Aplicar desconto de 50% em produtos a 30 dias da validade
        System.out.println(
                produtos.stream().filter(p->
                        ChronoUnit.DAYS.between(LocalDate.now(),
                        p.getValidade())<30).count()
        );

    }

}
