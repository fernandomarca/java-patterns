package com.github.fernndomarca.factory;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Action action = new Action();
        //
        Produto produto1 = new Produto("produto1");
        Produto produto2 = new Produto("produto2");
        //
        ItemPedido itemPedido1 = new ItemPedido(produto1, 1, 10);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 0, 15);
        //
        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(itemPedido1);
        //
        action.removerItensInvalidos(itens);
        //
        // itens.forEach(System.out::println);
        // System.out.println(itens.get(0).getProduto().getName());
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getName());
        }
    }
}
