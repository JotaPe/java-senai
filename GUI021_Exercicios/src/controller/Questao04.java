package controller;

import javax.swing.JOptionPane;

public class Questao04 {
	
	/*
	 * Fazer um programa que pergunte um número inteiro e 
	 * apresente o seu antecessor e seu sucessor.
	 */

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		JOptionPane.showMessageDialog(null, "O antecessor é " + (num-1) + 
				"\nO sucessor é " + (num+1));
		
	}

}
