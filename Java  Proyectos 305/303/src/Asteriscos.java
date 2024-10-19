import java.util.Scanner;
public class Asteriscos {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
				int altura;
		System.out.print(" ");
		altura=in.nextInt();
		for (int i=0; i<altura; i++) {
			for (int j=0; j<altura -i -1; j++) {
			System.out.print(" ");
		}
			for(int j=0; j< i *2 +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
