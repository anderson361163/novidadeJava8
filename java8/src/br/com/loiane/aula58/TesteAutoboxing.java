package br.com.loiane.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing (convers�o de tipos primitivos em tipos objetos  )
		Short num7 = new Short((short)1);
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character charObj = new Character('b');
		

		//autoboxing introduzido no Java 5 (sem precisar passar o parametro da classe)
		Short num77 = 1;
		Byte num88 = 10;
		Integer num99 = 100;
		Long num1010 = 10000l;
		Float num1111 = 3.5f;
		Double num1212 = 3.5555;
		Boolean flag22 = true;
		Character charObj2 = 'b';
		
		//auto un-boxing (atribuir o valor do objeto a um tipo primitivo novamente)
		int num13 = num9;
		//mesma coisa que o c�digo de cima
		int num1313 = num9.intValue();
		
		
		//autoboxing em express�es
		num9++;

		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer resultado = num13/num9;

		System.out.printf("resultado: %i", resultado);

		System.out.println("----------------------");
		
		System.out.println("M� pr�tica");
		
		//autoboxing
		Double a,b,c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		//o que vai ocorrer nessa opera��o � a convers�o dos valores
		//a,b,c de objetos para tipos primitivos, ser� realizada a opera��o
		//e por ultimo a reconvers�o para o tipo wrapper, 
		//podendo causar prejuizos s�rio em aplica��o de grande escala, 
		//nesse caso � melhor utilizar o tipo primitivo
		Double media = (a+b+c)/3;
		
		System.out.println("M�dia: "+media);
		System.out.println("----------------------");
		
		
	}
	
}
