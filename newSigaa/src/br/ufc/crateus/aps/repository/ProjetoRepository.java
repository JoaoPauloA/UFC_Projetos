package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import br.ufc.crateus.aps.model.Projeto;

public class ProjetoRepository {
	static ArrayList<Projeto> projetos = new ArrayList<>();
	protected static int idP = 0;

	public static void add(Projeto p) {
		p.setId(++idP);
		projetos.add(p);
	}

}
