import java.util.Scanner;
public class Terreno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base, altura, area, perimetro;
		int cerca=260;
		int precio=1800;
		String resp;
		System.out.println("Introduce medida de base de terreno");
		base=sc.nextInt();
		System.out.println("Introduce medida de altura de terreno");
		altura=sc.nextInt();
		area=(base*altura);
		perimetro=(base+base+altura+altura);
		System.out.println("Área del terreno es de: " + area  + " metros cuadrados\n"
				+ "Perimetro es de: " + perimetro + " metros\n"
				+ "Costo del terreno es de: " + (area*precio) + " pesos");
		System.out.println(" ");
		System.out.println("¿Deseas cercar el terreno? (Si/No)");
		resp=sc.next();
		if (resp.equalsIgnoreCase("si")) {
			System.out.println("Precio de cerca es de: " + (perimetro*cerca) + " pesos");
			System.out.println("Precio total de terreno con cerca: " + (area*precio+perimetro*cerca) + " pesos");
		}
		if (resp.equalsIgnoreCase("no")) {
			System.out.println("Precio total de terreno es de: " + (area*precio) + " pesos");
		}
	}
}
