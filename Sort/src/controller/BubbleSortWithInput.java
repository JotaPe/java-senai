package controller;
import util.Teclado;

public class BubbleSortWithInput {
	public static void main(String args[]){
		double[] vet = {8, 9, 3, 5, 1};
		double aux = 0;
		int i = 0;
		
		for (int x = 0; x < vet.length; x++) {
			vet[x] = Teclado.lerDouble("Digite 5 numeros: ");
		}
		System.out.println("Vetor desordenado: ");
		for(i = 0; i<5; i++){
			System.out.println(" "+vet[i]);
		}
		System.out.println(" ");
		
		for(i = 0; i<5; i++){
			for(int j = 0; j<4; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor organizado:");
		for(i = 0; i<5; i++){
			System.out.println(" "+vet[i]);
		}
	}
}

