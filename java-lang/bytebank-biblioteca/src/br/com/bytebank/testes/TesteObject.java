package br.com.bytebank.testes;

import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;

public class TesteObject {
	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		System.out.println();
		
		ContaCorrente cc = new ContaCorrenteNew(22, 33);
		ContaPoupanca cp = new ContaPoupancaNew(32, 12);
		
		System.out.println(cc);
		System.out.println(cp);
		
		println();
		println(cc);
	}
	
	static void println() {
	}
	
	static void println(int a) {
	}
	
	static void println(boolean valor) {
	}
	
	static void println(ContaCorrente conta) {
	}
	
}
