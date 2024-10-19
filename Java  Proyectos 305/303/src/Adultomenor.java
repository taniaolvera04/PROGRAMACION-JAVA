import java.util.Scanner;;
public class Adultomenor {

	public static void main(String[] args) {
		System.out.println("Datos de la persona");
		Scanner sc=new Scanner(System.in);
		int edad;
		System.out.println("Ingresa la edad");
		edad=sc.nextInt();
		if(edad>=18) {
			System.out.println("Mayor de edad");
		}else {
			System.out.println("Menor de edad");
		}
	}

}
