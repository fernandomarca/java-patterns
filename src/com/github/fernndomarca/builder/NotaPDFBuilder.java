package com.github.fernndomarca.builder;

public class NotaPDFBuilder implements NotaBuilder {

  private String cabecalho;
  private String itens;
  private String sumario;

  @Override
  public void gerarCabecalho(NotaNegociacao nota) {
    this.cabecalho = "<PDF-CABECALHO> " + nota.getCabecalho() + " <PDF-CABECALHO>";
  }

  @Override
  public void gerarItensNota(NotaNegociacao nota) {
    StringBuilder bld = new StringBuilder();
    for (String item : nota.getItens()) {
      bld.append("<PDF-ITEM> " + item + " <PDF-ITEM> \n");
    }
    this.itens = bld.toString();
  }

  @Override
  public void gerarSumario(NotaNegociacao nota) {
    this.sumario = "<PDF-SUMARIO> " + nota.getSumario() + " <PDF-SUMARIO>";
  }

  public NotaPDF obterNotaPDF() {
    NotaPDF nota = new NotaPDF();
    nota.setCabecalho(this.cabecalho);
    nota.setItens(this.itens);
    nota.setSumario(this.sumario);
    return nota;
  }

}
