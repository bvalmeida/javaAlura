package br.com.javautil.domain;

import java.util.Comparator;

import br.com.bytebank.herdado.conta.modelo.Conta;

public class ComparatorTitular implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
				
		return nomeC1.compareTo(nomeC2);
	}
}
