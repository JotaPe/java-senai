package controller;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ExercicioAbas extends JFrame {
	JTabbedPane abas = new JTabbedPane();

	JPanel painelprincipal1 = new JPanel();
	JPanel painelprincipal2 = new JPanel();
	JPanel painelprincipal3 = new JPanel();
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();

	ImageIcon fusca = new ImageIcon("img/fusca.png");
	ImageIcon ferrari = new ImageIcon("img/ferrari.png");
	ImageIcon lambo = new ImageIcon("img/lamborghini.png");
	
	JLabel fabricante1= new JLabel("Fabricante: VW");
	JLabel modelo1 = new JLabel("Modelo: Fusca");
	JLabel ano1 = new JLabel("Ano: 1967");
	JLabel motor1 = new JLabel("Motor: 1.3");
	JLabel preco1 = new JLabel("Preço: R$2000,00");
	JLabel figura1 = new JLabel(fusca);
	
	JLabel fabricante2= new JLabel("Fabricante: Ferrari");
	JLabel modelo2 = new JLabel("Modelo: 450");
	JLabel ano2 = new JLabel("Ano: 2001");
	JLabel motor2 = new JLabel("Motor: 4.7");
	JLabel preco2 = new JLabel("Preço: R$500000,00");
	JLabel figura2 = new JLabel(ferrari);
	
	JLabel fabricante3= new JLabel("Fabricante: Lamborghini");
	JLabel modelo3 = new JLabel("Modelo: Countach");
	JLabel ano3 = new JLabel("Ano: 1982");
	JLabel motor3 = new JLabel("Motor: 5.3");
	JLabel preco3 = new JLabel("Preço: R$2000000,00");
	JLabel figura3 = new JLabel(lambo);
	
	public ExercicioAbas() {
	super("Carros");	
	painelprincipal1.add(painel1);
	painelprincipal2.add(painel2);
	painelprincipal3.add(painel3);
	
	painelprincipal1.add(figura1);
	painel1.add(fabricante1);
	painel1.add(modelo1);
	painel1.add(ano1);
	painel1.add(motor1);
	painel1.add(preco1);
	painelprincipal1.add(painel1);
	painel1.setLayout(new GridLayout(5,1));
		
	painelprincipal2.add(figura2);
	painel2.add(fabricante2);
	painel2.add(modelo2);
	painel2.add(ano2);
	painel2.add(motor2);
	painel2.add(preco2);
	painelprincipal2.add(painel2);
	painel2.setLayout(new GridLayout(5,1));
	
	painelprincipal3.add(figura3);
	painel3.add(fabricante3);
	painel3.add(modelo3);
	painel3.add(ano3);
	painel3.add(motor3);
	painel3.add(preco3);
	painelprincipal3.add(painel3);
	painel3.setLayout(new GridLayout(5,1));
	
	
	abas.addTab("Fusca", null, painelprincipal1,"Primeiro painel");
	abas.addTab("Ferrari", null, painelprincipal2,"Segundo painel");
	abas.addTab("Lamborghini", null, painelprincipal3,"Terceiro painel");

	Container container = getContentPane();
	container.add(abas);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500, 300);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExercicioAbas();
	}
	
	
}
