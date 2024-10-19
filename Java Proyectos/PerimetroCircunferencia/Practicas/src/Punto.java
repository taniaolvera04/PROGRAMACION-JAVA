import javax.swing.JOptionPane;

public class Punto {
	public static void main(String[] args) {
		boolean punto=false;
		String mail=JOptionPane.showInputDialog("Introduce tu correo electrónico");
		for(int i=0; i<mail.length();i++) {
			if (mail.charAt(i)=='.') {
				punto=true;
			}
		} if (punto==true) {
			System.out.println("Es correcto");
		}
		else { System.out.println("No es correcto");
		}
	}
}
