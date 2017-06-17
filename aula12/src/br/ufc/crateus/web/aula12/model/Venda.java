package br.ufc.crateus.web.aula12.model;

import java.util.Date;

public class Venda {

	private Produto produto;
	private Date data;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", data=" + data + "]";
	}
}
