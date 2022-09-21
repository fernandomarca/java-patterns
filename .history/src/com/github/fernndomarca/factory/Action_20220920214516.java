package com.github.fernndomarca.factory;

import java.util.ArrayList;
import java.util.*;

public class Action {

  public void removerItensInvalidos(ArrayList itens) {
    ArrayIterator cursor = itens.iterator();

    while (cursor.hasNext()) {
      ItemPedido item = cursor.next();
      if (!isValido(item)) {
        cursor.remove(item);
      }
    }
  }

  public boolean isValido(ItemPedido item) {
    return (item.getQuantidade() › 0 && item.getQuantidade() ‹ 100);
  }

}