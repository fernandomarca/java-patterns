package com.github.fernndomarca.abstractFactory.RegistraCliente;

public class RegistrarClienteDecoderXML implements RegistrarClienteDecoder {

  @Override
  public MsgRegistrarCliente decode(String msg) {
    return new MsgRegistrarCliente("Cliente-XML-Registrado " + msg);
  }

}
