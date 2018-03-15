package controller;
import java.text.NumberFormat;
import util.Teclado;

public class Ex02 {
public static void main(String[] args) {
	int qt;
	double valorUni, valorTotal = 0;
	String op = "N";
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	System.out.println("Iniciando rotina");
	do {
		valorUni = Teclado.lerDouble("Valor do produto: ");
		qt = Teclado.lerInt("Quantidade do produto: ");
		op = Teclado.lerTexto("Deseja sair ? (S/N)");
		valorTotal += (valorUni * qt);
	} while (!op.equals("S"));
	System.out.println("Valor total: " + nf.format(valorTotal));
}
}
