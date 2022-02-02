package br.com.javautil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bytebank.herdado.conta.modelo.Cliente;
import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;
import br.com.javautil.domain.ComparatorNumero;
import br.com.javautil.domain.ComparatorTitular;

public class TesteComparandoStrings {
	public static void main(String[] args) {
		
//		ComparatorNumero comparator = new ComparatorNumero();
//		ComparatorTitular comparatorTitular = new ComparatorTitular();
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(22,33);
		Conta cc2 = new ContaPoupanca(22,44);
		Conta cc3 = new ContaCorrente(22,11);
		Conta cc4 = new ContaPoupanca(22,22);
		
		Cliente clienteCC1 = new Cliente();
		Cliente clienteCC2 = new Cliente();
		Cliente clienteCC3 = new Cliente();
		Cliente clienteCC4 = new Cliente();
		
		cc1.setTitular(clienteCC1);
		cc2.setTitular(clienteCC2);
		cc3.setTitular(clienteCC3);
		cc4.setTitular(clienteCC4);
		
		clienteCC1.setNome("João");
		clienteCC2.setNome("Maria");
		clienteCC3.setNome("Pedro");
		clienteCC4.setNome("José");
		
		
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
		
		lista.sort(new ComparatorNumero());// Chamando o método para organização baseado no número da conta
		lista.sort(new ComparatorTitular());
		
		System.out.println("------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta.getTitular().getNome());
		}
		
		// Forma legado
		
		Collections.sort(lista, new ComparatorNumero());
//		Collections.sort(lista);
		Collections.reverse(lista);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
