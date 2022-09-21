package com.github.fernndomarca.factory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetIterator {

  public void removerItensInvalidos(HashSet‹ItemPedido› itens) {
    // HashSetIterator‹ItemPedido› cursor = new HashSetIterator(itens);
    Iterator<ItemPedido> cursor = itens.iterator();
    
      while (cursor.hasNext()) {
        ItemPedido item = cursor.next();
        if (! isValido(item)) {
          cursor.remove(item);
        }
    }
  }

  private boolean isValido(ItemPedido item) {
    return item.getQuantidade() > 0 && item.getQuantidade() < 100;
  }

}
