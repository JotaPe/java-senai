package controller;

import javax.swing.JOptionPane;

public class Questao07 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		JOptionPane.showMessageDialog(null, "Tabuada:\n" + num + ".1="
				+ num * 0 + "\n" + num + ".1=" + num * 1 + "\n" + num + ".2="
				+ num * 2 + "\n" + num + ".3=" + num * 3 + "\n" + num + ".4="
				+ num * 4 + "\n" + num + ".5=" + num * 5 + "\n" + num + ".6="
				+ num * 6 + "\n" + num + ".7=" + num * 7 + "\n" + num + ".8="
				+ num * 8 + "\n" + num + ".9=" + num * 9 + "\n" + num + ".10="
				+ num * 10 + "\n");
	}
}
