package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();

		janela.setTitle("Título da Janela");
		janela.setSize(500, 300);//largura e altura da janela
		janela.setResizable(false);//Impede que a janela seja redimensionada
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fechar a janela e sair ao clicar no X

		ImageIcon icone = new ImageIcon("img/ic_curtir.gif");
		janela.setIconImage(icone.getImage());

		janela.setLocationRelativeTo(null);//Faz a janela aparecer no centro da tela

		janela.setVisible(true);


	}

}
