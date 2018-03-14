package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class Q6_Q9 {

	public static void main(String[] args) {
		
		//Este algoritmo n�o gera erros pois n�o tem intera��o com o usu�rio
		
		double valor = 123456.789;
		
		NumberFormat canada = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println("Canad�: " + canada.format(valor));
		
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		System.out.println("China: " + china.format(valor));
		
		NumberFormat franca = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("Fran�a: " + franca.format(valor));
		
		NumberFormat alemanha = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println("Alemanha: " + alemanha.format(valor));
		
		NumberFormat japao = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Jap�o: " + japao.format(valor));
		
		NumberFormat eua = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Estados Unidos: " + eua.format(valor));
		
		NumberFormat italia = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("It�lia: " + italia.format(valor));
		
		Locale brasil = new Locale("pt", "BR");
		NumberFormat br = NumberFormat.getCurrencyInstance(brasil);
		System.out.println("Brasil: " + br.format(valor));
	
	}

}
