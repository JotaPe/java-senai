package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Programação Desktop"); // JFrame é janela
	    JLabel texto = new JLabel("Olá, Mundo!"); // JLabel é etiqueta

	    tela.setLayout(null);
	    tela.getContentPane().add(texto); // Adicionei a etiqueta (texto) à janela (tela)

	    /*
	     *  São 4 números (em pixels):
	     *  1º - distância da borda esquerda da tela
	     *  2º - distância da borda superior da tela
	     *  3º - tamanho na horizontal do espaço para o texto
	     *  4º - tamanho na vertical do espaço para o texto 
	     */
	    texto.setBounds(50 , 20 , 210 , 20);

	    tela.setSize(400,100);// largura e altura da janela
	    tela.setVisible(true); //Visibilidade da janel 
	    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar a janela ao clicar no X

	}

}
