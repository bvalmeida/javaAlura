package br.com.javautil.testes;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.javautil.domain.GuardadorDeContas;

public class TesteGuardadorDeRef {
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(12,14);
		Conta cc2 = new ContaCorrente(14,54);
		
		guardador.adiciona(cc);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		
		
	}
}
