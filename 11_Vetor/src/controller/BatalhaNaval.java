package controller;

import util.Teclado;

public class BatalhaNaval {

	public static void main(String[] args) {
		// primeiro indice da linha, depois o indice da coluna
		String arena[][] = new String[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arena[i][j] = "�gua";
			}
		}

		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Avi�es";
		arena[0][2] = "Navio";

		int linha, coluna;

		linha = Teclado.lerInt("Digite a coordenada da linha: ");
		coluna = Teclado.lerInt("Digite a coordenada da coluna: ");

		System.out.println("Voc� acertou: " + arena[linha][coluna]);

	}

}
