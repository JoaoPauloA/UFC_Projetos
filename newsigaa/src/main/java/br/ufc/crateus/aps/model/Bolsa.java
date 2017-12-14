package br.ufc.crateus.aps.model;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
	private String nome;
	private int id;
	private Projeto projeto;
	private ArrayList<Aluno> alunos;
	private List<Frequencia> frequencia = new ArrayList<Frequencia>();

	public Bolsa(String nome, Projeto p) {
		this.setNome(nome);
		this.setProjeto(p);
		this.alunos = new ArrayList<Aluno>();

	}

	public void chamada(int dia, boolean presenca, Aluno aluno, Professor professor) {
		getFrequencia().get(dia).setAluno(aluno);
		getFrequencia().get(dia).setProfessor(professor);
		getFrequencia().get(dia).setData("" + dia);
		getFrequencia().get(dia).setPresenca(presenca);
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

	public List<Frequencia> getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(List<Frequencia> frequencia) {
		this.frequencia = frequencia;
	}

}
