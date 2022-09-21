package com.github.fernndomarca.abstractFactory.RegistraCliente;

public class RegistrarClienteDecoderCSV implements RegistrarClienteDecoder {

  @Override
  public MsgRegistrarCliente decode(String msg) {
    return new MsgRegistrarCliente("Cliente-csv-Registrado " + msg);
  }

}
