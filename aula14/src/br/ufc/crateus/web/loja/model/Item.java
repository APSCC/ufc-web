package br.ufc.crateus.web.loja.model;

public class Item {
	
	@Override
	public String toString() {
		return "Item [nomeProduto=" + nomeProduto + ", quantidade=" + quantidade + "]";
	}
	private String nomeProduto;
	private int quantidade;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
