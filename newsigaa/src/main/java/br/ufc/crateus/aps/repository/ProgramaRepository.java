package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import java.util.List;
import br.ufc.crateus.aps.model.Programa;

public class ProgramaRepository {
	private static List<Programa> programas = new ArrayList<Programa>();

	public static void save(Programa p) {
		programas.add(p);
	}

	public static Programa BuscarPorNome(String nome) {
		for (Programa p : programas) {
			if (p.getNome().equals(nome))
				return p;
		}
		return null;
	}

	public static void update(Programa us) {
		for (Programa u : programas) {
			if (u.getId() == us.getId()) {
				u = us;
				break;
			}
		}

	}

	public static void delete(int id) {
		for (Programa u : programas) {
			if (u.getId() == id) {
				programas.remove(u);
				break;
			}
		}

	}

}
