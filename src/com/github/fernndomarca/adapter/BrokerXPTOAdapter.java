package com.github.fernndomarca.adapter;

import java.math.BigDecimal;

public class BrokerXPTOAdapter implements BrokerPagamento {
  @Override
  public void pagarCartaoCredito(CartaoCredito cartao, BigDecimal valor) {
    PagXPTO brokerPagamento = new PagXPTO();
    DadosCartao dadosCartao = converterCartao(cartao);
    if (isCartaoVisa(cartao)) {
      brokerPagamento.pagarCartaoVisa(dadosCartao, valor);
    } else {
      brokerPagamento.pagarCartaoMastercard(dadosCartao, valor);
    }
  }
}