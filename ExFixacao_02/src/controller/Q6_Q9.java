package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class Q6_Q9 {

	public static void main(String[] args) {
		
		//Este algoritmo não gera erros pois não tem interação com o usuário
		
		double valor = 123456.789;
		
		NumberFormat canada = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println("Canadá: " + canada.format(valor));
		
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		System.out.println("China: " + china.format(valor));
		
		NumberFormat franca = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("França: " + franca.format(valor));
		
		NumberFormat alemanha = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println("Alemanha: " + alemanha.format(valor));
		
		NumberFormat japao = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Japão: " + japao.format(valor));
		
		NumberFormat eua = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Estados Unidos: " + eua.format(valor));
		
		NumberFormat italia = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("Itália: " + italia.format(valor));
		
		Locale brasil = new Locale("pt", "BR");
		NumberFormat br = NumberFormat.getCurrencyInstance(brasil);
		System.out.println("Brasil: " + br.format(valor));
	
	}

}
