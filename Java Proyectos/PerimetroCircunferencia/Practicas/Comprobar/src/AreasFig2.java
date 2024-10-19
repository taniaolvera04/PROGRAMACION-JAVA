import javax.swing.*;
public class AreasFig2 {
	public static void main(String[] args) {
		System.out.println("Menú de figuras geométricas");
		System.out.println("1.Cuadrado");
		System.out.println("2.Rectángulo");
		System.out.println("3.Triángulo");
		System.out.println("4.Círculo");
		int figura=Integer.parseInt(JOptionPane.showInputDialog("Elige una opción"));
		switch(figura){
			case 1:
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del lado"));
			    System.out.println("El área del cuadrado es:" + Math.pow(lado, 2));
			    break;
			case 2:
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));
				System.out.println("El área del rectángulo es: " + (base*altura));
				break;
			case 3:
				int base2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));
				int altura2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));
				int resultado=(base2*altura2)/2;
				System.out.println("El área del triángulo es:" + resultado);
				break;
			case 4:
				double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio"));
				double resultado2=Math.PI*radio;
				System.out.println("El área del círculo es:" + Math.pow(resultado2, 2));
			
		}
	}
}
