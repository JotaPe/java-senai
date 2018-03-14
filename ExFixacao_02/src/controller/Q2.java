package controller;

import util.Teclado;

public class Q2 {

	public static void main(String[] args) {
		
		//Classe ExemploClasseMath - Proj 16

		double angulo, sen, cos, tan;
		
		angulo = Teclado.lerDouble("Informe um ângulo desejado: ");
		sen = Math.sin(Math.toRadians(angulo));
		cos = Math.cos(Math.toRadians(angulo));
		tan = Math.tan(Math.toRadians(angulo));
		
		System.out.println("Seno de " + angulo + " = " + sen);
		System.out.println("Cosseno de " + angulo + " = " + cos);
		System.out.println("Tangente de " + angulo + " = " + tan);

	}

}
