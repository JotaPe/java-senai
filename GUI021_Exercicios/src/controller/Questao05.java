package controller;

import javax.swing.JOptionPane;

public class Questao05 {
	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane
				.showInputDialog("Digite um n�mero"));

		if (num > 20) {
			double num2 = num / 2;
			JOptionPane.showMessageDialog(null,
					"N�mero maior que 20, mostrando sua metade" + num2);
		} else {
			JOptionPane.showMessageDialog(null,
					"N�mero menor ou igual a 20, mostrando ele mesmo" + num);
		}
	}
}
