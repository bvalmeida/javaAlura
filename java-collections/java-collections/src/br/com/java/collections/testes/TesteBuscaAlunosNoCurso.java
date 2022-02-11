package br.com.java.collections.testes;

import br.com.java.collections.domain.Aluno;
import br.com.java.collections.domain.Aula;
import br.com.java.collections.domain.Curso;

public class TesteBuscaAlunosNoCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		Aluno a1 = new Aluno("Rodrigo Turini", 345604);
		Aluno a2 = new Aluno("Guilherme Silveira", 56456);
		Aluno a3 = new Aluno("Mauricio Aniche", 12354);
		Aluno a4 = new Aluno("Paulo Silveira", 56456);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		
		System.out.println("Quem � o aluno com matricula 56456?");
		
		Aluno aluno = javaColecoes.buscaMatriculado(56456);
		System.out.println("Aluno: " + aluno);
	}

}
