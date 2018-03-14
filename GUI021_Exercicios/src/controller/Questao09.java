package controller;

import javax.swing.JOptionPane;

public class Questao09 {
	public static void main(String[] args) {
		String nome[] = new String[5];
		String profissao[] = new String[5];

		for (int i = 0; i < 5; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite seu nome");
			profissao[i] = JOptionPane.showInputDialog("Digite sua profissão");
		}

		JOptionPane.showMessageDialog(null, "Nome " + nome[0] + " é "
				+ profissao[0] + "\n" + "Nome " + nome[1] + " é "
				+ profissao[1] + "\n" + "Nome " + nome[2] + " é "
				+ profissao[2] + "\n" + "Nome " + nome[3] + " é "
				+ profissao[3] + "\n" + "Nome " + nome[4] + " é "
				+ profissao[4]);
	}
}
