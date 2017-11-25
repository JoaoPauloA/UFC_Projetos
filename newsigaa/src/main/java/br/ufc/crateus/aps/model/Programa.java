package br.ufc.crateus.aps.model;

import java.util.ArrayList;

public class Programa {
	private String nome;
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}

}
