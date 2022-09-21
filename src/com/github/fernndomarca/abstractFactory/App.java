package com.github.fernndomarca.abstractFactory;

public class App {
  public static void main(String[] args) throws Exception {
    ServicoIntegracao servicoIntegracao = new ServicoIntegracao();
    servicoIntegracao.registrarCliente("1", "X");
    servicoIntegracao.registrarCliente("1", "Y");
    servicoIntegracao.registrarConta("1", "X");
    servicoIntegracao.registrarConta("1", "Y");

  }
}
