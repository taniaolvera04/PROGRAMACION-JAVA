import java.util.Scanner;
public class Triangulo {
	private double ar;
	private double pe;
	private double hyp;
	public double area(double b, double h) {
		ar=(b*h)/2;
		return ar;
	}
	
	public double perimetro(double b, double h, double hyp) {
		hyp=(Math.hypot(b, h));
		pe=(b+h+hyp);
		return pe;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double b, h, hyp = 0;
	int op, reg=1;
	while(reg==1) {
	Triangulo tri;
	tri=new Triangulo();
	System.out.println("Ingresa medida de la base");
		b=sc.nextDouble();
		System.out.println("Ingresa medida de la altura");
		h=sc.nextDouble();
		System.out.println("Elige una opción (sólo introduce número)\n1.Área.\n3.Perímetro\n3.Ambas");
		op=sc.nextInt();
		switch(op) {
		case 1:
			tri.area(b, h);
			System.out.println("El área del triángulo es: " + tri.ar);
			break;
			
		case 2:
			tri.perimetro(b, h, hyp);
			System.out.println("El perímetro del triángulo es: " + tri.pe);
			break;
			
		case 3:
			tri.area(b, h);
			System.out.println("El área del triángulo es: " + tri.ar);
			tri.perimetro(b, h, hyp);
			System.out.println("El perímetro del triángulo es: " + tri.pe);
			break;
		}
		System.out.println("¿Deseas regresar? (1.Si / 2.No)");
		reg=sc.nextInt();
	}
	}
}
