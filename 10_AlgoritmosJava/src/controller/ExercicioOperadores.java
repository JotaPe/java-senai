package controller;

import util.Teclado;

public class ExercicioOperadores {

	public static void main(String[] args) {
		
		int x, y, z;

		System.out.println("Operadores de atribuição");

		x = 70;
		y = x + 10;

		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		
		// ---
		
		Teclado.lerTexto("Pressione <ENTER> para continuar:");

		x = y = z = 100;

		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		System.out.println("Valor de z: " + z);
		
		// ---
		
		Teclado.lerTexto("Pressione <ENTER> para continuar:");
		System.out.println("Operadores Binários");

		x = 230 + 40; // adição
		System.out.println("Adição - Valor de x: " + x);

		y = 70 - 5; // subtração
		System.out.println("Subtração - Valor de y: " + y);

		z = 15 * 4; // multiplicação
		System.out.println("Multiplicação - Valor de z: " + z);
		x = y / z; // divisão
		System.out.println("Divisão - Valor de x: " + x);

		y = x % z; // resto da divisão
		System.out.println("Resto da Divisão - Valor de y: " + y);
		
		// ----
		
		Teclado.lerTexto("Pressione <ENTER> para continuar:");
		System.out.println("Operadores Unários");
		
		System.out.println("     Pós-fixado");
		x = 5;
		y = x++; // pós-fixado => x = 6 e y = 5
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);

		System.out.println("     Pré-fixado");
		x = 5;	
		y = ++x; // pré-fixado => x = 6 e y = 6
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);

	}

}
