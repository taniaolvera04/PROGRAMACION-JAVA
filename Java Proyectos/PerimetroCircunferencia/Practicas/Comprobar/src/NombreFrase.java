
public class NombreFrase {

	public static void main(String[] args) {
		String nombre="Josefina";
		String frase="No cualquier persona es programador, para ello se requiere inteligencia, lógica, paciencia, perseverancia y otras características que yo tengo ";
		String frase_resumen=frase.substring(136, 143);
		String frase_resumen2=frase.substring(61, 106);
		System.out.println("Hola " + nombre + " Tu nombre tiene " + nombre.length() + " letras");
		System.out.println("La última letra de tu nombre es " + nombre.charAt(7) + " La cuarta letra de tu nombre es " + nombre.charAt(3));
		System.out.println(frase_resumen + frase_resumen2);

}
}