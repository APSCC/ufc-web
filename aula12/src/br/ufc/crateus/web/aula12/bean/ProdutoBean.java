package br.ufc.crateus.web.aula12.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.ufc.crateus.web.aula12.model.Produto;
import br.ufc.crateus.web.aula12.repository.ProdutoRepository;

@ManagedBean
public class ProdutoBean {

	private Produto produto;
	
	public ProdutoBean() {
		produto = new Produto();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String salvarProduto() {
		System.out.println("salvarProduto: " + produto);
		FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage("Produto salvo com sucesso",  produto.toString()) );
        return "";
	}
	
	public List<Produto> getProdutos(){
		return ProdutoRepository.getProdutos();
	}
}
