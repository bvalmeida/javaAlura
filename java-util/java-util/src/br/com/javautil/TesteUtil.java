package br.com.javautil;

import java.util.ArrayList;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

public class TesteUtil {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("teste");
		
		System.out.println(nomes.get(0));
		
		Conta cc = new ContaCorrente(54,32);
		Conta cc2 = new ContaCorrente(14, 11);
		
		lista.add(cc);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(45, 13);
		Conta cc4 = new ContaCorrente(545, 655);
		
		lista.add(cc3);
		lista.add(cc4);
		
		for(int i = 0; i<lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}
}
