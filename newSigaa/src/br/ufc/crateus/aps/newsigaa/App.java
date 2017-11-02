package br.ufc.crateus.aps.newsigaa;

import br.ufc.crateus.aps.model.Admin;
import br.ufc.crateus.aps.model.InstituicaoFinanceira;
import br.ufc.crateus.aps.model.Professor;
import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.ProgramaRepository;
import br.ufc.crateus.aps.repository.UserRepository;
import br.ufc.crateus.aps.services.Cadastros;
import br.ufc.crateus.aps.services.Fachada;

public class App {
	public static void main(String[] args) {
		
		
		Admin admin = new Admin("diego", "1010", "michael");
		Cadastros.startUser(admin);
		Usuario u = Fachada.autenticar(admin.getLogin(), admin.getSenha());
		InstituicaoFinanceira iff = new InstituicaoFinanceira("4bank", 1);
		Cadastros.inserirIf(admin, iff);
		Programa p = new Programa();
		p.setNome("BIA");
		Cadastros.inserirPrograma(admin, iff, p);
		Professor professor = new Professor("andre","andre","andre123");
		Cadastros.startUser(professor);
		
		Usuario prof = Fachada.autenticar(professor.getLogin(),professor.getSenha());
		Programa prog = ProgramaRepository.BuscarPorNome("BIA");
		
		
		

		// cadastrarIF(admin, if)
		// cadastrarPrograma(admin, if, programa)
		
		// cadastrarProfessor(pf)
		
		// Usuario prof = autenticar(login, senha)
		// Programa prog = buscarPrograma(porNome)

		// cadastrarProjeto(prof, prog, projeto);
		
		
	}

}
