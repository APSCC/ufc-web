package br.ufc.crateus.web.loja.view.bean;


import java.util.List;

import javax.faces.bean.ManagedBean;

import br.ufc.crateus.web.loja.model.Vendedor;
import br.ufc.crateus.web.loja.repository.VendedorRepositrory;

@ManagedBean
public class VendedorBean {
	
	public List<Vendedor> getVendedores(){
		return VendedorRepositrory.getVendedores();			
	};
	
	
}
