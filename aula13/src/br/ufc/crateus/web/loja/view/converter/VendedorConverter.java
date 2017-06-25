package br.ufc.crateus.web.loja.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.ufc.crateus.web.loja.model.Vendedor;
import br.ufc.crateus.web.loja.repository.VendedorRepositrory;

@FacesConverter("vendedorConverter")
public class VendedorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println("getAsObject: " + value);
		return VendedorRepositrory.getByCodigo(Integer.parseInt(value));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		System.out.println("getAsString: " + obj);
		Vendedor vendedor = (Vendedor) obj;
		return String.valueOf(vendedor.getCodigo());
	}
}
