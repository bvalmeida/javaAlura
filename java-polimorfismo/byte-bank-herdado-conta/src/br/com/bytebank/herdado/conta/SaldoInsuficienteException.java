package br.com.bytebank.herdado.conta;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}
