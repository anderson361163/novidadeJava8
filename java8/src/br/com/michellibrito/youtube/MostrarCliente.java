package br.com.michellibrito.youtube;

import java.util.function.Consumer;

public class MostrarCliente implements Consumer<Cliente> {
	public void accept(Cliente c) {
		System.out.println(c.getNome());
		System.out.println(c.getSenha());
	}
}