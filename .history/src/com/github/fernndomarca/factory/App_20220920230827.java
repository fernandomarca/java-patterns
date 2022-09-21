package com.github.fernndomarca.factory;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        ArrayIterator arrayIterator = new ArrayIterator();
        HashSetIterator hashSetIterator = new HashSetIterator();
        //
        Produto produto1 = new Produto("produto1");
        Produto produto2 = new Produto("produto2");
        //
        ItemPedido itemPedido1 = new ItemPedido(produto1, 1, 10);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 0, 15);
        //
        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(itemPedido1);
        itens.add(itemPedido2);
        //
        HashSet<ItemPedido> itensHash = new HashSet<>();
        itensHash.add(itemPedido1);
        itensHash.add(itemPedido2);
        //
        // System.out.println("antes de remover");
        // for (ItemPedido item : itens) {
        // System.out.println(item.getProduto().getName());
        // }
        //
        System.out.println("antes de remover");
        for (ItemPedido item : itensHash) {
            System.out.println(item.getProduto().getName());
        }
        //
        // arrayIterator.removerItensInvalidos(itens);
        hashSetIterator.removerItensInvalidos(itens);
        // itens.forEach(System.out::println);
        // System.out.println(itens.get(0).getProduto().getName());
        // System.out.println("depois de remover");
        // for (ItemPedido item : itens) {
        // System.out.println(item.getProduto().getName());
        // }
        System.out.println("depois de remover");
        for (ItemPedido item : itensHash) {
            System.out.println(item.getProduto().getName());
        }
    }
}
