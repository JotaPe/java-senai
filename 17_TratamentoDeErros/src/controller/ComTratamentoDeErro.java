package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {

		try {

			double a = Teclado.lerDouble("Digite o Numerador: ");
			double b = Teclado.lerDouble("Digite o Denominador: ");

			double c = a / b;
			System.out.println("Resultado da divisão de a por b: " + c);

		} catch (NumberFormatException nfe) {
			
			System.out.println("Por favor insira somente números !");
			main(args);

		}

	}

}
