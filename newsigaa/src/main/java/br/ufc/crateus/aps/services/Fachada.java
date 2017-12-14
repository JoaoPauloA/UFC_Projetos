package br.ufc.crateus.aps.services;

import br.ufc.crateus.aps.exceptions.ExceptionNull;
import br.ufc.crateus.aps.model.Aluno;
import br.ufc.crateus.aps.model.Bolsa;
import br.ufc.crateus.aps.model.Professor;
import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.ProgramaRepository;
import br.ufc.crateus.aps.repository.UsuarioRepository;

public class Fachada {

	private static Fachada instance;

	public static Usuario autenticar(String login, String senha) {
		Usuario u = UsuarioRepository.BuscaPorLoginSenha(login, senha);
		return (u == null) ? null : u;
	}

	public static Usuario buscarUsuario(Usuario u, String nome) {
		if (autenticar(u.getLogin(), u.getSenha()) == null)
			return null;
		return UsuarioRepository.BuscaPorNome(nome);
	}

	public static Programa buscarProgramaPorNome(String p) {
		return ProgramaRepository.BuscarPorNome(p);
	}

	public static Professor registrarFrequencia(Aluno a, Professor p, Bolsa b) throws ExceptionNull {
		if (autenticar(p.getLogin(), p.getSenha()) != null) {
			// b.chamada(0, true, a, p); //nao foi implementado
			return p;
		}
		return null;
	}

	public static void cadastrarInformacao(Professor p, String informacoes) {
		p.setInformacoes(informacoes);
	}

	public static synchronized Fachada getInstance() {
		if (instance == null)
			instance = new Fachada();
		return instance;
	}

}
