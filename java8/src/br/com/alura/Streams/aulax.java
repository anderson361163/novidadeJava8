package br.com.alura.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class aulax {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//method reference
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//Evita o problema de autoboxing, utilizando o tipo int mesmo
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		//nao da para aplicar method reference
		//cursos.forEach((c) -> {System.out.println(c.getNome());});
		
		//imprimir todos os cursos com mais de 100 alunos
		cursos.stream()
				.filter(c -> c.getAlunos() >=100)
				.forEach((c) -> {System.out.println("Quantidade de Alunos é "+c.getAlunos());});

		
		//Imprime todos os alunos de cursos acima de 100 alunos
		 cursos.stream().filter(c -> c.getAlunos() >=100)
		 				.map(c->c.getAlunos())
		 				.forEach((total)->{System.out.println(total);});;
		 
		//Soma todos os alunos de cursos acima de 100
		 int total = cursos.stream().filter(c -> c.getAlunos() >=100)
			.mapToInt(c->c.getAlunos()).sum();
 
		 
		 System.out.println("Total de alunos de cursos acima de 100: " + total);
		 
		 
		int sum = cursos.stream().filter(c -> c.getAlunos() >=100).mapToInt(Curso::getAlunos).sum();
		//System.out.println("Os cursos acima de 100 alunos possui um total de: " + sum);
		
		System.out.println("------------------------");
		
		
		 cursos.stream()
			  .filter(c->c.getAlunos()>100)
			  .findAny()
		  	  .ifPresent(c -> System.out.println(c.getNome()));
		 
		 
		 Curso objeto = cursos.stream()
		  .filter(c->c.getAlunos()>1000)
		  .findAny()
	  	  .orElse(new Curso("Vazio", 0));
	  	  System.out.println("Curso: " + objeto.getNome());
		
	  	  
	  	System.out.println("------------------------");
	  	
	  	 
	  	cursos = cursos.stream()
		  .filter(c->c.getAlunos()>100)
		  .collect(Collectors.toList());
		
	  	
	  	cursos.forEach(c-> System.out.println(c.toString()));
	  	
	  	System.out.println("------------------------");
	  	
		Set<Curso> cursosSet = cursos.stream()
				 .filter(c->c.getAlunos()>100)
				 .collect(Collectors.toSet());
				
		System.out.println("------------------------");
		
		 Map<String, Curso> cursoMap = cursos.stream()
				 .filter(c->c.getAlunos()>100)
				 .collect(
						 Collectors
						 .toMap(c -> c.getNome(),
						 		c -> c));

		 System.out.println(cursoMap);
		 
		 System.out.println("------------------------");
		 
		 cursos.stream()
				 .filter(c->c.getAlunos()>100)
				 .collect(
						 Collectors
						 .toMap(c -> c.getNome(),
						 		c -> c))
				 .forEach((nome, alunos) -> System.out.println(nome+" tem " + alunos + " alunos"));
		 
		 System.out.println("------------------------");
		 
		 
		 cursos.parallelStream()
		 .filter(c->c.getAlunos()>100)
		 .collect(
				 Collectors
				 .toMap(c -> c.getNome(),
				 		c -> c))
		 .forEach((nome, alunos) -> System.out.println(nome+" tem " + alunos + " alunos"));
 
		 
		 
		 
	}

}
