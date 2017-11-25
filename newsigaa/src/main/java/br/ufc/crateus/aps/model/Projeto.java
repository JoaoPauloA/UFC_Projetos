package br.ufc.crateus.aps.model;

import java.util.ArrayList;

public class Projeto {
	private String nome;
	private int id;
	private ArrayList<Bolsa> bolsas;

	public Projeto(String nome) {
		this.setNome(nome);
		this.bolsas = new ArrayList<Bolsa>();

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

	public ArrayList<Bolsa> getBolsas() {
		return bolsas;
	}

	public void setBolsas(Bolsa bolsa) {
		bolsa.setId(bolsas.size()+1);
		this.bolsas.add(bolsa);
	}

}
