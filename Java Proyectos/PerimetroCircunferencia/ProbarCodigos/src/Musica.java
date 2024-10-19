import javax.swing.JOptionPane;
public class Musica {
	public static void main(String[] args) {
		String nombre, cancion;
		JOptionPane.showMessageDialog(null, "Bienvenido  a Melifluo, un programa que te recomienda canciones para subirte el ánimo");
		nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		String [] op= {"Estrés","Tristeza","Enojo","Desamor"};
		String opcion=(String) JOptionPane.showInputDialog(null,"Hola, " + nombre + " ¿Qué emoción negativa sientes hoy?","Tristeza",JOptionPane.DEFAULT_OPTION,null,op,op[0]);
		switch (opcion) {
		case "Estrés":
			JOptionPane.showMessageDialog(null, "Canciones para Estrés:\n"+ "Género: Kpop\n"+ "Boombayah-BLACKPINK\n"+ "Género: Pop\n"+ "7 rings-Ariana Grande");
			break;
		case "Tristeza":
			JOptionPane.showMessageDialog(null, "Canciones para Tristeza:\n"+"Género: Pop\n"+"She's not me-Lana del Rey\n"+"Género: Hip Hop\n"+"Starboy-The Weeknd\n"+ "Género: Rock\n"+ "Don't stop me-Queen\n"+ "Género: Kpop\n"+ "Fire-BTS");
			break;
		case "Enojo":
			JOptionPane.showMessageDialog(null, "Canciones para Enojo:\n"+"Género: Hip Hop\n"+"Without Me-Eminem\n"+ "Género: Rock\n"+ "Sugar-System of Down");
			break;
		case "Desamor":
			JOptionPane.showMessageDialog(null, "Canciones para Desamor:\n"+ "Género: Pop Latino\n"+ "Enamórate de alguien más-Morat\n"+ "Primeras veces-Morat");
			break;
		}
		cancion=JOptionPane.showInputDialog("Recomiéndame una canción (Incluye artista)");
		JOptionPane.showMessageDialog(null, "La canción que me recomendaste fue: " + cancion);
	}
}