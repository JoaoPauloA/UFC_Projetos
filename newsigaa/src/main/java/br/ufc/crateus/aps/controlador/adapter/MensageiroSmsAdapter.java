package br.ufc.crateus.aps.controlador.adapter;

public class MensageiroSmsAdapter extends MensageiroSms implements MensageiroAdapter {

	public MensageiroSmsAdapter(String telefone) {
		setTelefone(telefone);
	}

	public void enviar(String mensagem) {
		enviarSMS(mensagem);

	}

}
