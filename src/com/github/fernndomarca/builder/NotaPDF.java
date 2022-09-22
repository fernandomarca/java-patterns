package com.github.fernndomarca.builder;

import java.text.MessageFormat;

public class NotaPDF {
  private String cabecalho;
  private String itens;
  private String sumario;

  public void setCabecalho(String cabecalho) {
    this.cabecalho = cabecalho;
  }

  public void setItens(String itens) {
    this.itens = itens;
  }

  public void setSumario(String sumario) {
    this.sumario = sumario;
  }

  public void print() {
    String view = MessageFormat.format(
        "<PDF> NOTA-PDF <PDF> \n {0} \n <ITENS> \n {1} <ITENS> \n {2} \n <PDF> NOTA-PDF <PDF> \n",
        this.cabecalho, this.itens, this.sumario);

    System.out.println(view);
  }

}
