package com.github.fernndomarca.builder.NoBuilder;

import com.github.fernndomarca.builder.NotaNegociacao;

public class ExportadorNota {

  public byte[] exportarNota(NotaNegociacao nota, String formato) {
    if ("XML".equals(formato))
      return gerarNotaXML(nota);
    else if ("PDF".equals(formato))
      return gerarNotaPDF(nota);
    else if ("XLS".equals(formato))
      return gerarNotaXLS(nota);
    else
      return new byte[0];
  }

  private byte[] gerarNotaXML(NotaNegociacao nota) {
    // construir cabeçalho em XML
    // listar os itens da nota em XML
    // gerar sumário em XML
    // retornar conteúdo da nota no formato XML
    return "notaXML".getBytes();
  }

  private byte[] gerarNotaPDF(NotaNegociacao nota) {
    // construir cabeçalho em PDF
    // listar os itens da nota em PDF
    // gerar sumário em PDF
    // retornar conteúdo da nota no formato PDF
    return "notaPDF".getBytes();
  }

  private byte[] gerarNotaXLS(NotaNegociacao nota) {
    // construir cabeçalho em XLS
    // listar os itens da nota em XLS
    // gerar sumário em XLS
    // retornar conteúdo da nota no formato XLS
    return "notaXLS".getBytes();
  }
}
