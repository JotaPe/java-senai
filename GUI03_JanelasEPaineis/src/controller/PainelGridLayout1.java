package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout1 extends JFrame{
	
	//m�todo construtor
	public PainelGridLayout1(){
		super("T�tulo");

		ImageIcon icone1 = new ImageIcon("img/ic_youtube.png");
		ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
		ImageIcon icone3 = new ImageIcon("img/ic_download.gif");

		JLabel labelTexto = new JLabel("Texto e imagem no painel");
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);

		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(2,2));//Layout em grade (2 linhas e 2 colunas)
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		
		add(painel);//adicionando o painel � janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();//Redimensionar a janela ao menor tamanho poss�vel desde que caiba o seu conte�do
		setVisible(true);

		
	}//fim do construtor

	public static void main(String[] args) {
		new PainelGridLayout1();

	}

}
