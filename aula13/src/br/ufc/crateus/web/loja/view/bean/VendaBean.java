package br.ufc.crateus.web.loja.view.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.ufc.crateus.web.loja.model.Item;
import br.ufc.crateus.web.loja.model.Usuario;
import br.ufc.crateus.web.loja.model.Venda;

@ManagedBean
@ViewScoped
public class VendaBean implements Serializable{
	
	private static final long serialVersionUID = -1370729135099898879L;
	@ManagedProperty("#{loginBean.usuario}")
	private Usuario usuario;
	private Venda venda;
	private Item newItem;

	@PostConstruct
	private void init(){
		setNewItem(new Item());
		setVenda(new Venda());
		System.out.println("VendaBean iniciado!");
		System.out.println("VendaBean.usuario: " + getUsuario());
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Item getNewItem() {
		return newItem;
	}

	public void setNewItem(Item newItem) {
		this.newItem = newItem;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	public void addItem(){
		System.out.println("addItem");
		venda.getItems().add(getNewItem());
		setNewItem(new Item());
	}
	
	public String salvar(){
		getVenda().setUsuario(getUsuario());
		System.out.println("Salvar venda: " + getVenda());
		return "/admin/index";
	}

}
