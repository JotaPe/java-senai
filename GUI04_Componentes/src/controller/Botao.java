package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Botao extends JFrame {
	public Botao() {
		super("Botão");

		JButton botao = new JButton("Botão 1");
		botao.setToolTipText("Clica em mim !!!");
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Você clicou no botão 1");
			}
		});

		JPanel painel = new JPanel();
		painel.add(botao);

		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Botao();
	}

}