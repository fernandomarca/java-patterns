package com.github.fernndomarca.abstractFactory;

import com.github.fernndomarca.abstractFactory.Factories.DecoderFactory;
import com.github.fernndomarca.abstractFactory.RegistraCliente.MsgRegistrarCliente;
import com.github.fernndomarca.abstractFactory.RegistraCliente.RegistrarClienteDecoder;
import com.github.fernndomarca.abstractFactory.RegistraConta.MsgRegistrarConta;
import com.github.fernndomarca.abstractFactory.RegistraConta.RegistrarContaDecoder;

public class ServicoIntegracao {

  public void registrarCliente(String textoMsg, String origem) throws Exception {
    DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
    RegistrarClienteDecoder msgDecoder = decoderFactory.createRegistrarClienteDecoder();
    MsgRegistrarCliente msg = msgDecoder.decode(textoMsg);
    System.out.println(msg.getMsg());
  }

  public void registrarConta(String textoMsg, String origem) throws Exception {
    DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
    RegistrarContaDecoder msgDecoder = decoderFactory.createRegistrarContaDecoder();
    MsgRegistrarConta msg = msgDecoder.decode(textoMsg);
    System.out.println(msg.getMsg());
  }
}