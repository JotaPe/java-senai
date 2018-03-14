package controller;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {

		String[] paises = { "Brasil", "Russia", "India", "China" };
		//Exibindo o vetor inteiro po ruma �nica linha usando 
		//o m�todo toString da API Arrays
		System.out.println(Arrays.toString(paises));

		
		//Verificando em qual �ndice do vetor est� o termo R�ssia
		//e salvando em posicao
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);

		//Colocando o vetor em ordem alfab�tica
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
	}

}
