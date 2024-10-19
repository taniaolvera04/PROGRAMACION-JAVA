import java.util.Scanner;

public class MasaCorp {
private double altura, peso;

private double masa(double altura, double peso) {
	return peso/(altura*altura);
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int reg=1;
	double altura = 0, peso = 0, imc=0;
	while(reg==1) {
		MasaCorp pa=new MasaCorp();
		System.out.println("Ingresa tu altura en metros");
		altura=sc.nextDouble();
	    System.out.println("Ingresa tu peso en kilogramos");
		peso=sc.nextDouble();
		System.out.println("Tu índice de masa corporal es de: " + pa.masa(altura, peso));
		
		System.out.println("¿Deseas regresar? (1.Si / 2.No)");
		reg=sc.nextInt();
	}
}
}


