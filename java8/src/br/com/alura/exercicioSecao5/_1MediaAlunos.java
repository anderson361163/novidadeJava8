package br.com.alura.exercicioSecao5;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import br.com.alura.Streams.Curso;

public class _1MediaAlunos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		OptionalDouble qtdMediaAlunos = cursos.stream().mapToInt(c-> c.getAlunos()).average();
		
		qtdMediaAlunos.ifPresent(System.out::println);
		
	}
}
