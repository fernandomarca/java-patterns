package com.github.fernndomarca.builder;

public interface NotaBuilder {
  void gerarCabecalho(NotaNegociacao nota);

  void gerarItensNota(NotaNegociacao nota);

  void gerarSumario(NotaNegociacao nota);
}
