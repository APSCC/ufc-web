package br.ufc.crateus.web.loja.repository;

import java.util.Arrays;
import java.util.List;

import br.ufc.crateus.web.loja.model.Vendedor;

public class VendedorRepositrory {

	private static List<Vendedor> vendedores = Arrays.asList(new Vendedor(1, "Jose"), 
			new Vendedor(2, "Joao"),
			new Vendedor(3, "Pedro"));

	public static List<Vendedor> getVendedores() {
		return vendedores;
	}

	public static void setVendedores(List<Vendedor> newVendedores) {
		vendedores = newVendedores;
	}
	
	public static Vendedor getByCodigo(int codigo){
		for (Vendedor vendedor : vendedores) {
			if(vendedor.getCodigo() == codigo)
				return vendedor;
		}
		return null;
	}

}
