package br.ufc.crateus.web.loja.repository;

import java.util.Arrays;
import java.util.List;

import br.ufc.crateus.web.loja.model.Usuario;

public class UsuarioRepositrory {

	private static List<Usuario> usuarios = Arrays.asList(new Usuario("joao", "123"));

	public static List<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(List<Usuario> newUsuarios) {
		usuarios = newUsuarios;
	}
	
	public static Usuario getByLoginSenha(String login, String senha){
		for (Usuario usuario : usuarios) {
			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha))
				return usuario;
		}
		return null;
	}

}
