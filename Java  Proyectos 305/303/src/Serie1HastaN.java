import java.util.Scanner;
public class Serie1HastaN {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n;
	        System.out.println("Introduce un número entero ");
	        n = in.nextInt();
	        System.out.println("Números del 1 al " + n);                                           
	        for (int i = 1; i <= n; i++) {
	            System.out.println(i);
	        }
	}

}
