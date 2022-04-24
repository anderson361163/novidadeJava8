package br.com.alura.exercicioSecao4;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.Streams.Curso;

public class Stream1 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.stream()
			  .filter(curso -> curso.getAlunos() > 50)
			  .forEach((qtd) -> {System.out.println("Qtd: " + qtd.getAlunos());});;
		
	}
}
