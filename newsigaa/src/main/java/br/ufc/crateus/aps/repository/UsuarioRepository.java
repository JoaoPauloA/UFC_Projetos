package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import br.ufc.crateus.aps.model.Usuario;

public class UsuarioRepository {
	protected static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	protected static int id = 0;

	public static void save(Usuario user) {
		user.setId(++id);
		usuarios.add(user);
	}

	public static void update(Usuario us) {
		for (Usuario u : usuarios) {
			if (u.getId() == us.getId()) {
				u = us;
				break;
			}
		}

	}

	public static void delete(int id) {
		for (Usuario u : usuarios) {
			if (u.getId() == id) {
				usuarios.remove(u);
				break;
			}
		}

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

	public static Usuario BuscaPorLoginSenha(String login, String senha) {
		for (Usuario u : usuarios) {
			if (u.getLogin().equals(login) && u.getSenha().equals(senha))
				return u;
		}

		return null;
	}

}
