package br.com.bytebank.testes;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

public class TesteBiblioteca {
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123,143);
		
		c.deposita(200.0);
		
		System.out.println(c.getSaldo());
	}
}
