package br.ufc.crateus.aps.controlador.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Perfil {
	Admin(Permissao.Cadastrar_if, Permissao.Cadastrar_programa), 
	Discente(Permissao.Inscrever_se_projeto), 
	Docente(Permissao.Cadastrar_projeto);

	private List<Permissao> permissoes = new ArrayList<Permissao>();

	private Perfil(Permissao... permissoes) {

		setPermissoes(Arrays.asList(permissoes));
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	private void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
}
