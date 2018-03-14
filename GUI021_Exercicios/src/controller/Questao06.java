package controller;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Questao06 {
	public static void main(String[] args) {
		String capital = JOptionPane
				.showInputDialog("Qual a capital do Brasil");
		ImageIcon imagem = new ImageIcon("img/errou.jpg");

		if (capital.equals("Brasília")) {
			JOptionPane.showMessageDialog(null, "Acertou");
		} else {
			playSound();
			JOptionPane.showMessageDialog(null, "Errou", "Errou",
					JOptionPane.PLAIN_MESSAGE, imagem);
			
		}
		
	}
	
	public static void playSound() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("som/errou.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
}
