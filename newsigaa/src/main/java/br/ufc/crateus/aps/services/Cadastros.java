package br.ufc.crateus.aps.services;

import br.ufc.crateus.aps.controlador.entidades.Permissao;
import br.ufc.crateus.aps.exceptions.ExceptionNull;
import br.ufc.crateus.aps.model.Aluno;
import br.ufc.crateus.aps.model.Bolsa;
import br.ufc.crateus.aps.model.InstituicaoFinanceira;
import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Projeto;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.IFRepository;
import br.ufc.crateus.aps.repository.ProgramaRepository;
import br.ufc.crateus.aps.repository.ProjetoRepository;
import br.ufc.crateus.aps.repository.UsuarioRepository;

public class Cadastros {
	public static void inserirUsuario(Usuario user) {
		UsuarioRepository.save(user);
	}

	public static Projeto cadastrarProjeto(Projeto p, Usuario u, Programa prog) throws ExceptionNull {
		if (u.getPerfil().getPermissoes().contains(Permissao.Cadastrar_projeto)) {
			prog.getProjetos().add(p);
			ProjetoRepository.add(p);
			return p;
		} else {
			return null;
		}
	}

	public static Aluno increverSeProjeto(Bolsa b, Aluno u) throws ExceptionNull {
		if (u.getPerfil().getPermissoes().contains(Permissao.Inscrever_se_projeto)) {
			b.setAlunos(u);
			return u;
		}
		return null;
	}

	public static void inserirIf(Usuario u, InstituicaoFinanceira iff) {
		if (u.getPerfil().getPermissoes().contains(Permissao.Cadastrar_if))
			IFRepository.add(iff);
		else {
			System.out.println("Usuario sem permissao !!!");
		}
	}

	public static void inserirPrograma(Usuario u, InstituicaoFinanceira iff, Programa p) {
		if (u.getPerfil().getPermissoes().contains(Permissao.Cadastrar_programa)) {
			iff.getProgramas().add(p);
			ProgramaRepository.save(p);
		} else {
			System.out.println("Usuario sem permissao !!!");
		}
	}

}