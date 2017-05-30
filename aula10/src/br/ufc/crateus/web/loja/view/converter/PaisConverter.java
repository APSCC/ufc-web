package br.ufc.crateus.web.loja.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.ufc.crateus.web.loja.model.Pais;

@FacesConverter("paisConverter")
public class PaisConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent arg1, String value) {
		System.out.println("getAsObject: " + value);
		return Pais.get(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent arg1, Object obj) {
		System.out.println("getAsString: " + obj);
		return ((Pais)obj).getSigla();
	}
	
}
