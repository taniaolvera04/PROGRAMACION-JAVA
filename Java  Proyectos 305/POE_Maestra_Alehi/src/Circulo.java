import java.util.Scanner;
public class Circulo {
private double a;
private double p;
public double area(double r) {
	a=(3.1416)*r*r;
	return a;
}
public double perimetro(double r) {
	p=2*(3.1416)*r;
	return p;
}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double r;
		int op;
		Circulo cir;
		cir=new Circulo();
		System.out.println("Ingresa radio");
		r=teclado.nextDouble();
		System.out.println("1.Área\n2.Perímetro\n3.Ambos");
		op=teclado.nextInt();
		
		switch(op) {
		case 1:
			cir.area(r);
			System.out.println("Área: " + cir.a);
			break;
		case 2:
			cir.area(r);
			System.out.println(" Perímetro:" + cir.p);
		    break;
		case 3:
			cir.area(r);
			System.out.println("Área: " + cir.a + "Perímetro: " +cir.p);
			break;
		}
	}

}
