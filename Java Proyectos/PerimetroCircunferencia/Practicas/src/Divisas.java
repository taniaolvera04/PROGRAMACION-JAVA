import javax.swing.JOptionPane;
public class Divisas {
	public static void main(String[] args) {
		double dolarca=15.72;
		double dolarus=20.26;
		double yen=0.15;
		double euro=21.72;
		double monto, resul;
		int op=Integer.parseInt(JOptionPane.showInputDialog("¿Qué moneda deseas cambiar?\n"
				+ "1.Dólar Canadiense\n"
				+ "2.Euro\n"
				+ "3.Dólar Americano\n"
				+ "4.Yen\n"
				+ "Introduce el número de tu elección"));
		monto=Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto a cambiar."));
        if (op==1) {
			resul=monto*dolarca;
			JOptionPane.showMessageDialog(null, "La cantidad de " + monto + " dólares canadienses a pesos mexicanos es de " + resul);
        }
        if(op==2) {
			resul=monto*euro;
			JOptionPane.showMessageDialog(null, "La cantidad de " + monto + " euros a pesos mexicanos es de " + resul);
        }
		if(op==3) {
			resul=monto*dolarus;
			JOptionPane.showMessageDialog(null, "La cantidad de " + monto + " dólares americanos a pesos mexicanos es de " + resul);
		}
		if(op==4) {
			resul=monto*yen;
			JOptionPane.showMessageDialog(null, "La cantidad de " + monto + " yenes a pesos mexicanos es de " + resul);		
		}
	}
}
