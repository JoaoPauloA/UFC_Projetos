package br.ufc.crateus.aps.model;

import br.ufc.crateus.aps.controlador.entidades.Perfil;

public class Aluno extends Usuario {

	public Aluno(String nome,String login,String senha) {
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setPerfil(Perfil.Discente);
	}
}
