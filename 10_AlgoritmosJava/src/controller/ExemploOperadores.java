package controller;

public class ExemploOperadores {

	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Trabalhando com pós-fixado");
		x = 5;
		// pós-fixado => x = 6 e y = 5
		y = x++; //x++ é o mesmo que x = x + 1
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("\nTrabalhando com pré-fixado");
		x = 5;
		// pré-fixado => x = 6 e y = 6
		y = ++x; 
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("\nOperador relacional de igualdade");
		int a = 10;
		if (a == 15){
			System.out.println("variável a vale 15");
		} else {
			System.out.println("variável a não vale 15, ela vale " + a);
		}//fim do if else
		
		System.out.println("\nOperador relacional \"Diferente de\"");
		if (a != 15){
			System.out.println("variável a é diferente de 15");
		} else {
			System.out.println("variável a é igual a 15");
		}//fim do if else
		
		System.out.println("\nOperadores Lógicos");
		//Lembrando que até aqui x está valendo 6 e a está valendo 10
		
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
		
		System.out.println("\nExemplo negação");
		if (!(a==20)){//se (negando(a==20))
			System.out.println("Não é verdade que a vale 20");
		} else {
			System.out.println("a vale 20");
		}//fim do if else
		
		System.out.println("\nExemplo negação com variáveis String");
		String nome = "Ana";
		
		if (!nome.equals("João")){//Se "nome" for diferente de "João"
			System.out.println("nome não é João");
		} else {
			System.out.println("nome é João");
		}


	}

}
