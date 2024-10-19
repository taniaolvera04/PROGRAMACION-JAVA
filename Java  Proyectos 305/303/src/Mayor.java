import java.util.Scanner;
public class Mayor {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=in.nextInt();
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
		}
	}

}
