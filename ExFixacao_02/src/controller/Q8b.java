package controller;

import util.Teclado;

public class Q8b {
	
	static int i = 0;
	
	public static void main(String[] args) {
		
		try {
			
			int a = Teclado.lerInt("Digite um n�mero inteiro:");
			System.out.println("O n�mero digitado � " + a);
			

		} catch (NumberFormatException nfe) {
			
			i = i + 1;
			if (i >= 3) {
				System.out.println("Excedeu o limite de tentativas");
				
			} else {
				System.out.println("Valor informado precisa ser n�mero inteiro");
				main(args);
			}

		}

	}

}
