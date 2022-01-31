package br.com.javautil.testes;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;

public class TesteArrayString {
	public static void main(String[] args) {
		
		System.out.println("Funcionou!!");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
