import java.util.*;
public class Condicional {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu edad actual, por favor");
		int edad=entrada.nextInt();
		if (edad<18) {
			System.out.println("Eres un joven adolescente");
		}
		else if (edad<=40) {
			System.out.println("Eres un adulto");
		}
		else if (edad>40 & edad<=65) {
			System.out.println("Eres una persona adulto mayor");
		}
		else if (edad>65 & edad<=80) {
			System.out.println("Debes acudir al médico regularmente");
		}
		else if (edad>80) {
			System.out.println("Debes cuidar mucho de tu salud");
		}
	}
}
