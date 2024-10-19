import java.util.Scanner;
public class Cuadrado {
 public static void main(String[]args) {
	Scanner s=new Scanner(System.in); 
	System.out.println("Lado");
	int lado=s.nextInt();
	for(int i=1; i<=lado; i++) {
		for (int j=1; j<=lado; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
 }
}