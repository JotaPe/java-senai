package controller;

import javax.swing.JOptionPane;

public class Questao08 {
	public static void main(String[] args) {
		String[] vetSigla = { "RJ", "SP", "MG", "Outros" };
		Object objeto = JOptionPane.showInputDialog(null, "Janela de Entrada",
				"Estados", JOptionPane.PLAIN_MESSAGE, null, vetSigla,
				vetSigla[0]);

		if (objeto.equals("RJ")) {
			JOptionPane.showMessageDialog(null, "Carioca, olha a bala perdida!");
		} else {
			if (objeto.equals("SP")) {
				JOptionPane.showMessageDialog(null, "Paulista, ôloco meu, olha essa poluição");
			} else {
				if (objeto.equals("MG")) {
					JOptionPane.showMessageDialog(null, "Mineiro, uai, caiu um trem no meu pão de queijo");
				} else {
					JOptionPane.showMessageDialog(null, "Outros Estados");
				}
			}
		}
	}
}
