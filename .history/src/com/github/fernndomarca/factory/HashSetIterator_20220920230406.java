package com.github.fernndomarca.factory;

import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {

  public void removerItensInvalidos(Set<ItemPedido> itens) {
    Iterator<ItemPedido> cursor = itens.iterator();

    while (cursor.hasNext()) {
      ItemPedido item = cursor.next();
      if (!isValido(item)) {
        cursor.remove();
      }
    }
  }

  private boolean isValido(ItemPedido item) {
    return item.getQuantidade() > 0 && item.getQuantidade() < 100;
  }

}
