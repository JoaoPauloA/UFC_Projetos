package br.ufc.crateus.aps.services;

import br.ufc.crateus.aps.model.Projeto;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.ProjetoRepository;
import br.ufc.crateus.aps.repository.UserRepository;

public class Cadastros {
	public static void startUser(Usuario user) {
		UserRepository.addAluno(user);
	}

	public static void inserirProjeto(Projeto p) {
		
	}
}