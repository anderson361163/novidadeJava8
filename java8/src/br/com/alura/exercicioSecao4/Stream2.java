package br.com.alura.exercicioSecao4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.com.alura.Streams.Curso;

public class Stream2 {
	public static void main(String[] args) {
		
		System.out.println("Obtenha um Stream de String: ");
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		Stream<String> map = cursos.stream().map(c->c.getNome());
	
	
	}
}
