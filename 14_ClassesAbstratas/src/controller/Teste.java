package controller;

import model.Aluno;
import model.Professor;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		/*
		 * Tipo: 0 para usu�rio, 1 para aluno e 2 para professor
		 */
		

		//A linha abaixo foi desativada pois n�o � poss�vel criar um objeto de uma classe abstrata
		//Usuario usu = new Usuario ("usuario", "123", 0);
		
		Aluno alu = new Aluno 
				("aluno", "456", 1, 3500, "Nath�lia Oliveira", "Manh�", "2014029");
		
		Professor prf = new Professor 
				("professor", "789", 2, 174, "Jorge Nogueira", "Programa��o");
		
		alu.mostrar();
		System.out.println();
		prf.mostrar();
		

	}

}
