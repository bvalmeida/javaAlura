package br.com.javautil;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;
import br.com.javautil.domain.ComparatorNumero;

public class TesteComparator {
	public static void main(String[] args) {
		
		ComparatorNumero comparator = new ComparatorNumero();
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(22,33);
		Conta cc2 = new ContaPoupanca(22,44);
		Conta cc3 = new ContaCorrente(22,11);
		Conta cc4 = new ContaCorrente(22,22);
		
		cc1.deposita(333.0);
		cc2.deposita(444.0);
		cc3.deposita(111.0);
		cc4.deposita(222.0);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		lista.sort(comparator); // Chamando o método no .sort
		
		System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}

