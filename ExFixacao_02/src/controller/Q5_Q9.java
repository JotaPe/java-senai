package controller;

import java.text.DecimalFormat;

import util.Teclado;

public class Q5_Q9 {

	public static void main(String[] args) {

		try {

			double salario;

			salario = Teclado.lerDouble("Informe o sal�rio que deseja ganhar: ");

			DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
			System.out.println("Sal�rio informado: " + df.format(salario));

		} catch (NumberFormatException nfe) {
			
			System.out.println("Erro. Por favor insira um valor num�rico.");
			main(args);

		}// fim do catch

	}
}
