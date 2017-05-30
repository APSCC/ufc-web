package br.ufc.crateus.web.loja.view.bean;

import javax.faces.bean.ManagedBean;

import br.ufc.crateus.web.loja.model.Pais;

@ManagedBean
public class PaisBean {

	private Pais pais;

	public PaisBean() {
		setPais(Pais.BRASIL);
	}
	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public String salvar(){
		System.out.println(getPais());
		return "";
	}
	
}
