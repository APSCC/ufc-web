package br.ufc.crateus.web.aula12.repository;

import java.util.Arrays;
import java.util.List;

import br.ufc.crateus.web.aula12.model.Produto;



public class ProdutoRepository {
	private static List<Produto> produtos = Arrays.asList(new Produto("Uva", 4.5f),
			new Produto("Uva", 4.5f),
			new Produto("Uva1", 4.5f),
			new Produto("Uva3", 4.5f),
			new Produto("Uva4", 4.5f),
			new Produto("Uva5", 4.5f),
			new Produto("Uva6", 4.5f),
			new Produto("Uva7", 4.5f),
			new Produto("Uva8", 4.5f),
			new Produto("Uva9", 4.5f),
			new Produto("Uva11", 4.5f),
			new Produto("Uva12", 4.5f),
			new Produto("Uva13", 4.5f),
			new Produto("Morango", 8));

	public static List<Produto> getProdutos() {
		return produtos;
	}

	public static void setProdutos(List<Produto> newProdutos) {
		produtos = newProdutos;
	}
	
	public static Produto getByNome(String nome){
		for (Produto vendedor : produtos) {
			if(vendedor.getNome().equals(nome))
				return vendedor;
		}
		return null;
	}
}
