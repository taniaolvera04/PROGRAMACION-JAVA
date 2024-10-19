//Mandarle al usuario su nombre en pantalla
public class ManipulacionCadenas {
	public static void main(String[] args) {
		String nombre="Carla";
		String frase="Soy Carla y me gustan mucho las papas";
		String frase_resumen=frase.substring(8,37);
		System.out.println("Hola, mi nombre es " + nombre + frase_resumen);
		System.out.println("La tercera letra de mi nombre es " + nombre.charAt(2));
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		}
	}
