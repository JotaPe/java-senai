package controller;

public class Q3_Q9 {

	public static void main(String[] args) {
		
		//Este algoritmo n�o gera erros pois n�o tem intera��o com o usu�rio

		for (int i = 1; i <= 10; i++) {
			double valSorteado = Math.random();
			int resultado = (int) (valSorteado * 80);
			System.out.println("Valor sorteado " + i + ": " + resultado);
		}
	}
}
