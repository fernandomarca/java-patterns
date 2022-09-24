package com.github.fernndomarca.adapter;

import java.math.BigDecimal;

public class ServicoPagamento {
  // o parâmetro BrokerPagamento é um objeto (adapter) que implementa a interface
  // genérica
  // BrokerPagamento
  public void pagarCartaoCredito(BrokerPagamento broker, CartaoCredito cartao,
      BigDecimal valor) {
    broker.pagarCartaoCredito(cartao, valor);
  }
}
