package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculaModel;
import view.CalculaView;

public class CalculaController {
	private CalculaView calculaView = new CalculaView();
	private CalculaModel calculaModel = new CalculaModel();

	public CalculaController() {
		this.calculaView.addCalculaListener(new CalculaListener());
		this.calculaView.setVisible(true);

	}

	class CalculaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				calculaModel.setPrimeiroNumero(calculaView.getPrimeiroNumero());
				calculaModel.setSegundoNumero(calculaView.getSegundoNumero());

				calculaView.setResultado(calculaModel.somaDoisNumeros());
			} catch (NumberFormatException nfe) {
				calculaView.exibeMensagemDeErro("Digite 2 Números Inteiros Válidos.");

			}
		}
	}

	public static void main(String[] args) {
		new CalculaController();

	}

}
