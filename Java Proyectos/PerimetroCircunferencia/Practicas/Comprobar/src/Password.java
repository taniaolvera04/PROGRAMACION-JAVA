import javax.swing.*;
public class Password {
	public static void main(String[] args) {
		String passw1="ILOVEBTS";
		String passw2=" ";
		String text;
		for (int i=0; i<3; i++) {
			passw2=JOptionPane.showInputDialog("Introduce tu contraseña de acceso");
			if (passw1.equals(passw2)==false) {
				System.out.println("Contraseña incorrecta, introduce la contraseña correcta");
			}
				else if(passw1.equals(passw2)==true) {
				System.out.println("Contraseña correcta, acceso permitido");
				}
			}
		}	
	}