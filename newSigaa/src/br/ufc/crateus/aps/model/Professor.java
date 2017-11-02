package br.ufc.crateus.aps.model;

import br.ufc.crateus.aps.controlador.Perfil;

public class Professor extends Usuario{
	public Professor(String nome,String login,String senha) {
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setPerfil(Perfil.Docente);;
	}
	
}
