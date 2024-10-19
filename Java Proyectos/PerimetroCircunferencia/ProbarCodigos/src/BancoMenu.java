import javax.swing.JOptionPane;

public class BancoMenu {
	public static void main(String[] args) {
		int año;
		String mes;
		double acumulado;
		double inversion;
		double interes=0.10;
		double[][]banco=new double[5][5];
		for (int i=0; i<5; i++) {
			banco[i][0]=10000;
			acumulado=10000;
			for(int j=1; j<5; j++) {
				acumulado=(acumulado*interes)+acumulado;
				banco[i][j]=acumulado;
		}
			interes=interes+0.01;
	}
		año=Integer.parseInt(JOptionPane.showInputDialog("¿De qué año te interesaría conocer la proyección?\n"
				+ "2023\n"
				+ "2024\n"
				+ "2025\n"
				+ "2026\n"
				+ "2027"));
		mes=JOptionPane.showInputDialog("¿De qué mes te interesaría conocer la proyección?\n"
				+ "1.Agosto\n"
				+ "2.Septiembre\n"
				+ "3.Octubre\n"
				+ "4.Noviembre\n"
				+ "5.Diciembre");
		
		
		if (año==2023 && mes.equalsIgnoreCase("agosto")) {
			JOptionPane.showMessageDialog(null, "La proyección de Agosto de 2023 es de: " + (double)Math.round(banco[0][0])*100d/100d);
		}
		if (año==2023 && mes.equalsIgnoreCase("septiembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Septiembre de 2023 es de: " + (double)Math.round(banco[0][1])*100d/100d);
		}
		if (año==2023 && mes.equalsIgnoreCase("octubre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Octubre de 2023 es de: " + (double)Math.round(banco[0][2])*100d/100d);
        }
		if (año==2023 && mes.equalsIgnoreCase("noviembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Noviembre de 2023 es de: " + (double)Math.round(banco[0][3])*100d/100d);
		}
		if (año==2023 && mes.equalsIgnoreCase("diciembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Diciembre de 2023 es de: " + (double)Math.round(banco[0][4])*100d/100d);
		}
		
		
		
		if (año==2024 && mes.equalsIgnoreCase("agosto")) {
			JOptionPane.showMessageDialog(null, "La proyección de Agosto de 2024 es de: " + (double)Math.round(banco[1][0])*100d/100d);
		}
		if (año==2024 && mes.equalsIgnoreCase("septiembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Septiembre de 2024 es de: " + (double)Math.round(banco[1][1])*100d/100d);
		}
		if (año==2024 && mes.equalsIgnoreCase("octubre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Octubre de 2024 es de: " + (double)Math.round(banco[1][2])*100d/100d);
		}
		if (año==2024 && mes.equalsIgnoreCase("noviembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Noviembre de 2024 es de: " + (double)Math.round(banco[1][3])*100d/100d);
		}
		if (año==2024 && mes.equalsIgnoreCase("diciembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Diciembre de 2024 es de: " + (double)Math.round(banco[1][4])*100d/100d);
		}
		
		
		
		if (año==2025 && mes.equalsIgnoreCase("agosto")) {
			JOptionPane.showMessageDialog(null, "La proyección de Agosto de 2025 es de: " + (double)Math.round(banco[2][0])*100d/100d);
		}
		if (año==2025 && mes.equalsIgnoreCase("septiembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Septiembre de 2025 es de: " + (double)Math.round(banco[2][1])*100d/100d);
		}
		if (año==2025 && mes.equalsIgnoreCase("octubre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Octubre de 2025 es de: " + (double)Math.round(banco[2][2])*100d/100d);
		}
		if (año==2025 && mes.equalsIgnoreCase("noviembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Noviembre de 2025 es de: " + (double)Math.round(banco[2][3])*100d/100d);
		}
		if (año==2025 && mes.equalsIgnoreCase("diciembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Diciembre de 2025 es de: " + (double)Math.round(banco[2][4])*100d/100d);
		}
		
		
		
		if (año==2026 && mes.equalsIgnoreCase("agosto")) {
			JOptionPane.showMessageDialog(null, "La proyección de Agosto de 2026 es de: " + (double)Math.round(banco[3][0])*100d/100d);
		}
		if (año==2026 && mes.equalsIgnoreCase("septiembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Septiembre de 2026 es de: " + (double)Math.round(banco[3][1])*100d/100d);
		}
		if (año==2026 && mes.equalsIgnoreCase("octubre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Octubre de 2026 es de: " + (double)Math.round(banco[3][2])*100d/100d);
		}
		if (año==2026 && mes.equalsIgnoreCase("noviembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Noviembre de 2026 es de: " + (double)Math.round(banco[3][3])*100d/100d);
		}
		if (año==2026 && mes.equalsIgnoreCase("diciembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Diciembre de 2026 es de: " + (double)Math.round(banco[3][4])*100d/100d);
		}
		
		
		
		if (año==2027 && mes.equalsIgnoreCase("agosto")) {
			JOptionPane.showMessageDialog(null, "La proyección de Agosto de 2027 es de: " + (double)Math.round(banco[4][0])*100d/100d);
		}
		if (año==2027 && mes.equalsIgnoreCase("septiembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Septiembre de 2027 es de: " + (double)Math.round(banco[4][1])*100d/100d);
		}
		if (año==2027 && mes.equalsIgnoreCase("octubre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Octubre de 2027 es de: " + (double)Math.round(banco[4][2])*100d/100d);
		}
		if (año==2027 && mes.equalsIgnoreCase("noviembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Noviembre de 2027 es de: " + (double)Math.round(banco[4][3])*100d/100d);
		}
		if (año==2027 && mes.equalsIgnoreCase("diciembre")) {
			JOptionPane.showMessageDialog(null, "La proyección de Diciembre de 2027 es de: " + (double)Math.round(banco[4][4])*100d/100d);
		}
		
	}
}
