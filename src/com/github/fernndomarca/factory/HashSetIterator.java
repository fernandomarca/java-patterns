package com.github.fernndomarca.factory;

import java.util.Collection;
import java.util.Iterator;

public class HashSetIterator {

  public void removerItensInvalidos(Collection<ItemPedido> itens) {
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
