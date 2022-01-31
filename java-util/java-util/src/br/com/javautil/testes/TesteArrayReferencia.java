package br.com.javautil.testes;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;

public class TesteArrayReferencia {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		
		ContaPoupanca cc1 = new ContaPoupanca(22,33);
		ContaCorrente cc2 = new ContaCorrente(65, 45);
		
		contas[0] = cc1;
		contas[1] = cc2;
		ContaCorrente ref = (ContaCorrente) contas[1]; 
		
		System.out.println(contas[0]);
		System.out.println(contas[0].getAgencia());
		System.out.println(contas[1].getNumero());
		System.out.println(ref.getAgencia());
		
		
		
	}
}
