package br.ufc.crateus.web.aula12.model;

import java.util.Date;

public class Produto {

	private String nome;
	private float preco;
	private Date data;

	public Produto() {
	}

	public Produto(String nome, float preco) {
		setNome(nome);
		setPreco(preco);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", data=" + data + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
