package com.github.fernndomarca.factory;

public class App {
    public static void main(String[] args) {
        Action action = new Action();
        //
        Produto produto1 = new Produto("produto1");
        //
        ItemPedido itemPedido1 = new ItemPedido(produto1, 1, 10);
        //
        action.removerItensInvalidos(itemPedido1);
    }
}
