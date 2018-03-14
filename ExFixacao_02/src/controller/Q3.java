package controller;

public class Q3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			double valSorteado = Math.random();//Um número decimal entre 0 e 1
			int resultado = (int) (valSorteado * 80);
			System.out.println("Valor sorteado " + i + ": " + resultado);
		}
	}
}
