import javax.swing.*;
public class RaizDec {
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduce un número, por favor");
		double num2=Double.parseDouble(num1);
		System.out.println("El resultado de la raíz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));		
	}
}
