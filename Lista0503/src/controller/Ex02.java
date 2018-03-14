package controller;
import util.Teclado;

public class Ex02 {

	public static void main(String[] args) {
		int n = Teclado.lerInt("Digite p tamanho do vetor (>39)");
		if (n < 40) {
			System.out.println("Tamanho Incorreto");
			main(args);
		}
		
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Teclado.lerInt("Digite o termo " + i);
		}
		
		int y[] = new int[30];
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i + 10];
		}
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("Vetor Y: " + y[i]);
		}
		
		int w[] = new int[n / 2];
		for (int i = 0; i < w.length; i++) {
			if (i % 2 == 0) {
				w[i] = x[i];
			}
		}
		for (int i = 0; i < w.length; i++) {
			System.out.println("Vetor W: " + w[i]);
		}
		
		int z = Teclado.lerInt("Digite o termo a ser pesquisado");
		for (int i = 0; i < n; i++) {
			if (z == x[i]) {
				System.out.println("Termo encontrado na posição " + i);
			}
		}
		
		int menor = x[0];
		int maior = 0;
		
		for (int i = 0; i < n; i++) {
			if (menor < x[i]) {
				menor = x[i];
			}
			if (x[i] > maior) {
				maior = x[i];
			}
		}
		System.out.println("Maior valor " + maior);
		System.out.println("Menor valor " + menor);
	}
}
