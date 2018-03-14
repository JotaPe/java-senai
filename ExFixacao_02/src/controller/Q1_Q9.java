package controller;

import util.Teclado;

public class Q1_Q9 {

	public static void main(String[] args) {
		
		try{
		
		String frase, palavra1, maiuscula, minuscula, pos10a18, apos25;
		
		frase = Teclado.lerTexto("Digite uma frase que seja importante em sua vida");
		
		palavra1 = frase.substring(0, frase.indexOf(' '));
		System.out.println("Primeira palavra: " + palavra1);
		
		maiuscula = frase.toUpperCase();
		System.out.println("Frase em letras maiúsculas: " + maiuscula);
		
		minuscula = palavra1.toLowerCase();
		System.out.println("Primeira palavra em letras minúsculas: " + minuscula);
		
		pos10a18 = frase.substring(10,18);
		System.out.println("Caracteres entre as posições 10 e 18: " + pos10a18);
		
		apos25 = frase.substring(25);
		System.out.println("Caracteres após a posição 25: " + apos25);
		
		
		} catch (StringIndexOutOfBoundsException sioobe){
			System.out.println("A frase digitada deve possuir mais de uma palavra e " +
					"mais de 25 letras");
			Teclado.lerTexto("Pressione uma tecla para continuar");
			main(args);//Chamando o próprio método main
		}
		

	}

}
