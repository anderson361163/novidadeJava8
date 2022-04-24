package br.com.alura.lambda3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
	public static void main(String[] args) {

		System.out.println("-------------------");
		
		List<String> palavras = populacaoDados();
		
		Consumer<String> consumidor = lambda1();
		
		palavras.forEach(consumidor);
		
		System.out.println("-------------------");
		
		palavras.forEach(s -> System.out.println(s));
		
		System.out.println("-------------------");
		
		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				if(s1.length() < s2.length()) {
					return -1;
				}
				if(s1.length() > s2.length()) {
					return 1;
				}
				
				return 0;
			}
		});
		
		System.out.println("-------------------");
		
		palavras.sort((String s1, String s2) -> {
				
				if(s1.length() < s2.length()) {
					return -1;
				}
				if(s1.length() > s2.length()) {
					return 1;
				}
				
				return 0;
			
		});
		
		System.out.println("-------------------");
		
		palavras.sort((String s1, String s2) ->  Integer.compare(s1.length(), s2.length()) );
		
		System.out.println("-------------------");
		
	}

	private static List<String> populacaoDados() {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		return palavras;
	}

	private static Consumer<String> lambda1() {
		Consumer<String> consumidor = new Consumer<String>(){
			@Override
		    public void accept(String s) {
		        System.out.println(s);
		    }
		};
		return consumidor;
	}

}
