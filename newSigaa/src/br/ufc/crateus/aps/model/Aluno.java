package br.ufc.crateus.aps.model;

public class Aluno extends Usuario {
	private int matricula;

	public Aluno(String nome, int matricula) {
		this.setNome(nome);
		this.matricula = matricula; 
		this.setStatus("Discente");
	}

	public int getMatri() {
		return matricula;
	}

	public void setMatri(int matricula) {
		this.matricula= matricula;
	}
}
