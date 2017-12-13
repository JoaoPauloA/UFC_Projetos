package br.ufc.crateus.aps.controlador.adapter;

public class MensageiroEmailAdapter extends MensageiroEmail implements MensageiroAdapter {

	public MensageiroEmailAdapter(String email) {
		setEmail(email);
	}

	public void enviar(String mensagem) {
		enviarEmail(mensagem);
	}

}
