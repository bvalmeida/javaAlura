package br.com.bytebank.testes;

import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;

public class ContaPoupancaNew extends ContaPoupanca {

	public ContaPoupancaNew(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String toString() {
		return "ContaPoupan�a, N�mero: " + super.getNumero();
	}
	
}
