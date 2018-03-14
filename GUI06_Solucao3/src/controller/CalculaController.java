package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculaModel;
import view.CalculaView;

public class CalculaController {
	private CalculaView calculaView = new CalculaView();
	private CalculaModel calculaModel = new CalculaModel();

	public CalculaController() {
		this.calculaView.addCalculaSomaListener(new CalculaSomaListener());
		this.calculaView.addCalculaSubtraiListener(new CalculaSubtraiListener());
		this.calculaView.addCalculaMultiplicaListener(new CalculaMultiplicaListener());
		this.calculaView.addCalculaDivideListener(new CalculaDivideListener());
		this.calculaView.setVisible(true);

	}

	class CalculaSomaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				calculaModel.setPrimeiroNumero(calculaView.getPrimeiroNumero());
				calculaModel.setSegundoNumero(calculaView.getSegundoNumero());

				calculaView.setResultado(calculaModel.somaDoisNumeros());
			} catch (NumberFormatException nfe) {
				calculaView.exibeMensagemDeErro("Digite 2 N�meros Inteiros V�lidos.");

			}
		}
	}
	class CalculaSubtraiListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				calculaModel.setPrimeiroNumero(calculaView.getPrimeiroNumero());
				calculaModel.setSegundoNumero(calculaView.getSegundoNumero());

				calculaView.setResultado(calculaModel.subtraiDoisNumeros());
			} catch (NumberFormatException nfe) {
				calculaView.exibeMensagemDeErro("Digite 2 N�meros Inteiros V�lidos.");

			}
		}
	}
	class CalculaMultiplicaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				calculaModel.setPrimeiroNumero(calculaView.getPrimeiroNumero());
				calculaModel.setSegundoNumero(calculaView.getSegundoNumero());

				calculaView.setResultado(calculaModel.multiplicaDoisNumeros());
			} catch (NumberFormatException nfe) {
				calculaView.exibeMensagemDeErro("Digite 2 N�meros Inteiros V�lidos.");

			}
		}
	}
	class CalculaDivideListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				calculaModel.setPrimeiroNumero(calculaView.getPrimeiroNumero());
				calculaModel.setSegundoNumero(calculaView.getSegundoNumero());

				calculaView.setResultadoDivisao(calculaModel.divideDoisNumeros());
			} catch (NumberFormatException nfe) {
				calculaView.exibeMensagemDeErro("Digite 2 N�meros Inteiros V�lidos.");

			}
		}
	}

	public static void main(String[] args) {
		new CalculaController();

	}

}
