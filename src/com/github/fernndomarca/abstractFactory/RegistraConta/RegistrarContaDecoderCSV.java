package com.github.fernndomarca.abstractFactory.RegistraConta;

public class RegistrarContaDecoderCSV implements RegistrarContaDecoder {

  @Override
  public MsgRegistrarConta decode(String msg) {
    return new MsgRegistrarConta("Conta-registrada-CSV " + msg);
  }

}
