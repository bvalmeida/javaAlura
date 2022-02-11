package br.com.java.collections.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.java.collections.domain.Aula;

public class TesteListaDeAula {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisando ArrayLists", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		
		
	}
}
