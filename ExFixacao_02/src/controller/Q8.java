package controller;

import util.Teclado;

public class Q8 {

	static int i = 0;

	public static void main(String[] args) {

		try {

			int num = Teclado.lerInt("Digite um n�mero:");

		} catch (NumberFormatException nfe) {

			i = i + 1;
			if (i < 3) {
				System.out.println("Dados inv�lidos.");
				main(args);
			} else {
				System.out.println("excedeu o limite de tentativas");
			}

		}

	}

}
