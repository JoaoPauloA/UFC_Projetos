package br.ufc.crateus.aps.controlador.factory;

public class MensageiroFactory {

	public static Mensageiro getInstance(Contato tipo) {
		if (tipo == Contato.email) {
			return new MensageiroEmail();
		} else {
			return new MensageiroSms();
		}
	}

}
