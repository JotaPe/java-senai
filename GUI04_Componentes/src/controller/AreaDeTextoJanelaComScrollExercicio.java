package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AreaDeTextoJanelaComScrollExercicio extends JFrame{
	public AreaDeTextoJanelaComScrollExercicio(){
		super("área de Texto Janela com Scroll");
		
		JLabel label = new JLabel("Digite uma mensagem:");
		JTextField texto = new JTextField(20);
		JTextArea areaDeTexto = new JTextArea(10,30);
		JButton botao = new JButton("Botao");
		label.setToolTipText("Digita nimim");
		
		
		
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);
		painel.add(botao);
		
		JScrollPane sp = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(sp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		
	}
public static void main(String[] args) {
	new AreaDeTextoJanelaComScrollExercicio();
}
}
