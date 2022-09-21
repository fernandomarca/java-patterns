package com.github.fernndomarca.abstractFactory.Factories;

import com.github.fernndomarca.abstractFactory.RegistraCliente.RegistrarClienteDecoder;
import com.github.fernndomarca.abstractFactory.RegistraCliente.RegistrarClienteDecoderXML;
import com.github.fernndomarca.abstractFactory.RegistraConta.RegistrarContaDecoder;
import com.github.fernndomarca.abstractFactory.RegistraConta.RegistrarContaXMLDecoder;

public class XMLDecoderFactory extends DecoderFactory {

  @Override
  public RegistrarClienteDecoder createRegistrarClienteDecoder() {
    return new RegistrarClienteDecoderXML();
  }

  @Override
  public RegistrarContaDecoder createRegistrarContaDecoder() {
    return new RegistrarContaXMLDecoder();
  }
}
