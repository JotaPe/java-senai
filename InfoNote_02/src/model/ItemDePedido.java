package model;

public class ItemDePedido {
	
	public int qtde;
	public double subtotal;
	
	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}
	
	public void mostrar() {
		// Mostrar item de pedido
		System.out.println("\n\nItem de Pedido:\n");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);
		
	}
	
}
