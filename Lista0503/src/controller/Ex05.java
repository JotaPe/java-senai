package controller;
import java.text.NumberFormat;
import util.Teclado;

public class Ex05 {
	public static void main(String[] args) {
		double vm = Teclado.lerInt("Digite a velocidade m�xima permitida");
		double velocarro;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		do {
			velocarro = Teclado.lerInt("Digite a velocidade do veiculo");
			if (velocarro > vm) {
				double excedente = velocarro-vm;
				excedente = excedente * 5;
				if (excedente < 190) {
					System.out.println("Voc� ultrapassou o limite,"
							+ " multa de " + nf.format(excedente));
				} else {
					System.out.println("Voc� ultrapassou o limite,"
							+ " multa de R$190,00");
				}
			} else {
				System.out.println("Parab�ns, sem multa");
			}
		} while (velocarro >= 0);
		System.out.println("FIM");
	}
}