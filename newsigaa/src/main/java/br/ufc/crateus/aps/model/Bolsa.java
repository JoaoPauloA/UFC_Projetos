package br.ufc.crateus.aps.model;

import java.util.ArrayList;

public class Bolsa {
	private String nome;
	private int id;
	private Projeto projeto;
	private ArrayList<Aluno> alunos;

	public Bolsa(String nome, Projeto p) {
		this.setNome(nome);
		this.setProjeto(p);
		this.alunos= new ArrayList<Aluno>();

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

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}

}
