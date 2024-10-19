import javax.swing.JOptionPane;
public class Semana_Nombre {
	public static void main(String[] args) {
		int dia;
		dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce número de día"));
		switch(dia) {
		case 1: 
			JOptionPane.showMessageDialog(null, "Lunes");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Martes");
			break;
		case 3: 
			JOptionPane.showMessageDialog(null, "Miércoles");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Jueves");
			break;
		case 5: 
			JOptionPane.showMessageDialog(null, "Viernes");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
			default:
				JOptionPane.showMessageDialog(null, "No hay opciones disponibles para este número.");
				break;
		}
		}
}
