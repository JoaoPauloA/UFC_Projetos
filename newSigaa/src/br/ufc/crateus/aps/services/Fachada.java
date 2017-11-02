package br.ufc.crateus.aps.services;

import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.UserRepository;

public class Fachada {
	public static Usuario autenticar(String login,String senha) {
		return UserRepository.BuscaPorLogin(login);
	}

	public static Usuario buscarUsuario(Usuario u, String nome)
	{
		if (autenticar(u.getLogin(), u.getSenha()) == null)
			return null;
		return UserRepository.BuscaPorNome(nome);
	}

}
