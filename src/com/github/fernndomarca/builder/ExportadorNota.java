package com.github.fernndomarca.builder;

public class ExportadorNota {

  private NotaBuilder builder;

  public ExportadorNota(NotaBuilder builder) {
    this.builder = builder;
  }

  public void exportarNota(NotaNegociacao nota) {
    builder.gerarCabecalho(nota);
    builder.gerarItensNota(nota);
    builder.gerarSumario(nota);
  }
}