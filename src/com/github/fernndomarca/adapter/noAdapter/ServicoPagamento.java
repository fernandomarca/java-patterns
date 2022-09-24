package com.github.fernndomarca.adapter.noAdapter;

import java.math.BigDecimal;

import com.github.fernndomarca.adapter.CartaoCredito;
import com.github.fernndomarca.adapter.DadosCartao;

public class ServicoPagamento {
  // o parâmetro nomeBroker define a API a ser chamada: XPTO ou ABC
  public void pagarCartaoCredito(String nomeBroker, CartaoCredito cartao, BigDecimal valor) {
    if ("XPTO".equals(nomeBroker)) {
      pagarCartaoXPTO(cartao, valor);
    } else if ("ABC".equals(nomeBroker)) {
      pagarCartaoABC(cartao, valor);
    }
  }

  // chamada à API de pagamento do fornecedor XPTO
  private void pagarCartaoXPTO(CartaoCredito cartao, BigDecimal valor) {
    PagXPTO brokerPagamento = new PagXPTO();
    // converte o parâmetro cartao para a estrutura requerida pela API
    DadosCartao dadosCartao = converterCartao(cartao);
    // com base no número do cartão, define a função da API a ser chamada
    if (isCartaoVisa(cartao)) {
      brokerPagamento.pagarCartaoVisa(dadosCartao, valor);
    } else {
      brokerPagamento.pagarCartaoMastercard(dadosCartao, valor);
    }
  }

  // chamada à API de pagamento do fornecedor ABC
  private void pagarCartaoABC(CartaoCredito cartao, BigDecimal valor) {
    ABCPagamentos brokerPagamento = new ABCPagamentos();
    brokerPagamento.pagarEmCartaoCredito(cartao.numero(), cartao.nome(),
        cartao.cvv(), cartao.validade(), valor);
  }
}