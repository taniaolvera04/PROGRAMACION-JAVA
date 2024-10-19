import javax.swing.JOptionPane;

public class Melifluo {
	public static void main(String[] args) {
		String nombre, cancion, animo;
		JOptionPane.showMessageDialog(null, "Bienvenido  a Melifluo, un programa que te recomienda canciones para subirte el ánimo");
		nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		animo=JOptionPane.showInputDialog("Hola, " + nombre + " ¿Qué emoción negativa sientes hoy?\n"
				+ "\n"
				+ "1.Estrés\n"
				+ "2.Tristeza\n"
				+ "3.Enojo\n"
				+ "4.Desamor");
		if(animo.equalsIgnoreCase("estres")) {
			JOptionPane.showMessageDialog(null, "Canciones para Estrés:\n"
					+ "\n"
					+ "Género: Kpop\n"
					+ "Boombayah-BLACKPINK\n"
					+ "\n"
					+ "Género: Pop\n"
					+ "7 rings-Ariana Grande");
		}
		if(animo.equalsIgnoreCase("tristeza")) {
			JOptionPane.showMessageDialog(null, "Canciones para Tristeza:\n"
					+ "\n"
					+ "Género: Pop\n"
					+ "She's not me-Lana del Rey\n"
					+ "\n"
					+ "Género: Hip Hop\n"
					+ "Starboy-The Weeknd\n"
					+ "\n"
					+ "Género: Rock\n"
					+ "Don't stop me-Queen\n"
					+ "\n"
					+ "Género: Kpop\n"
					+ "Fire-BTS");
		}
		if(animo.equalsIgnoreCase("enojo")) {
			JOptionPane.showMessageDialog(null, "Canciones para Enojo:\n"
					+ "\n"
					+ "Género: Hip Hop\n"
					+ "Without Me-Eminem\n"
					+ "\n"
					+ "Género: Rock\n"
					+ "Sugar-System of Down");
		}
		if(animo.equalsIgnoreCase("desamor")) {
			JOptionPane.showMessageDialog(null, "Canciones para Desamor:\n"
					+ "\n"
					+ "Género: Pop Latino\n"
					+ "Enamórate de alguien más-Morat\n"
					+ "Primeras veces-Morat");
	}
		cancion=JOptionPane.showInputDialog("Recomiéndame una canción (Incluye artista)");
		JOptionPane.showMessageDialog(null, "La canción que me recomendaste fue: " + cancion);
	}

}
