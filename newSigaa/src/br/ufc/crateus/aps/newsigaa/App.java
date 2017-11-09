package br.ufc.crateus.aps.newsigaa;

import br.ufc.crateus.aps.model.Admin;
import br.ufc.crateus.aps.model.InstituicaoFinanceira;
import br.ufc.crateus.aps.model.Professor;
import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Projeto;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.ProgramaRepository;
import br.ufc.crateus.aps.repository.UserRepository;
import br.ufc.crateus.aps.services.Cadastros;
import br.ufc.crateus.aps.services.Fachada;

public class App {
	public static void main(String[] args) {

		Admin admin = new Admin("diego", "1010", "michael");
		Cadastros.inserirUsuario(admin);
		Usuario u = Fachada.autenticar(admin.getLogin(), admin.getSenha());

		InstituicaoFinanceira iff = new InstituicaoFinanceira("4bank", 1);
		Cadastros.inserirIf(admin, iff);

		Programa p = new Programa();
		p.setNome("BIA");
		Cadastros.inserirPrograma(admin, iff, p);

		Professor professor = new Professor("andre", "andre", "andre123");
		Cadastros.inserirUsuario(professor);
		Usuario prof = Fachada.autenticar(professor.getLogin(), professor.getSenha());
		Programa prog = ProgramaRepository.BuscarPorNome("BIA");

		Cadastros.inserirProjeto(new Projeto("projeto x"), prof, prog);

	}

}
