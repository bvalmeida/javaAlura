package br.com.javautil;

import java.util.ArrayList;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(234,134);
		Conta cc2 = new ContaCorrente(22,22);
		Conta cc3 = new ContaCorrente(22,22);
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			if(conta == cc3) {
				System.out.println("Já tenho essa referência!");
			}
		}
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
		
	}
}
