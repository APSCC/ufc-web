package br.ufc.crateus.web.loja.model;

import java.util.Date;

public class Vendedor {

	private int codigo;
	private String nome;
	private Date dataNascimento;
	
	public Vendedor() {
	}

	public Vendedor(int codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Vendedor [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

}
