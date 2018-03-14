package controller;
import util.Teclado;
import java.text.NumberFormat;

public class IMC {

	public static void main(String[] args) {
		double[] imc = new double[10];
		double[] peso = new double[10];
		double[] altura = new double[10];
		String[] nome = new String[10];
		NumberFormat nf = NumberFormat.getNumberInstance();
		
		for (int i = 0; i < imc.length; i++) {
			nome[i] = Teclado.lerTexto("Digite seu nome: ");
			altura[i] = Teclado.lerDouble("Digite sua altura: ");
			peso[i] = Teclado.lerDouble("Digite seu peso");
			imc[i] = peso[i]/(altura[i]*altura[i]);
		}
		for (int i = 0; i < imc.length; i++)
			System.out.println(nome[i] +
					" possui IMC" + nf.format(imc[i]));
 	}

}
