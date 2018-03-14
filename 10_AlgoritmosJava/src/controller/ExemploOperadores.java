package controller;

public class ExemploOperadores {

	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Trabalhando com p�s-fixado");
		x = 5;
		// p�s-fixado => x = 6 e y = 5
		y = x++; //x++ � o mesmo que x = x + 1
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("\nTrabalhando com pr�-fixado");
		x = 5;
		// pr�-fixado => x = 6 e y = 6
		y = ++x; 
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("\nOperador relacional de igualdade");
		int a = 10;
		if (a == 15){
			System.out.println("vari�vel a vale 15");
		} else {
			System.out.println("vari�vel a n�o vale 15, ela vale " + a);
		}//fim do if else
		
		System.out.println("\nOperador relacional \"Diferente de\"");
		if (a != 15){
			System.out.println("vari�vel a � diferente de 15");
		} else {
			System.out.println("vari�vel a � igual a 15");
		}//fim do if else
		
		System.out.println("\nOperadores L�gicos");
		//Lembrando que at� aqui x est� valendo 6 e a est� valendo 10
		
		System.out.println("\nif - primeiro exemplo &&");
		if ((x == 6) && (a == 10)){//&& significa e
			System.out.println("Os 2 testes deram verdadeiro");
		} else {
			System.out.println("Pelo menos 1 dos testes deu falso");
		}//fim do if else
		
		System.out.println("\nif - segundo exemplo &&");
		if ((x == 5) && (a == 10)){
			System.out.println("Os 2 testes deram verdadeiro");
		} else {
			System.out.println("Pelo menos 1 dos testes deu falso");
		}//fim do if else
		
		System.out.println("\nif - primeiro exemplo ||");
		if ((x == 5) || (a == 10)){//|| significa ou
			System.out.println("Pelo menos 1 dos testes deu verdadeiro");
		} else {
			System.out.println("Os 2 testes deram falso");
		}//fim do if else
		
		System.out.println("\nExemplo nega��o");
		if (!(a==20)){//se (negando(a==20))
			System.out.println("N�o � verdade que a vale 20");
		} else {
			System.out.println("a vale 20");
		}//fim do if else
		
		System.out.println("\nExemplo nega��o com vari�veis String");
		String nome = "Ana";
		
		if (!nome.equals("Jo�o")){//Se "nome" for diferente de "Jo�o"
			System.out.println("nome n�o � Jo�o");
		} else {
			System.out.println("nome � Jo�o");
		}


	}

}
