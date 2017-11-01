package br.ufc.crateus.aps.repository;

import java.util.ArrayList;

import br.ufc.crateus.aps.model.Aluno;
import br.ufc.crateus.aps.model.Professor;
import br.ufc.crateus.aps.model.Usuario;

public class UserRepository {
	protected static ArrayList<Usuario> usuarios = new ArrayList<>();
	protected static int ids;

	public static void addAluno(Usuario user) {
		user.setId(++ids);
		usuarios.add(user);
	}

}
