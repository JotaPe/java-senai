package controller;

import javax.swing.JOptionPane;

public class Questao01 {

	
	/*
	 * Desenvolver um programa que pergunte ao usu�rio o seu nome completo e seu sexo. 
	 * Em seguida, o programa deve apresentar os dados anteriormente informados.
	 */

	public static void main(String[] args) {
				
		String nome;//Vari�vel chamada nome do tipo String (texto)
		String sexo;
		
		nome = JOptionPane.showInputDialog("Informe o seu nome completo:");
		sexo = JOptionPane.showInputDialog("Informe o seu sexo:");
		
		JOptionPane.showMessageDialog
		(null, "O nome informado � " + nome + "\nO sexo informado � " + sexo);
	}
}
