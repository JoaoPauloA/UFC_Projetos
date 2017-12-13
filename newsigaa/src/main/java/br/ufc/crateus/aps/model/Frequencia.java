package br.ufc.crateus.aps.model;

import java.util.ArrayList;
import java.util.List;

public class Frequencia {

	private List<Frequencia> frequencias = new ArrayList<Frequencia>();
	private Professor professor;
	private Aluno aluno;
	private String data;
	private boolean presenca;

	public List<Frequencia> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

}
