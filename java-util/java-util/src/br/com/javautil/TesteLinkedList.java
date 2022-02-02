package br.com.javautil;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

public class TesteLinkedList {
	public static void main(String[] args) {
		
		List<Conta> linkedList = new LinkedList<Conta>();
//		List<Conta> lista = new Vector<Conta>();
		
		Conta cc = new ContaCorrente(123,451);
		Conta cc2 = new ContaCorrente(134,532);
		Conta cc3 = new ContaCorrente(314,554);
		Conta cc4 = new ContaCorrente(314,554);
		
		linkedList.add(cc);
		linkedList.add(cc2);
		linkedList.add(cc3);
		linkedList.add(cc4);
				
		System.out.println(linkedList.get(0));
		
		for(Conta conta : linkedList) {
			System.out.println(conta);
		}
		
		boolean existe = linkedList.equals(cc4);
		
		System.out.println(existe);
		
		
		
	}
}
