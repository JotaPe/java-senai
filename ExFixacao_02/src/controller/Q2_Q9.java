package controller;

import util.Teclado;

public class Q2_Q9 {

	public static void main(String[] args) {

		try {

			// Classe ExemploClasseMath - Proj 16

			double angulo, sen, cos, tan;

			angulo = Teclado.lerDouble("Informe um ângulo desejado: ");
			sen = Math.sin(Math.toRadians(angulo));
			cos = Math.cos(Math.toRadians(angulo));
			tan = Math.tan(Math.toRadians(angulo));

			System.out.println("Seno de " + angulo + " = " + sen);
			System.out.println("Cosseno de " + angulo + " = " + cos);
			System.out.println("Tangente de " + angulo + " = " + tan);

		} catch (NumberFormatException nfe) {
			
			System.out.println("Erro: Por favor digite um valor numérico");
			main(args);

		}// fim do catch

	}

}
