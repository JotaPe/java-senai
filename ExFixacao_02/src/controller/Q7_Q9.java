package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import util.Teclado;

public class Q7_Q9 {

	public static void main(String[] args) {

		try {

			String nascimento;
			nascimento = Teclado.lerTexto("Informe a data de seu nascimento no padr�o dd/mm/aaaa:");

			String dia, mes, ano;
			System.out.println("Nascimento: ");

			dia = nascimento.substring(0, 2);
			System.out.println("Dia: " + dia);

			mes = nascimento.substring(3, 5);
			System.out.println("M�s: " + mes);

			ano = nascimento.substring(6);
			System.out.println("Ano: " + ano);

			String americano;
			americano = ano + "-" + mes + "-" + dia;
			System.out.println("Nascimento no padr�o americano: " + americano);

			String niver2012 = dia + "-" + mes + "-" + "2012";
			System.out.println("Anivers�rio em 2012: " + niver2012);

			// Convertendo de String para int, pois a Classe GregorianCalendar n�o trabalha com String
			int diaint = Integer.parseInt(dia);
			int mesint = (Integer.parseInt(mes)) - 1; 
			int anoint = Integer.parseInt(ano);
			Calendar datanasc = new GregorianCalendar(anoint, mesint, diaint);

			System.out.println("Dia da semana de seu nascimento: "
					+ datanasc.get(Calendar.DAY_OF_WEEK));

			System.out.println("Dia do ano de seu nascimento: "
					+ datanasc.get(Calendar.DAY_OF_YEAR));

			Calendar data2012 = new GregorianCalendar(2012, mesint, diaint);

			System.out.println("Dia da semama do seu anivers�rio em 2012: "
					+ data2012.get(Calendar.DAY_OF_WEEK));

			System.out.println("N�mero da semama no ano, do seu anivers�rio em 2012: "
							+ data2012.get(Calendar.WEEK_OF_YEAR));

			Calendar hoje = new GregorianCalendar();

			int calculo = data2012.get(Calendar.YEAR);
			int calculo2 = hoje.get(Calendar.YEAR);
			int anos = calculo2 - calculo - 1;

			int diferenca = (365 - (data2012.get(Calendar.DAY_OF_YEAR)) + (anos * 365))
					+ hoje.get(Calendar.DAY_OF_YEAR);
			System.out.println("A diferen�a entre a data do seu anivers�rio em 2012 e a data de hoje � de "
							+ diferenca + " dias.");

		} catch (NumberFormatException nfe) {
			System.out.println("\n\nERRO. Favor inserir a data no formato dd/mm/aaaa");
			Teclado.lerTexto("Pressione <ENTER> para continuar");
			main(args);
			
		} catch (StringIndexOutOfBoundsException sioobe) {
			System.out.println("\n\nERRO. A data inserida n�o est� no padr�o solicitado");
			Teclado.lerTexto("Pressione <ENTER> para continuar");
			main(args);
		}

	}

}
