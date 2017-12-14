package br.ufc.crateus.aps.controlador;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufc.crateus.aps.exceptions.ExceptionNull;
import br.ufc.crateus.aps.model.Admin;
import br.ufc.crateus.aps.model.Aluno;
import br.ufc.crateus.aps.model.Bolsa;
import br.ufc.crateus.aps.model.InstituicaoFinanceira;
import br.ufc.crateus.aps.model.Professor;
import br.ufc.crateus.aps.model.Programa;
import br.ufc.crateus.aps.model.Projeto;
import br.ufc.crateus.aps.model.Usuario;
import br.ufc.crateus.aps.repository.UsuarioRepository;
import br.ufc.crateus.aps.services.Cadastros;
import br.ufc.crateus.aps.services.Fachada;

public class FachadaTest {
	private static Usuario admin;
	private static Professor professor;
	private static Aluno aluno;

	@BeforeClass
	public static void setup() {
		admin = new Admin("admin", "123", "Andre");
		UsuarioRepository.save(admin);
		professor = new Professor("Joao paulo", "perseu", "perseu123");
		UsuarioRepository.save(professor);
		aluno = new Aluno("zeca", "huehue", "123");
		UsuarioRepository.save(aluno);
	}

	@Test
	public void cadastrarProjeto() {
		Projeto p = new Projeto("projeto tal");
		Programa p1 = new Programa("programa fulano");

		try {
			assertNotNull(Cadastros.cadastrarProjeto(p, professor, p1));
		} catch (ExceptionNull e) {
			e.printStackTrace();
		}

	}

	@Test
	public void increverEmProjeto() {

		Projeto p = new Projeto("projeto tal");
		Bolsa b = new Bolsa("iniciacao a latencia", p);

		try {
			assertNotNull(Cadastros.increverSeProjeto(b, aluno));
		} catch (ExceptionNull e) {
			e.printStackTrace();
		}

	}

	@Test
	public void registrarFrequencia() {
		Projeto p = new Projeto("projeto tal");
		Bolsa bolsa = new Bolsa("auxilia a lia", p);

		try {
			assertNotNull(Fachada.registrarFrequencia(aluno, professor, bolsa));
		} catch (ExceptionNull e) {
			e.printStackTrace();
		}

	}

	@Test
	public void cadastrarInformacoes() {
		professor.setInformacoes("proxima semana tem a 2 etapa da bolsa fulano de tal");
		// assertTrue(true);
	}

	@Test
	public void findOk() {
		Usuario u = Fachada.buscarUsuario(admin, "Andre");
		assertEquals(admin, u);
	}

	@Test
	public void autenticarFail() {
		Usuario u = Fachada.autenticar("admin", "1234");
		assertNull(u);
	}

	@Test
	public void insertFail() {

		Cadastros.inserirPrograma(admin, new InstituicaoFinanceira("iff", 2), new Programa("programa x"));
		Programa p = Fachada.buscarProgramaPorNome("programa y");
		assertNull(p);
	}

	@Test
	public void testFacade() {
		Fachada a = Fachada.getInstance();
		Fachada b = Fachada.getInstance();

		assertEquals(a.getInstance(), b.getInstance());

	}
}
