package controller;

import javax.swing.JOptionPane;

public class Questao02 {
	
	/*
	 * Elaborar um programa que pergunte quatro valores inteiros e 
	 * apresente 2 resultados:
			a) Resultado de suas adi��es
			b) Resultado de suas multiplica��es
	 */

	public static void main(String[] args) {
		
		int a, b, c , d, adicao, mult;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto n�mero:"));
		
		adicao = a + b + c + d;
		mult = a * b * c * d;
		
		JOptionPane.showMessageDialog(null, "O resultado da SOMA dos 4 valores inseridos �: "
		+ adicao + 
		"\nO resultado da MULTIPLICA��O dos 4 n�meros inserido � " + mult);
		
		
	}

}
