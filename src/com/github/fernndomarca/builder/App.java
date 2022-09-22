package com.github.fernndomarca.builder;

public class App {
  public static void main(String[] args) {
    ComandoExportarNotaPDF comandoExportarNotaPDF = new ComandoExportarNotaPDF();

    String[] itens = { "item-1", "item-2" };

    NotaNegociacao notaNegociacao = new NotaNegociacao("Fake info - cabeçalho", itens, "Fake - sumário");

    NotaPDF notaPDF = comandoExportarNotaPDF.executar(notaNegociacao);

    notaPDF.print();
  }
}
