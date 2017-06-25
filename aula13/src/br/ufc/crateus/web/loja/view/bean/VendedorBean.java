package br.ufc.crateus.web.loja.view.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.ufc.crateus.web.loja.model.Vendedor;
import br.ufc.crateus.web.loja.repository.VendedorRepositrory;

@ManagedBean
@ApplicationScoped
public class VendedorBean {

	@PostConstruct
	private void init(){
		System.out.println("VendedorBean iniciado!");
	}
	
	public List<Vendedor> getVendedores() {
		return VendedorRepositrory.getVendedores();
	};

}
