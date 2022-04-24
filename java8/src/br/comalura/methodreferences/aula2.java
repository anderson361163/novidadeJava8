package br.comalura.methodreferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class aula2 {
	public static void main(String[] args) {
		
		//Modo sem Lambda
		ModoSemLambda();
		
		
		//Modo com Lambda
		ModoComLambda();
	}

	private static void ModoComLambda() {
		List<String> palavras = populacaoDados();
		
		palavras.sort(Comparator.comparing(s->s.length()));
	}

	private static void ModoSemLambda() {
		List<String> palavras = populacaoDados();
		
		//primeiro modo de fazer
		
		//1° Criar a Function
		//Por ser uma interface funcional ele sempre tem apenas um método
		//Então pouco importa o funcionamento interno, apenas 
		Function<String, Integer> funcao = new Function<String, Integer>(){

			@Override
			public Integer apply(String s) {
				return s.length();
			}
			
		};
		
		//2° Cria o Comparador
		Comparator<String> comparador = Comparator.comparing(funcao);
		
		//3° Realizando o Sort
		palavras.sort(comparador);
	}
	
	private static List<String> populacaoDados() {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		return palavras;
	}

}
