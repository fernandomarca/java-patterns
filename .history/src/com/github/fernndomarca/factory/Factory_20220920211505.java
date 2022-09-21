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
  }14public Produto getProduto() {
  15return produto;
  16}17public void setProduto(Produto produto) {
  18this.produto = produto;
  19}20public int getQuantidade() {
  21return quantidade;
  22}23public void setQuantidade(int quantidade) {
  24this.quantidade = quantidade;
  25}26public int getPrecoUnitarioEmCentavos() {
  27return precoUnitarioEmCentavos;
  28}29public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
  30this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
  31}32}

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
