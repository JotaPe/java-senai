package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoComScroll extends JFrame {
	public AreaDeTextoComScroll() {
		super("Área de Texto com Scroll");

		JLabel label = new JLabel("Digite uma mensagem:");
		JTextArea areaDeTexto = new JTextArea(10, 30);

		JScrollPane sp = new JScrollPane(areaDeTexto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(sp);

		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new AreaDeTextoComScroll();
	}
}
