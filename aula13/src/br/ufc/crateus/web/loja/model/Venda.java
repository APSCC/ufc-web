package br.ufc.crateus.web.loja.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Date data;
	private List<Item> items;
	private float valorTotal;
	private float desconto;
	private Usuario usuario;

	public Venda() {
		items = new ArrayList<>();
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Venda [data=" + data + ", items=" + items + ", valorTotal=" + valorTotal + ", desconto=" + desconto
				+ ", usuario=" + usuario + "]";
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

}
