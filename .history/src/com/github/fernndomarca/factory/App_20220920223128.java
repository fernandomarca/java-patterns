package com.github.fernndomarca.factory;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Action action = new Action();
        //
        Produto produto1 = new Produto("produto1");
        //
        ItemPedido itemPedido1 = new ItemPedido(produto1, 1, 10);
        //
        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(itemPedido1);
        //
        action.removerItensInvalidos(itens);
        //
        itens.forEach(System.out.println(itens.get(0).getProduto().getName()));
        // System.out.println(itens.get(0).getProduto().getName());
    }
}
