package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		
		String nome;
		double n1, n2, n3, n4, media;
		
		nome = Teclado.lerTexto("Informe o nome do aluno:");
		n1 = Teclado.lerDouble("Informe a nota 1 do aluno:");
		n2 = Teclado.lerDouble("Informe a nota 2 do aluno:");
		n3 = Teclado.lerDouble("Informe a nota 3 do aluno:");
		n4 = Teclado.lerDouble("Informe a nota 4 do aluno:");
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Aluno: " + nome);
		System.out.println("Média: " + media);
		

	}

}
