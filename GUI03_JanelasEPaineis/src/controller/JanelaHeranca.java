package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaHeranca extends JFrame{
	
	//método construtor
	public JanelaHeranca(){
		super("Título: Janela com Herança");
		
		setSize(500, 300);//largura e altura da janela
		setResizable(false);//Impede que a janela seja redimensionada
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fechar a janela e sair ao clicar no X

		ImageIcon icone = new ImageIcon("img/ic_curtir.gif");
		setIconImage(icone.getImage());

		setLocationRelativeTo(null);//Faz a janela aparecer no centro da tela

		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new JanelaHeranca();

	}

}
