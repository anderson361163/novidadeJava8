package br.com.anderson.externo;

import java.util.ArrayList;

public class Lambda4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		ArrayList<Integer> dobro = new ArrayList<Integer>();
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();

		
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		
		
		
		
		valores.forEach((v)->{
			dobro.add(v*2);
			if(v%2 == 0) {
				
			}
		});
		
		
		
	}
}