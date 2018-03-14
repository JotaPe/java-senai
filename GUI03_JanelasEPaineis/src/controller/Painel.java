package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame{
	
	//método construtor
	public Painel(){
		super("Título");

		ImageIcon icone1 = new ImageIcon("img/ic_youtube.png");
		ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
		ImageIcon icone3 = new ImageIcon("img/ic_download.gif");

		JLabel labelTexto = new JLabel("Texto e imagem no painel");
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);

		JPanel painel = new JPanel();
		painel.add(label3);
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		

		add(painel);//adicionando o painel à janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(500, 300);
		pack();//Redimensionar a janela ao menor tamanho possível desde que caiba o seu conteúdo
		setLocationRelativeTo(null);//Centraliza a janela na tela do PC ao ser executado
		setVisible(true);

		
	}//fim do construtor

	public static void main(String[] args) {
		new Painel();//chamada para executar o construtor

	}

}
