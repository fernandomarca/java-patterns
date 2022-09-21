package com.github.fernndomarca.factory;

import java.util.Iterator;
import java.util.List;

public class ArrayIterator {

  public void removerItensInvalidos(List<ItemPedido> itens) {
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
