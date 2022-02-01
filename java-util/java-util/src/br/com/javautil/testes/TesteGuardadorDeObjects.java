package br.com.javautil.testes;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.javautil.domain.GuardadorDeObjects;

public class TesteGuardadorDeObjects {
	public static void main(String[] args) {
		
		GuardadorDeObjects guardadorDeObjects = new GuardadorDeObjects();
		
		Conta cc = new ContaCorrente(132, 444);
		Conta cc2 = new ContaCorrente(31, 45);
		
		guardadorDeObjects.adiciona(cc);
		guardadorDeObjects.adiciona(cc2);
		
		int tamanho = guardadorDeObjects.getQuantidade();
		System.out.println(tamanho);
		
		Conta ref = (Conta)guardadorDeObjects.getReferencia(0);
		System.out.println(ref.getNumero());
		
		
	}
}
