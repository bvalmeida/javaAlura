package br.com.bytebank.testes;

import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

public class ContaCorrenteNew extends ContaCorrente {

	public ContaCorrenteNew(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, Número: " + super.getNumero();
	}

}
