package br.ufc.crateus.web.aula12.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.ufc.crateus.web.aula12.model.Produto;
import br.ufc.crateus.web.aula12.repository.ProdutoRepository;

@FacesConverter("produtoConverter")
public class ProdutoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent ui, String o) throws ConverterException {
		return ProdutoRepository.getByNome(o);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent ui, Object o) throws ConverterException {
		try{
			return ((Produto)o).getNome();
		} catch (Exception e) {
			return null; 
		}
	}

}
