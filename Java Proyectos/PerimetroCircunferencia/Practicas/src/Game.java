import javax.swing.JOptionPane;

public class Game {
	public static void main(String[] args) {
		int number;
		int random=(int)(Math.random()*100+1);
		int attempts=5;
		number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 100"));
		for(int i=0; i<attempts; i++) {
			if (random>number) {
				number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número más alto"));
			}
			else if (random<number) {
				number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número más bajo"));
			}
			if (random==number) {
				JOptionPane.showMessageDialog(null, "Ganaste");
			}
		}
	}

}
