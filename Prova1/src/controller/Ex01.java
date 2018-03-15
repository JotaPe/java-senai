package controller;

import java.text.NumberFormat;

import util.Teclado;

public class Ex01 {
public static void main(String[] args) {
	String nome;
	double n1, n2, n3, n4, m;
	nome = Teclado.lerTexto("Digite seu nome: ");
	n1 = Teclado.lerDouble("Nota 1: ");
	n2 = Teclado.lerDouble("Nota 2: ");
	n3 = Teclado.lerDouble("Nota 3: ");
	n4 = Teclado.lerDouble("Nota 4: ");
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	
	m = ((n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4))/10;
	if (m >= 7) {
		System.out.println("Aluno: " + nome + " foi Aprovado");
		System.out.println("Média: " + nf.format(m));
	} else {
		if (m < 5) {
			System.out.println("Aluno: " + nome + " foi Reprovado");
			System.out.println("Média: " + nf.format(m));
		} else {
			System.out.println("Aluno: " + nome + " ficou Recuperação");
			System.out.println("Média: " + nf.format(m));
		}
	}
}
}
