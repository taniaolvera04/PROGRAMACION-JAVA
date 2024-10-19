import javax.swing.*;
public class Game {
	public static void main(String[] args) {
		int number;
		int random=(int)(Math.random()*100);
		number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 100"));
		for (int i=1; i<5; i++) {
			if (random>number) {
				number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número más alto"));
			}
			else if (random<number) {
				number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número más bajo"));
				break;
			}
			if (random==number) {
				JOptionPane.showMessageDialog(null, "Ganaste");
			}
		}    JOptionPane.showMessageDialog(null, "Perdiste");
	}
}