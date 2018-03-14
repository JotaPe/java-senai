package model;

public class CalculaModel {
	private int primeiroNumero, segundoNumero, valorCalculo;
	
	public void setPrimeiroNumero(int primeiroNumero){
		this.primeiroNumero = primeiroNumero;
	}
	public void setSegundoNumero (int segundoNumero){
		this.segundoNumero = segundoNumero;
	}
public int getValorCalculo(){
	return valorCalculo;
}
public int somaDoisNumeros(){
	valorCalculo = primeiroNumero + segundoNumero;
	return valorCalculo;
}
public int subtraiDoisNumeros(){
	valorCalculo = primeiroNumero - segundoNumero;
	return valorCalculo;
}
public int multiplicaDoisNumeros(){
	valorCalculo = primeiroNumero * segundoNumero;
	return valorCalculo;
}
public double divideDoisNumeros(){
	valorCalculo = primeiroNumero / segundoNumero;
	return valorCalculo;
}
}
