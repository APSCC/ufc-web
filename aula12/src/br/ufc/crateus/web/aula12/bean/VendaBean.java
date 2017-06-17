package br.ufc.crateus.web.aula12.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.ufc.crateus.web.aula12.model.Venda;

@ManagedBean
public class VendaBean {

	private Venda venda;

	public VendaBean() {
		venda = new Venda();
	}
	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	public String salvarVenda(){
		System.out.println("salvarVenda: " + venda);
		FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage("Venda salvo com sucesso",  venda.toString()) );
		return "";
	}
}
