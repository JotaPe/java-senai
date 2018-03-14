package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalculaView extends JFrame {

	private JTextField primeiroNumero = new JTextField(10);
	private JTextField segundoNumero = new JTextField(10);
	private JTextField resultado = new JTextField(10);
	private JLabel sinalMais = new JLabel();
	private JLabel sinalIgual = new JLabel(" = ");
	private JRadioButton CalculaSoma = new JRadioButton("Adição");
	private JRadioButton CalculaSubtrai = new JRadioButton("Subtração");
	private JRadioButton CalculaMultiplica = new JRadioButton("Multiplicação");
	private JRadioButton CalculaDivide = new JRadioButton("Divisão");

	public CalculaView() {
		super("Calculadora");

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(CalculaSoma);
		grupo.add(CalculaSubtrai);
		grupo.add(CalculaMultiplica);
		grupo.add(CalculaDivide);

		resultado.setEditable(false);

		JPanel painel = new JPanel();
		painel.add(primeiroNumero);
		painel.add(sinalMais);
		painel.add(segundoNumero);
		painel.add(sinalIgual);
		painel.add(resultado);

		JPanel radio = new JPanel();
		painel.add(CalculaSoma);
		painel.add(CalculaSubtrai);
		painel.add(CalculaMultiplica);
		painel.add(CalculaDivide);

		Container container = getContentPane();
		container.add(painel, BorderLayout.CENTER);
		container.add(radio, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public int getResultado() {
		return Integer.parseInt(resultado.getText());
	}

	public void setResultado(int resultado) {
		this.resultado.setText(Integer.toString(resultado));
	}

	public void setResultadoDivisao(double resultado) {
		this.resultado.setText(Double.toString(resultado));
	}

	public int getPrimeiroNumero() {
		return Integer.parseInt(primeiroNumero.getText());
	}

	public int getSegundoNumero() {
		return Integer.parseInt(segundoNumero.getText());
	}

	public void addCalculaSomaListener(ActionListener listenerDoBotaoCalculaSoma) {
		CalculaSoma.addActionListener(listenerDoBotaoCalculaSoma);
	}

	public void addCalculaSubtraiListener(ActionListener listenerDoBotaoCalculaSubtrai) {
		CalculaSubtrai.addActionListener(listenerDoBotaoCalculaSubtrai);
	}

	public void addCalculaMultiplicaListener(ActionListener listenerDoBotaoCalculaMultiplica) {
		CalculaMultiplica.addActionListener(listenerDoBotaoCalculaMultiplica);
	}

	public void addCalculaDivideListener(ActionListener listenerDoBotaoCalculaDivide) {
		CalculaDivide.addActionListener(listenerDoBotaoCalculaDivide);
	}

	public void exibeMensagemDeErro(String mensagemDeErro) {
		JOptionPane.showMessageDialog(this, mensagemDeErro, "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);

	}
}
