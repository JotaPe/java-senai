package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Programa��o Desktop"); // JFrame � janela
	    JLabel texto = new JLabel("Ol�, Mundo!"); // JLabel � etiqueta

	    tela.setLayout(null);
	    tela.getContentPane().add(texto); // Adicionei a etiqueta (texto) � janela (tela)

	    /*
	     *  S�o 4 n�meros (em pixels):
	     *  1� - dist�ncia da borda esquerda da tela
	     *  2� - dist�ncia da borda superior da tela
	     *  3� - tamanho na horizontal do espa�o para o texto
	     *  4� - tamanho na vertical do espa�o para o texto 
	     */
	    texto.setBounds(50 , 20 , 210 , 20);

	    tela.setSize(400,100);// largura e altura da janela
	    tela.setVisible(true); //Visibilidade da janel 
	    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar a janela ao clicar no X

	}

}
