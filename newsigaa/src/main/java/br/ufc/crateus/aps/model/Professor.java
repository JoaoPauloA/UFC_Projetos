package br.ufc.crateus.aps.model;

import br.ufc.crateus.aps.controlador.entidades.Perfil;
import br.ufc.crateus.aps.controlador.observer.Status;

public class Professor extends Usuario {

	private String informacoes;

	public Professor(String nome, String login, String senha) {
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setPerfil(Perfil.Docente);
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

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

}
