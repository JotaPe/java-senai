package model;

public class ContaEspecial extends ContaCorrente{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular, String agencia, String numeroConta,
			double saldo, double limite) {
		super(titular, agencia, numeroConta, saldo);
		this.limite = limite;
	}
	
	//Termo que indica o polimorfismo (este método tem o mesmo
	//nome de um método existente na SuperClasse)
	@Override
	public double calcularSaldo(){
		double saldoFinal;
		
		//super está chamando o método calcularSaldo que está na SuperClasse
		saldoFinal = super.calcularSaldo() + limite;
		
		return saldoFinal;
	}


}







