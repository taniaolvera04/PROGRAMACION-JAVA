import java.util.Scanner;
public class Jueguito {
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		int intentos=1;
		int random=(int)(Math.random()*100); 
		System.out.println("Introduce un numero entre 0 a 100");
		while (intentos<=100){
			int numero=entrada.nextInt();
			 if (random>numero) {
				System.out.println("Introduce un numero más grande");
				intentos=intentos+1;
			}
			 else if (random<numero){
				System.out.println("Introduce un numero más pequeño");
				intentos=intentos+1;
			}
			 if (random==numero){
				System.out.println("La cantidad de intentos es de" + intentos);
				intentos=intentos+1;   
			}
			
		}
	}
}
