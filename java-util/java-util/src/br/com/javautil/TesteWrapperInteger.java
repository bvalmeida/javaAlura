package br.com.javautil;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		int idade = 29;// Integeer
		
		Integer idadeRef = Integer.valueOf(29);// autoboxing
		int valor = idadeRef.intValue();// unboxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		String s = args[0];
		Integer numero = Integer.valueOf(s);
		
		int numero2 = Integer.parseInt(s);
		
		System.out.println(numero);
		System.out.println(numero2);
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(29); // Autoboxing, transformação de primitivo para oo, de forma automática.
		
	}
}
