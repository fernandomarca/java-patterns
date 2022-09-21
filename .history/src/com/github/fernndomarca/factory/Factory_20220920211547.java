package com.github.fernndomarca.factory;

public class ItemPedido {
  private Produto produto;
  private int quantidade;
  private int precoUnitarioEmCentavos;

  public ItemPedido(Produto produto, int quantidade, int valorEmCentavos) {
    this.produto = produto;
    this.quantidade = quantidade;
    this.precoUnitarioEmCentavos = valorEmCentavos;
  }

  public int valor() {
    return quantidade * precoUnitarioEmCentavos;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public int getPrecoUnitarioEmCentavos() {
    return precoUnitarioEmCentavos;
  }public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
  this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
  }}

  Uma primeira
  implementação da
  operação de
  remoção dos
  itens inválidos
  está listada
  a seguir:

  1public void removerItensInvalidos(ArrayList‹ItemPedido› itens) {
  2ArrayIterator‹ItemPedido› cursor = new ArrayIterator(itens);
  3while (cursor.hasNext()) {
  4ItemPedido item = cursor.next();
  5if (! isValido(item)) {
  6cursor.remove(item);
  7}
  8}
  9}
  10
  11public boolean isValido(ItemPedido item) {
  12return (item.getQuantidade() › 0 && item.getQuantidade() ‹ 100);
  13}
