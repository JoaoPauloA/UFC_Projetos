package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import br.ufc.crateus.aps.model.Projeto;

public class ProjetoRepository {
	static ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	protected static int idP = 0;

	public static void add(Projeto p) {
		p.setId(++idP);
		projetos.add(p);
	}

	public static Projeto BuscarPorNome(String nome) {
		for (Projeto p : projetos) {
			if (p.getNome().equals(nome))
				return p;
		}
		return null;
	}

	public static void update(Projeto us) {
		for (Projeto u : projetos) {
			if (u.getId() == us.getId()) {
				u = us;
				break;
			}
		}

	}

	public static void delete(int id) {
		for (Projeto u : projetos) {
			if (u.getId() == id) {
				projetos.remove(u);
				break;
			}
		}

	}

}
