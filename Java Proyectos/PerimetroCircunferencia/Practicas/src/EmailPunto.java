import javax.swing.JOptionPane;
public class EmailPunto {
	public static void main(String[] args) {
		boolean arroba=false;
		boolean punto=false;
		String email=JOptionPane.showInputDialog("Introduce tu correo electrónico");
		for (int i=0; i<email.length(); i++) {
			if (email.charAt(i)=='@') {
				arroba=true;
			}
			}
		if (arroba==false) {
			JOptionPane.showMessageDialog(null, "Correo electrónico inválido, falta @");
		 }
		for (int i=0; i<email.length(); i++) {
			if (email.charAt(i)=='.') {
				punto=true;
	}
	}
		 if (punto==false) {
			JOptionPane.showMessageDialog(null, "Correo electrónico inválido, falta .");
 } 
		 if (punto==true & arroba==true) {
				JOptionPane.showMessageDialog(null, "Correo electrónico válido");
				}
}
}
