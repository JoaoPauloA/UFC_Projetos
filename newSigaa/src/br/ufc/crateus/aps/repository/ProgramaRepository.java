package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import java.util.List;

import br.ufc.crateus.aps.model.Programa;

public class ProgramaRepository {
	private static List<Programa> programas = new ArrayList<>();

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

}
