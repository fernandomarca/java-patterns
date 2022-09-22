package com.github.fernndomarca.builder;

public class ComandoExportarNotaPDF {
  public NotaPDF executar(NotaNegociacao nota) {
    NotaPDFBuilder builder = new NotaPDFBuilder();
    ExportadorNota diretor = new ExportadorNota(builder);
    diretor.exportarNota(nota);
    return builder.obterNotaPDF();
  }
}
