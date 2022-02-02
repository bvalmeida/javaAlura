package br.com.javautil.domain;

import java.util.Comparator;

import br.com.bytebank.herdado.conta.modelo.Conta;

public class ComparatorNumero implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();
		
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if(c1.getNumero() > c2.getNumero()) {
//			return 132;
//		}
//		
//		return 0;
	}
}
