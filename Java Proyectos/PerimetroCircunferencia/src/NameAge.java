import java.util.Scanner;
public class NameAge {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name; 
		System.out.println("Por favor introduce tu nombre:");
		name = input.nextLine();
		int age;
		System.out.println("Introduce tu edad:");
		age = input.nextInt();
		System.out.println("Hola "+name);
		System.out.print(" ");
		System.out.print("Tu edad es "+age);
		}
}