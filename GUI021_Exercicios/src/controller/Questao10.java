package controller;

import javax.swing.JOptionPane;

public class Questao10 {
	
	/*
	 * Desenvolver um programa que pergunte 4 notas escolares de um aluno e 
	 * exiba mensagem informando que o aluno foi aprovado se a m�dia escolar 
	 * for maior ou igual a 5. Se o aluno n�o foi aprovado, 
	 * indicar uma mensagem informando essa condi��o. 
	 * Apresentar junto com a mensagem de aprova��o ou reprova��o o valor 
	 * da m�dia obtida pelo aluno.
	 */

	public static void main(String[] args) {
		
		double n1, n2, n3, n4, media;
		String situacao; //aprovado ou reprovado
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4:"));
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if ( media >= 5 ){
			situacao = "APROVADO";
		} else {
			situacao = "REPROVADO";
		}
		
		JOptionPane.showMessageDialog(null, "Nota 1: " + n1 +
				"\nNota 2: " + n2 +
				"\nNota 3: " + n3 +
				"\nNota 4: " + n4 +
				"\nM�dia: " + media +
				"\nSitua��o: " + situacao);
	}
}
