package controller;

import javax.swing.JOptionPane;

public class Questao03 {
	
	/*
	 * Fazer um programa que pergunte um valor em D�lares e 
	 * apresente o equivalente em Reais. Considere U$1,00 = R$1,72.
	 */

	public static void main(String[] args) {
		
		double dolar, real;
		
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor � D�lar:"));
		real = dolar * 3.15;
		JOptionPane.showMessageDialog(null, dolar + " D�lares = " + real + " Reais");
		
	}

}
