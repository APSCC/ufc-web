package br.ufc.crateus.web.loja.view.bean;

import javax.faces.bean.ManagedBean;

import br.ufc.crateus.web.loja.model.Venda;
import br.ufc.crateus.web.loja.model.Vendedor;

@ManagedBean
public class VendaBean {

	private Venda venda;

	public VendaBean() {
		setVenda(new Venda());
		venda.setVendedor(new Vendedor(100, "Joaquim"));
	}
	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	public String salvar(){
		System.out.println("salvar: " + venda);
		return "";
	}

}
