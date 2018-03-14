package model;

public class Reptil extends Animal implements IAnimal{
	
	private boolean capacidadeRegenerativa;

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public Reptil() {
		super();
	}

	public Reptil(String nomenclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao,
			boolean capacidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}
	
	@Override
	public void tipoDeRespiracao(){
		super.tipoDeRespiracao();
		System.out.println("Traquial");
	}

	@Override 
	public void temperaturaCorporal(){
		System.out.println("Temperatura Corporal: Pecilot�rmico");
	}
	

	public void exibir(){
		System.out.println("\n\nCaracter�sticas do R�ptil:\n");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Numero de Patas: " + super.getNumeroDePatas());
		System.out.println("Coberto Por: " + super.getCobertoPor());
		System.out.println("Reprodu��o: " + super.getReproducao());
		System.out.println("Alimenta��o: " + super.getAlimentacao());
		System.out.println("Capacidade Regenerativa: " + capacidadeRegenerativa);
		tipoDeRespiracao();
		temperaturaCorporal();
	}

}
