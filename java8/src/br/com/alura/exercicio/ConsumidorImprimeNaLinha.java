package br.com.alura.exercicio;

import java.util.function.Consumer;

public class ConsumidorImprimeNaLinha implements Consumer<String>{
	@Override
    public void accept(String s) {
        System.out.println(s);
    }
}
