import java.util.Scanner;
public class JuegoWhile {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int dato;
		int contador=0;
		System.out.println("Introduce un número entre 0 a 100");
		while (contador<=25){
			int numero=(int)(Math.random()*100+1); 
			System.out.println("Pista " + numero);
			dato=input.nextInt();
			if (numero>dato){
				System.out.println("Ingresa un número más grande");
				contador=contador+1;
			}
			else if (numero<dato){
				System.out.println("Ingresa un número más pequeño");
				contador=contador+1;
			}
			if (numero==dato){
				System.out.println("La cantidad de intentos fue de " + contador);
				contador=contador+1;   
			}
			
		}
	}
}
