package controller;

import javax.swing.JOptionPane;

public class Questao02 {
	
	/*
	 * Elaborar um programa que pergunte quatro valores inteiros e 
	 * apresente 2 resultados:
			a) Resultado de suas adições
			b) Resultado de suas multiplicações
	 */

	public static void main(String[] args) {
		
		int a, b, c , d, adicao, mult;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número:"));
		
		adicao = a + b + c + d;
		mult = a * b * c * d;
		
		JOptionPane.showMessageDialog(null, "O resultado da SOMA dos 4 valores inseridos é: "
		+ adicao + 
		"\nO resultado da MULTIPLICAÇÃO dos 4 números inserido é " + mult);
		
		
	}

}
