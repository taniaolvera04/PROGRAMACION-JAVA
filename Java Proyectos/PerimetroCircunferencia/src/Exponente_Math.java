import java.util.Scanner;
public class Exponente_Math {
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int base; 
		int exponente;
		System.out.println("Introduce un numero para la base");
		base = numeros.nextInt();
		System.out.println("Introduce otro numero para el exponente");
		exponente = numeros.nextInt();
		System.out.println("El resultado de la potencia es: " + Math.pow(base, exponente));
 }
}