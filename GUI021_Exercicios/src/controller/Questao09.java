package controller;

import javax.swing.JOptionPane;

public class Questao09 {
	public static void main(String[] args) {
		String nome[] = new String[5];
		String profissao[] = new String[5];

		for (int i = 0; i < 5; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite seu nome");
			profissao[i] = JOptionPane.showInputDialog("Digite sua profiss�o");
		}

		JOptionPane.showMessageDialog(null, "Nome " + nome[0] + " � "
				+ profissao[0] + "\n" + "Nome " + nome[1] + " � "
				+ profissao[1] + "\n" + "Nome " + nome[2] + " � "
				+ profissao[2] + "\n" + "Nome " + nome[3] + " � "
				+ profissao[3] + "\n" + "Nome " + nome[4] + " � "
				+ profissao[4]);
	}
}
