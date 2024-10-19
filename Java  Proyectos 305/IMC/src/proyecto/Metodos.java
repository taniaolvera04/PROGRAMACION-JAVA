package proyecto;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Metodos {

	private double altura, peso, imc;
	private String me;
	private int ancho, alto;
	private JLabel lblima;
	
	public void cal(double altura, double peso) {
		altura=altura / 100;
		double imc = peso / (altura * altura);
		me=""+imc;
	}
	
	public String recal() {
		return me;
	}
	
	
	
}
