package com.github.fernndomarca.abstractFactory.RegistraCliente;

public interface RegistrarClienteDecoder {
  MsgRegistrarCliente decode(String msg);
}
