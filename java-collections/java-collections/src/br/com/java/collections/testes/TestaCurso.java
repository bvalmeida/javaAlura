package br.com.java.collections.testes;

import java.util.List;

import br.com.java.collections.domain.Aula;
import br.com.java.collections.domain.Curso;

public class TestaCurso {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

//		List<Aula> aulas = javaColecoes.getAulas();
//		
//		System.out.println(aulas);

//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
//		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
//		System.out.println(aulas == javaColecoes.getAulas());

	}
}
