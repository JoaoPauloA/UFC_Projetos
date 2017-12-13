package br.ufc.crateus.aps.controlador.adapter;

public class MensageiroEmail {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String valor) {
		this.email = valor;
	}

	public void enviarEmail(String mensagem) {
		System.out.println("enviou email: " + mensagem);

	}

}
