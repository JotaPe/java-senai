package util;

public class GerarSenha {
	
	public static String gerarSenha(){
		String senha = "";
		for (int i = 0; i < 8; i++)
			senha += gerarCaracter(i);
		
		return senha;
	}
	
	public static char gerarCaracter(int i){
		char caracter = 0;
		
		switch (i % 4){
		case 0:
			// Intervalo de Letras Maiúsculas na Tabela ASCII
			caracter = gerarAleatorio(65,90);
			break;
			
		case 1:
			// Intervalo de Letras Minúsculas na Tabela ASCII
			caracter = gerarAleatorio(97,122);
			break;
			
		case 2:
			// Intervalo de Números na Tabela ASCII
			caracter = gerarAleatorio(48,57);
			break;
			
		case 3:
			// Intervalo de Números na Tabela ASCII
			caracter = gerarAleatorio(33,47);
			break;
		 
		}
		return caracter;
	}
	
	public static char gerarAleatorio(int inicio, int fim){
		return (char) (Math.random() * (fim - inicio + 1) + inicio);
	}

}
