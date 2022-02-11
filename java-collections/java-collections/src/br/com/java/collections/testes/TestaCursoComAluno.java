package br.com.java.collections.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

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
		
		for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		Vector<Aluno> vetor = new Vector<>();
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34604);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini??");
		System.out.println(a1.equals(turini));
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}
}
