package controller;

public class Q4_Q9 {

	public static void main(String[] args) {
		
		//Este algoritmo não gera erros pois não tem interação com o usuário
		
		int vetorDeSorteados[] = new int[2];
		
		for (int i = 0; i < vetorDeSorteados.length; i++) {
			double valSorteado = Math.random();
			int resultado = (int) (valSorteado * 100);
			System.out.println("Valor sorteado: " + resultado);
			vetorDeSorteados[i] = resultado;
		}
		
		int maior;
		maior = Math.max(vetorDeSorteados[0], vetorDeSorteados[1]);
		System.out.println("Entre " + vetorDeSorteados[0] + " e " + vetorDeSorteados[1] + 
			", o maior valor é " + maior);
	}

}
