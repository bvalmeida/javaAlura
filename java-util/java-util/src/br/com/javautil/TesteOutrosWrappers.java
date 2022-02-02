package br.com.javautil;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println(idadeRef.intValue());// Unboxing
		
		Double dRef = Double.valueOf(3.2); 
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(32);
		System.out.println(refNumero);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(26.5f);
		
		
		
	}
}
