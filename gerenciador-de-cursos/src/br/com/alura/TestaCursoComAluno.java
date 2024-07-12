package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", 
				"Paulo Silveira");
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Lucas Andrade", 34672);
		Aluno a2 = new Aluno("Walter Souza", 5617);
		Aluno a3 = new Aluno("Murilo Rocha", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
//		Vector<Aluno> vetor = new Vector<>();(classe antiga)
//		Aluno depoisDoUltimo = iterador.next();(NoSuchElementException)
//		for (Aluno aluno : javaColecoes.getAlunos()) {
//		    System.out.println(aluno);
//		}	
		System.out.println("O aluno" + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno lucas = new Aluno("Lucas Andrade", 34672);
		System.out.println("E esse Lucas, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(lucas));
		
		System.out.println("O a1 é equals ao Lucas?");
		System.out.println(a1.equals(lucas));
		
		
		//obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == lucas.hashCode());
		
	}

}
