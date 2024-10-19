import java.util.Scanner;
public class NumUsuario {
	public static void main(String[]args) {
		int[]numbers=new int[10];
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		Scanner sc=new Scanner(System.in);
			System.out.println("Introduce numero entero de 1-10");
			n1=sc.nextInt();
			numbers[0]=n1;
			System.out.println("Introduce numero entero de 1-10");
			n2=sc.nextInt();
			numbers[1]=n2;
			System.out.println("Introduce numero entero de 1-10");
			n3=sc.nextInt();
			numbers[2]=n3;
			System.out.println("Introduce numero entero de 1-10");
			n4=sc.nextInt();
			numbers[3]=n4;
			System.out.println("Introduce numero entero de 1-10");
			n5=sc.nextInt();
			numbers[4]=n5;
			System.out.println("Introduce numero entero de 1-10");
			n6=sc.nextInt();
			numbers[5]=n6;
			System.out.println("Introduce numero entero de 1-10");
			n7=sc.nextInt();
			numbers[6]=n7;
			System.out.println("Introduce numero entero de 1-10");
			n8=sc.nextInt();
			numbers[7]=n8;
			System.out.println("Introduce numero entero de 1-10");
			n9=sc.nextInt();
			numbers[8]=n9;
			System.out.println("Introduce numero entero de 1-10");
			n10=sc.nextInt();
			numbers[9]=n10;
		for(int elementos:numbers) {
			System.out.println(elementos);
		}
	}
}
