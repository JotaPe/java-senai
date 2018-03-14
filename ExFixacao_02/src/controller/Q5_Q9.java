package controller;

import java.text.DecimalFormat;

import util.Teclado;

public class Q5_Q9 {

	public static void main(String[] args) {

		try {

			double salario;

			salario = Teclado.lerDouble("Informe o salário que deseja ganhar: ");

			DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
			System.out.println("Salário informado: " + df.format(salario));

		} catch (NumberFormatException nfe) {
			
			System.out.println("Erro. Por favor insira um valor numérico.");
			main(args);

		}// fim do catch

	}
}
