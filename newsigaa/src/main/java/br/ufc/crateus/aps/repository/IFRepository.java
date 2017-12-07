package br.ufc.crateus.aps.repository;

import java.util.ArrayList;
import java.util.List;
import br.ufc.crateus.aps.model.InstituicaoFinanceira;

public class IFRepository {
	private static List<InstituicaoFinanceira> ifs = new ArrayList<InstituicaoFinanceira>();
	private static int id = 0;

	public static void add(InstituicaoFinanceira If) {
		getIfs().add(If);
	}

	public static void update(InstituicaoFinanceira us) {
		for (InstituicaoFinanceira u : ifs) {
			if (u.getId() == us.getId()) {
				u = us;
				break;
			}
		}

	}

	public static void delete(int id) {
		for (InstituicaoFinanceira u : ifs) {
			if (u.getId() == id) {
				ifs.remove(u);
				break;
			}
		}

	}

	public static List<InstituicaoFinanceira> getIfs() {
		return ifs;
	}

	public void setIfs(List<InstituicaoFinanceira> ifs) {
		IFRepository.ifs = ifs;
	}

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		IFRepository.id = id;
	}

}
