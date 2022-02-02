package br.com.javautil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;

public class TesteLambdas {
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(11,33);
		Conta cc2 = new ContaPoupanca(43,11);
		Conta cc3 = new ContaCorrente(123,44);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		
		lista.sort((c1,c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		lista.forEach((conta) -> System.out.println(conta));
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}
}
