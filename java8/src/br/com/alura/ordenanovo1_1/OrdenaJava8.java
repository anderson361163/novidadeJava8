package br.com.alura.ordenanovo1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.alura.ordenacao1.ComparadorPorTamanho;

public class OrdenaJava8 {
	public static void main(String[] args) {
		
		System.out.println("-----------------------");
		//FORMAS NOVA
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		
		Consumer<String> consumidor = null;
		
		
		
		
		System.out.println("-----------------------");
		
	}
}
