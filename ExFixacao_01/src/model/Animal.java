package model;

public abstract class Animal {
	
	private String nomenclatura; // Cachorro, gato, jacar�...
	private int numeroDePatas; 
	private String cobertoPor; // Pelos ou escamas
	private String reproducao; // Ov�paros ou viv�paros
	private String alimentacao;// Herb�voros ou Carn�voros
	
	
	public String getNomenclatura() {
		return nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCobertoPor() {
		return cobertoPor;
	}

	public void setCobertoPor(String cobertoPor) {
		this.cobertoPor = cobertoPor;
	}

	public String getReproducao() {
		return reproducao;
	}

	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public Animal() {
		super();
	}
	
	public Animal(String nomenclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao) {
		super();
		this.nomenclatura = nomenclatura;
		this.numeroDePatas = numeroDePatas;
		this.cobertoPor = cobertoPor;
		this.reproducao = reproducao;
		this.alimentacao = alimentacao;
	}

	public void tipoDeRespiracao(){
		System.out.print("Respira��o do tipo: " );
	}
	
	public abstract void exibir();

}











