package controller;

import java.text.DecimalFormat;

import util.Teclado;

public class Q5 {

	public static void main(String[] args) {
		
		double salario;
		
		salario = Teclado.lerDouble("Informe o sal�rio que deseja ganhar: ");
		
		DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		System.out.println("Sal�rio informado: " + df.format(salario));


	}
}
