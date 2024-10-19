import javax.swing.JOptionPane;
public class Contraseña {
	public static void main(String[] args) {
		String contraseña="Tortillaland";
		String contraseña2=" ";
		while (contraseña.equals(contraseña2)==false) {
			contraseña2=JOptionPane.showInputDialog("Introduce la contraseña correcta");
			if (contraseña.equals(contraseña2)==false) {
				System.out.println("Contraseña incorrecta, acceso denegado");
			}
			else if (contraseña.equals(contraseña2)!=false);
			System.out.println("Contraseña correcta, acceso permitido");
			}
	}
}
