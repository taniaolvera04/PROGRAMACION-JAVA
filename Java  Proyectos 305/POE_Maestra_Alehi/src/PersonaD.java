import java.util.Scanner;
public class PersonaD {
 private String nombre;
 private int edad;
 private String r;
 
 public String esMayor(int edad, String nombre) {
	 if(edad>=18) {
		 r=nombre+", eres mayor de edad";
	 } else {
		 r=nombre+", eres menor de edad";
	 }
	 return r;
 }
	public static void main(String[] args) {
		String nombre;
		int edad;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa nombre");
	nombre=teclado.next();
	System.out.println("Ingresa edad");
	edad=teclado.nextInt();
	PersonaD persona1;
	persona1=new PersonaD();
	persona1.esMayor(edad, nombre);
	System.out.println(persona1.r);
	}

}
