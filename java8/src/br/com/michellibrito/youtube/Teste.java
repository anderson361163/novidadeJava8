package br.com.michellibrito.youtube;

import java.util.Arrays;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Anderson", true, "123");
		Cliente c2 = new Cliente("Ivanilton", true, "456");
		
		c1.autenticaSenha("123");
		c2.autenticaSenha("false");
		
		
		List<Cliente> clientes = Arrays.asList(c1,c2);
		MostrarCliente mc = new MostrarCliente();
		clientes.forEach(mc);
		
		
		
	}
}
