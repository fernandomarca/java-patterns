package com.github.fernndomarca.adapter;

import java.math.BigDecimal;

public class BrokerABCAdapter implements BrokerPagamento {

  @Override
  public void pagarCartaoCredito(CartaoCredito cartao, BigDecimal valor) {
    ABCPagamentos brokerPagamento = new ABCPagamentos();
    brokerPagamento.pagarEmCartaoCredito(cartao.numero(), cartao.nome(),
        cartao.cvv(), cartao.validade(), valor);
  }
}