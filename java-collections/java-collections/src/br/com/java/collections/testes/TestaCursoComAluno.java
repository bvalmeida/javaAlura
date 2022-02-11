package br.com.java.collections.testes;

import br.com.java.collections.domain.Aluno;
import br.com.java.collections.domain.Aula;
import br.com.java.collections.domain.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		Aluno a1 = new Aluno("Rodrigo Turini", 345604);
		Aluno a2 = new Aluno("Guilherme Silveira", 56456);
		Aluno a3 = new Aluno("Mauricio Aniche", 12354);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a ->{
			System.out.println(a);
		});
		
	}
}
