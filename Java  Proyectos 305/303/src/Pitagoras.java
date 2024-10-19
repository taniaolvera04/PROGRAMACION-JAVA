import java.util.Scanner;
public class Pitagoras {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa la altura");
		double a=s.nextDouble();
		System.out.println("Ingresa la base");
		double b=s.nextDouble();
		double h=Math.hypot(a, b);
		System.out.println("La hipotenusa es " + h);
	}

}