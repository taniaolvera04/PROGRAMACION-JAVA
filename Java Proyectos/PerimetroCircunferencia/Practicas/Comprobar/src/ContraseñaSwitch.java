import java.util.Scanner;
public class ContraseñaSwitch {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String passw="ilovebts";
		String passw2=" ";
		System.out.println("Introduce tu contraseña");
		passw2=entrada.next();
		for(int i=0; i<3; i++) {
			 if (passw.equals(passw2)==true) {
			 }
			 else if(passw.equals(passw2)==false) {
		  }
		}  System.out.println( "Acceso denegado");		 
	} 
}
