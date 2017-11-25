package br.ufc.crateus.aps.model;

import java.util.ArrayList;
import java.util.List;

public class InstituicaoFinanceira {
	private List<Programa> programas;
	private String nome;
	private int id;

	public InstituicaoFinanceira(String nome, int id) {
		super();
		this.programas = new ArrayList<Programa>();
		this.nome = nome;
		this.id = id;
	}

	public List<Programa> getProgramas() {
		return programas;
	}

	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
