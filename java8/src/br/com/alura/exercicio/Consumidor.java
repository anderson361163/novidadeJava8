package br.com.alura.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new ConsumidorImprimeNaLinha();
		palavras.forEach(consumidor);
	}
}
