package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculaView extends JFrame {
	
	private JTextField primeiroNumero = new JTextField(10);
	private JTextField segundoNumero = new JTextField(10);
	private JTextField resultado = new JTextField(10);
	private JLabel sinalMais = new JLabel (" + ");
	private JLabel sinalIgual = new JLabel (" = ");
	private JButton botaoCalcula = new JButton("Calcula");
	
	public CalculaView(){
		super ("Calculadora");
		
		resultado.setEditable(false);
		
		JPanel painel = new JPanel();
		painel.add(primeiroNumero);
		painel.add(sinalMais);
		painel.add(segundoNumero);
		painel.add(sinalIgual);
		painel.add(resultado);
		
		Container container = getContentPane();
		container.add(painel, BorderLayout.CENTER);
		container.add(botaoCalcula, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	public int getResultado(){
		return Integer.parseInt(resultado.getText());
	}
public void setResultado(int resultado){
	this.resultado.setText(Integer.toString(resultado));
}
public int getPrimeiroNumero() {
	return Integer.parseInt(primeiroNumero.getText());
}
public int getSegundoNumero(){
	return Integer.parseInt(segundoNumero.getText());
}
public void addCalculaListener(ActionListener listenerDoBotaoCalcula){
	botaoCalcula.addActionListener(listenerDoBotaoCalcula);
}
public void exibeMensagemDeErro(String mensagemDeErro){
	JOptionPane.showMessageDialog(this, mensagemDeErro, "Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
	
}
}
