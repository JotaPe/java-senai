package controller;

import javax.swing.JOptionPane;

public class Questao04 {
	
	/*
	 * Fazer um programa que pergunte um n�mero inteiro e 
	 * apresente o seu antecessor e seu sucessor.
	 */

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		JOptionPane.showMessageDialog(null, "O antecessor � " + (num-1) + 
				"\nO sucessor � " + (num+1));
		
	}

}
