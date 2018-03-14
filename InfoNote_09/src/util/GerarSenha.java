package util;

public class GerarSenha {
	
	public static String gerarSenha(){
		String senha = "";
		for (int i = 0; i < 8; i++)
			senha += gerarCaracter(i);
		
		/*
		 * a += b � a mesma coisa que a = a + b;
		 * a -= b � a mesma coisa que a = a - b;
		 * a *= b � a mesma coisa que a = a * b;
		 */
		
		return senha;
		
	}//fim do gerarSenha
	
	public static char gerarCaracter(int i){
		char caracter = 0;
		
		switch (i % 4){//esse resto s� pode dar 0, 1 , 2 ou 3
		case 0:
			// Intervalo de Letras Mai�sculas na Tabela ASCII
			caracter = gerarAleatorio(65,90);
			break;
			
		case 1:
			// Intervalo de Letras Min�sculas na Tabela ASCII
			caracter = gerarAleatorio(97,122);
			break;
			
		case 2:
			// Intervalo de N�meros na Tabela ASCII
			caracter = gerarAleatorio(48,57);
			break;
			
		case 3:
			// Intervalo de Caracteres Especiais na Tabela ASCII
			caracter = gerarAleatorio(33,47);
			break;
		 
		}
		return caracter;
	}
	
	public static char gerarAleatorio(int inicio, int fim){
		return (char) (Math.random() * (fim - inicio + 1) + inicio);
	}

}
