package br.ufc.crateus.aps.services;

import br.ufc.crateus.aps.controlador.Perfil;
import br.ufc.crateus.aps.model.InstituicaoFinanceira;
import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Projeto;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.IFRepository;
import br.ufc.crateus.aps.repository.ProgramaRepository;
import br.ufc.crateus.aps.repository.ProjetoRepository;
import br.ufc.crateus.aps.repository.UserRepository;

public class Cadastros {
	public static void inserirUsuario(Usuario user) {
		UserRepository.add(user);
	}

	public static void inserirProjeto(Projeto p, Usuario u, Programa prog) {
		if (u.getPerfil() == Perfil.Docente) {
			prog.getProjetos().add(p);
			ProjetoRepository.add(p);
		} else {
			System.out.println("Usuario sem permissao !!!");
		}
	}

	public static void inserirIf(Usuario u, InstituicaoFinanceira iff) {
		if (u.getPerfil() == Perfil.Admin)
			IFRepository.add(iff);
		else {
			System.out.println("Usuario sem permissao !!!");
		}
	}

	public static void inserirPrograma(Usuario u, InstituicaoFinanceira iff, Programa p) {
		if (u.getPerfil() == Perfil.Admin) {
			iff.getProgramas().add(p);
			ProgramaRepository.save(p);
		} else {
			System.out.println("Usuario sem permissao !!!");
		}
	}

}