package controller;

import util.Teclado;

public class ExercicioOperadores {

	public static void main(String[] args) {
		
		int x, y, z;

		System.out.println("Operadores de atribui��o");

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
		System.out.println("Operadores Bin�rios");

		x = 230 + 40; // adi��o
		System.out.println("Adi��o - Valor de x: " + x);

		y = 70 - 5; // subtra��o
		System.out.println("Subtra��o - Valor de y: " + y);

		z = 15 * 4; // multiplica��o
		System.out.println("Multiplica��o - Valor de z: " + z);
		x = y / z; // divis�o
		System.out.println("Divis�o - Valor de x: " + x);

		y = x % z; // resto da divis�o
		System.out.println("Resto da Divis�o - Valor de y: " + y);
		
		// ----
		
		Teclado.lerTexto("Pressione <ENTER> para continuar:");
		System.out.println("Operadores Un�rios");
		
		System.out.println("     P�s-fixado");
		x = 5;
		y = x++; // p�s-fixado => x = 6 e y = 5
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);

		System.out.println("     Pr�-fixado");
		x = 5;	
		y = ++x; // pr�-fixado => x = 6 e y = 6
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);

	}

}
