package br.ufc.crateus.aps.model;

import java.util.ArrayList;
import java.util.List;

import br.ufc.crateus.aps.controlador.observer.ProjetoListener;
import br.ufc.crateus.aps.controlador.observer.Status;

public class Projeto {
	private String nome;
	private int id;
	private List<Bolsa> bolsas = new ArrayList<Bolsa>();
	private List<ProjetoListener> listeners = new ArrayList<ProjetoListener>();

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

	public List<Bolsa> getBolsas() {
		return bolsas;
	}

	public void setBolsas(Bolsa bolsa) {
		bolsa.setId(bolsas.size() + 1);
		this.bolsas.add(bolsa);
	}

	public void addListener(ProjetoListener p) {
		this.listeners.add(p);
	}

	public void notificar(Status tipo) {
		for (ProjetoListener p : listeners) {
			p.notificar(tipo);
		}
	}
	
}
