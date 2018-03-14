package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora {

	JFrame frame;
	Container tela;
	JTextField campoNr1;
	JComboBox comboOperacao;
	JTextField campoNr2;
	JButton botaoOperacao;
	JTextField campoResultado;

	public Calculadora() {

		frame = new JFrame();
		frame.setTitle("CALCULADORA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 500);
		frame.setLayout(null);

		tela = frame.getContentPane();

		campoNr1 = new JTextField();// Caixa que será inserido o texto
		campoNr1.setBounds(200, 200, 75, 20);
		tela.add(campoNr1);

		comboOperacao = new JComboBox();
		comboOperacao.setBounds(280, 200, 40, 20);
		comboOperacao.addItem("+");
		comboOperacao.addItem("-");
		comboOperacao.addItem("*");
		comboOperacao.addItem("/");
		tela.add(comboOperacao);

		campoNr2 = new JTextField();// Caixa que será inserido o texto
		campoNr2.setBounds(325, 200, 75, 20);
		tela.add(campoNr2);

		botaoOperacao = new JButton("=");
		botaoOperacao.setBounds(405, 200, 50, 20);
		botaoOperacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				float nr1, nr2, resultado = 0;
				String str;
				str = (String) comboOperacao.getSelectedItem();
				nr1 = Float.parseFloat(campoNr1.getText());
				nr2 = Float.parseFloat(campoNr2.getText());

				if (str.equals("+")) {
					resultado = nr1 + nr2;
				}
				if (str.equals("-")) {
					resultado = nr1 - nr2;
				}
				if (str.equals("*")) {
					resultado = nr1 * nr2;
				}
				if (str.equals("/")) {
					resultado = nr1 / nr2;
				}
				campoResultado.setText(resultado + "");

			}
		});

		tela.add(botaoOperacao);

		campoResultado = new JTextField();// Caixa que será inserido o texto
		campoResultado.setBounds(460, 200, 75, 20);

		tela.add(campoResultado);

		frame.setVisible(true);

	}

}
