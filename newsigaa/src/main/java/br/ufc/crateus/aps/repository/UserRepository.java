package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import br.ufc.crateus.aps.model.Usuario;

public class UserRepository {
	protected static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	protected static int ids = 0;

	public static void add(Usuario user) {
		user.setId(++ids);
		usuarios.add(user);
	}

	public static Usuario BuscaPorNome(String nome) {
		for (Usuario u : usuarios) {
			if (u.getNome().equals(nome))
				return u;
		}

		return null;
	}

	public static Usuario BuscaPorLogin(String login) {
		for (Usuario u : usuarios) {
			if (u.getLogin().equals(login))
				return u;
		}

		return null;
	}

}
