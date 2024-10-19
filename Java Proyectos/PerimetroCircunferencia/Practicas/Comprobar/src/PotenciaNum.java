import javax.swing.*;
public class PotenciaNum {
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduce un número");
		double num2=Double.parseDouble(num1);
		System.out.println("El resultado de " + num2 + " elevado al cuadrado es ");
		System.out.println(Math.pow(num2, 2));
	}
}