package controller;

import util.Teclado;

public class Q1 {

	public static void main(String[] args) {
		
		String frase, palavra1, maiuscula, minuscula, pos10a18, apos25;
		
		frase = Teclado.lerTexto("Digite uma frase que seja importante em sua vida");
		
		palavra1 = frase.substring(0, frase.indexOf(' '));//infonote
		System.out.println("Primeira palavra: " + palavra1);
		
		maiuscula = frase.toUpperCase();//Classe ExemploMetodoString - Proj 16
		System.out.println("Frase em letras maiúsculas: " + maiuscula);
		
		minuscula = palavra1.toLowerCase();//Classe ExemploMetodoString - Proj 16
		System.out.println("Primeira palavra em letras minúsculas: " + minuscula);
		
		pos10a18 = frase.substring(10,18);//Classe ExemploMetodoString - Proj 16
		System.out.println("Caracteres entre as posições 10 e 18: " + pos10a18);
		
		apos25 = frase.substring(25);//Classe ExemploMetodoString - Proj 16
		System.out.println("Caracteres após a posição 25: " + apos25);
		


	}

}
