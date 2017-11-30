package br.ufc.crateus.aps.services;

import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.ProgramaRepository;
import br.ufc.crateus.aps.repository.UserRepository;

public class Fachada {

	private static Fachada instance;

	public static Usuario autenticar(String login, String senha) {
		Usuario u = UserRepository.BuscaPorLoginSenha(login, senha);
		return (u == null) ? null : u;
	}

	public static Usuario buscarUsuario(Usuario u, String nome) {
		if (autenticar(u.getLogin(), u.getSenha()) == null)
			return null;
		return UserRepository.BuscaPorNome(nome);
	}

	public static Programa buscarProgramaPorNome(String p) {
		return ProgramaRepository.BuscarPorNome(p);
	}

	public static synchronized Fachada getInstance() {
		if (instance == null)
			instance = new Fachada();
		return instance;
	}

}
