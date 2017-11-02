package br.ufc.crateus.aps.model;

import br.ufc.crateus.aps.controlador.Perfil;

public class Admin extends Usuario {
	
	public Admin(String login, String senha, String nome) {
		this.setLogin(login);
		this.setNome(nome);
		this.setSenha(senha);
		this.setPerfil(Perfil.Admin);
	}

}
