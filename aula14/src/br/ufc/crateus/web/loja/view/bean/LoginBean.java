package br.ufc.crateus.web.loja.view.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.ufc.crateus.web.loja.model.Usuario;
import br.ufc.crateus.web.loja.repository.UsuarioRepositrory;

@ManagedBean
@SessionScoped
public class LoginBean {

	private Usuario usuario;
	private String login;
	private String senha;

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	private void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String logar(){
		Usuario usuarioLogado = UsuarioRepositrory.getByLoginSenha(getLogin(), getSenha());
		if(usuarioLogado == null){
			String messageSumary = "Login ou senha inválidos";
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, messageSumary, "");
			FacesContext.getCurrentInstance().addMessage(null, message);
			System.out.println(messageSumary + " - " + login + " - " + senha);
			setSenha("");
			return "/index";
		}
		setUsuario(usuarioLogado);
		System.out.println("Login autorizado para: " + getUsuario());
		return "/admin/index?faces-redirect=true";
	}
}
