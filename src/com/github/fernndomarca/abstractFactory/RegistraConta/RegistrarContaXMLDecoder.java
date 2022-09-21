package com.github.fernndomarca.abstractFactory.RegistraConta;

public class RegistrarContaXMLDecoder implements RegistrarContaDecoder {

  @Override
  public MsgRegistrarConta decode(String msg) {
    return new MsgRegistrarConta("Conta-registrada-XML " + msg);
  }

}
