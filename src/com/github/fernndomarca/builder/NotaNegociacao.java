package com.github.fernndomarca.builder;

public class NotaNegociacao {
  private String cabecalho;
  private String[] itens;
  private String sumario;

  NotaNegociacao(String cabecalho, String[] itens, String sumario) {
    this.cabecalho = cabecalho;
    this.itens = itens;
    this.sumario = sumario;
  }

  public String getCabecalho() {
    return this.cabecalho;
  }

  public String[] getItens() {
    return this.itens;
  }

  public String getSumario() {
    return this.sumario;
  }

}
