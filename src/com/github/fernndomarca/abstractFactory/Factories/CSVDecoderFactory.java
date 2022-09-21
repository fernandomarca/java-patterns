package com.github.fernndomarca.abstractFactory.Factories;

import com.github.fernndomarca.abstractFactory.RegistraCliente.RegistrarClienteDecoder;
import com.github.fernndomarca.abstractFactory.RegistraCliente.RegistrarClienteDecoderCSV;
import com.github.fernndomarca.abstractFactory.RegistraConta.RegistrarContaDecoder;
import com.github.fernndomarca.abstractFactory.RegistraConta.RegistrarContaDecoderCSV;

public class CSVDecoderFactory extends DecoderFactory {

  @Override
  public RegistrarClienteDecoder createRegistrarClienteDecoder() {
    return new RegistrarClienteDecoderCSV();
  }

  @Override
  public RegistrarContaDecoder createRegistrarContaDecoder() {
    return new RegistrarContaDecoderCSV();
  }

}