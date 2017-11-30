package br.ufc.crateus.aps.model;

import br.ufc.crateus.aps.controlador.entidades.Perfil;
import br.ufc.crateus.aps.controlador.observer.ProjetoListener;
import br.ufc.crateus.aps.controlador.observer.Status;

public class Aluno extends Usuario {

	public Aluno(String nome, String login, String senha) {
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setPerfil(Perfil.Discente);
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
