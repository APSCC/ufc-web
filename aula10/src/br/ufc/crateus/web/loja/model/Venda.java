package br.ufc.crateus.web.loja.model;

import java.util.Date;
import java.util.List;

public class Venda {

	private Date data;
	private Vendedor vendedor;
	private List<Vendedor> vendedores;
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Venda [data=" + data + ", vendedor=" + vendedor + ", vendedores=" + vendedores + "]";
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
	
}
