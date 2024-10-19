import javax.swing.JOptionPane;
public class Evaluacion {
	public static void main(String[] args) {
		double cod, func, word, pp, firm, pfirm, prom;
		String nom, apm, app, answ;
		nom=JOptionPane.showInputDialog("Introduce tu nombre(s)");
		app=JOptionPane.showInputDialog("Introduce tu apellido paterno");
		apm=JOptionPane.showInputDialog("Introduce tu apellido materno");
		cod=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de código"));
		func=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de funcionalidad"));
		word=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de word"));
		pp=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de Power Point"));
		firm=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de firmas"));
		answ=JOptionPane.showInputDialog("¿Los datos fueron ingresados correctamente? (Si/No)");
		if (answ.equalsIgnoreCase("no")) {
			nom=JOptionPane.showInputDialog("Introduce tu nombre(s)");
			app=JOptionPane.showInputDialog("Introduce tu apellido paterno");
			apm=JOptionPane.showInputDialog("Introduce tu apellido materno");
			cod=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de código"));
			func=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de funcionalidad"));
			word=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de word"));
			pp=Double.parseDouble(JOptionPane.showInputDialog("Introduce calificación de Power Point"));
			firm=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de firmas"));
			pfirm=(firm*2)/550;
			prom=(cod+func+word+pp+pfirm);
			JOptionPane.showMessageDialog(null, "¡Hola, " + nom + " " + app + " " + apm + "! ");
			System.out.printf("Tienes un promedio de: " + "%1.1f", prom);
				if (prom>=6) {
					JOptionPane.showMessageDialog(null, "Estás aprobado, disfruta de tus vacaciones");
					if (prom<6) {
						JOptionPane.showMessageDialog(null, "Menú de recuperación\n"
								+ "1.Recuperación: 50% de examen y 50% actividades asignadas por profesor (Del 3 al 7 de Julio)\n"
								+ "2.Extraordinario I: Del 10 al 14 de Julio\n"
								+ "3.Extraordinario II: Del 17 al 21 de Julio\n"
								+ "4.Título de Suficiencia: Del 24 al 28 de Julio\n"
								+ "5.Baja del plantel: Realizar trámites en Dirección Escolar");
			}
		}
	}
		if (answ.equalsIgnoreCase("si")) {
		pfirm=(firm*2)/550;
		prom=(cod+func+word+pp+pfirm);
		JOptionPane.showMessageDialog(null, "¡Hola, " + nom + " " + app + " " + apm + "! ");
		System.out.printf("Tienes un promedio de: " + "%1.1f", prom);
		if (prom>=6) {
			JOptionPane.showMessageDialog(null, "Estás aprobado, disfruta de tus vacaciones");
		}
		if (prom<6) {
			JOptionPane.showMessageDialog(null, "Menú de recuperación\n"
					+ "1.Recuperación: 50% de examen y 50% actividades asignadas por profesor (Del 3 al 7 de Julio)\n"
					+ "2.Extraordinario I: Del 10 al 14 de Julio\n"
					+ "3.Extraordinario II: Del 17 al 21 de Julio\n"
					+ "4.Título de Suficiencia: Del 24 al 28 de Julio\n"
					+ "5.Baja del plantel: Realizar trámites en Dirección Escolar");
		}
	}
 }
}
