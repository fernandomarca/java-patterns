package com.github.fernndomarca.abstractFactory.Factories;

import com.github.fernndomarca.abstractFactory.RegistraCliente.RegistrarClienteDecoder;
import com.github.fernndomarca.abstractFactory.RegistraConta.RegistrarContaDecoder;

public abstract class DecoderFactory {
  public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();

  public abstract RegistrarContaDecoder createRegistrarContaDecoder();

  public static DecoderFactory fabricaParaOrigem(String origem) throws Exception {
    switch (origem) {
      case "X":
        return new XMLDecoderFactory();
      case "Y":
        return new CSVDecoderFactory();
      default:
        throw new Exception("origem inválida");
    }
  }
}