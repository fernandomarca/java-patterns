package com.github.fernndomarca.factory;

import java.util.ArrayList;
import java.util.*;

public class Action {

  public void removerItensInvalidos(ArrayList<ItemPedido> itens) {
    // ArrayIterator‹ItemPedido› cursor = new ArrayIterator(itens);
    Iterator<ItemPedido> cursor = itens.iterator();

    while (cursor.hasNext()) {
      ItemPedido item = cursor.next();
      if (!isValido(item)) {
        cursor.remove();
      }
    }
  }

  public boolean isValido(ItemPedido item) {

    boolean expr = item.getQuantidade() > 0 && item.getQuantidade() < 100;

    return expr;

  }

}
