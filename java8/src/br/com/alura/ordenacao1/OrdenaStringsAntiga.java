package br.com.alura.ordenacao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStringsAntiga {
	public static void main(String[] args) {
		
		System.out.println("-----------------------");
		//FORMAS ANTIGA
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		
		//NÃO É POSITIVO TER CLASSE UTIL
		Collections.sort(palavras, comparador);
		
		System.out.println(palavras);
		
		System.out.println("-----------------------");
		
	}
}

