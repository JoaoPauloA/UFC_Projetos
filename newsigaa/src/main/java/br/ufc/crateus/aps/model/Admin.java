package br.ufc.crateus.aps.model;

import br.ufc.crateus.aps.controlador.entidades.Perfil;
import br.ufc.crateus.aps.controlador.observer.Status;

public class Admin extends Usuario {

	public Admin(String login, String senha, String nome) {
		this.setLogin(login);
		this.setNome(nome);
		this.setSenha(senha);
		this.setPerfil(Perfil.Admin);
	}

	public void notificar(Status tipo) {
		if (tipo == Status.aprovacao) {
			System.out.println("Aprovado !!!");
		} else if (tipo == Status.etapa_inicial) {
			System.out.println("Partiu !!!");
		} else {
			System.out.println("etapa 1");
		}

	}

}
