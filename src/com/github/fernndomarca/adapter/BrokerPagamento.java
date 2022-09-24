package com.github.fernndomarca.adapter;

import java.math.BigDecimal;

public interface BrokerPagamento {
  void pagarCartaoCredito(CartaoCredito cartao, BigDecimal valor);
}
