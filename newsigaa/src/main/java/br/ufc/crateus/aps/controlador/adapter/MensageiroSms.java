package br.ufc.crateus.aps.controlador.adapter;

public class MensageiroSms {

	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String valor) {
		this.telefone = valor;
	}

	public void enviarSMS(String mensagem) {
		System.out.println("enviou sms: " + mensagem);

	}

}
