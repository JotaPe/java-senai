package controller;

public class QuickSortWithRandom {
	private int array[];
    private int comprimento;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        comprimento = inputArr.length;
        quickSort(0, comprimento - 1);
    }
 
    private void quickSort(int menorIndice, int 
    		maiorIndice) {
         
        int i = menorIndice;
        int j = maiorIndice;
        // calcula o número do meio (pivô)
        int pivo = array[menorIndice+(
        		maiorIndice-menorIndice)/2];
        // Divide em dois arrays
        while (i <= j) {
            /**
             * Em cada loop, vamos identificar um 
             * número a esquerda que
             * é maior que o pivô e um número a 
             * direita que é menor que o
             * pivô e vamos trocá-los
             */
            while (array[i] < pivo) {
                i++;
            }
            while (array[j] > pivo) {
                j--;
            }
            if (i <= j) {
                trocaNumeros(i, j);
                //move o índice
                i++;
                j--;
            }
        }
        // chama o método quicksort
        if (menorIndice < j)
            quickSort(menorIndice, j);
        if (i < maiorIndice)
            quickSort(i, maiorIndice);
    }
 
    private void trocaNumeros(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        QuickSortWithRandom sorter = new QuickSortWithRandom();
        int[] input = new int[10000];
		for(int x = 0; x < input.length; x++) {
			double valSorteado = Math.random();
			input[x] = (int) (valSorteado * 10000);
		}
		for (int y = 0; y < 10000; y++) { }
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}

