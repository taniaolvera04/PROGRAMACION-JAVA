
import javax.swing.JOptionPane;
public class SumMul {
	public static void main(String[] args) {
		double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16;
		int op, fila, resultado, columna, linea;
		double[][]num=new double[4][4];
		n1=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[0][0]=n1;
		n2=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[0][1]=n2;
		n3=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[0][2]=n3;
		n4=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[0][3]=n4;
		n5=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[1][0]=n5;
		n6=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[1][1]=n6;
		n7=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[1][2]=n7;
		n8=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[1][3]=n8;
		n9=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[2][0]=n9;
		n10=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[2][1]=n10;
		n11=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[2][2]=n11;
		n12=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[2][3]=n12;
		n13=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[3][0]=n13;
		n14=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[3][1]=n14;
		n15=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[3][2]=n15;
		n16=Double.parseDouble(JOptionPane.showInputDialog("Introduce número(entero o decimal"));
		num[3][3]=n16;
		op=Integer.parseInt(JOptionPane.showInputDialog("Menú de operaciones\n"
				+ "1.Suma vertical\n"
				+ "2.Suma horizontal\n"
				+ "3.Suma diagonal\n"
				+ "4.Multiplicación vertical\n"
				+ "5.Multiplicación horizontal\n"
				+ "6.Multiplicación Diagonal\n"
				+ "\n"
				+ "¿Qué operación deseas realizar? (Escribe número de opción)"));
		switch(op) {
		case 1:
		columna=Integer.parseInt(JOptionPane.showInputDialog("¿Qué columna? (Columna 1 hasta Columna 4)"));
		if (columna==1) {
			resultado=(int)(num[0][0]+num[0][1]+num[0][2]+num[0][3]);
			JOptionPane.showMessageDialog(null, "Resultado de suma de columna 1  es de: "+ resultado);
		}
		if (columna==2){
			resultado=(int)(num[1][0]+num[1][1]+num[1][2]+num[1][3]);
			JOptionPane.showMessageDialog(null, "Resultado de suma de columna 2  es de: "+ resultado);
		}
		if (columna==3) {
			resultado=(int)(num[2][0]+num[2][1]+num[2][2]+num[2][3]);
			JOptionPane.showMessageDialog(null, "Resultado de suma de columna 3  es de: "+ resultado);
	}
		if (columna==4) {
			resultado=(int)(num[3][0]+num[3][1]+num[3][2]+num[3][3]);
			JOptionPane.showMessageDialog(null, "Resultado de suma de columna 4 es de: "+ resultado);
}
		break;
		case 2:
			fila=Integer.parseInt(JOptionPane.showInputDialog("¿Qué fila? (Fila 1 hasta Fila 4)"));
			if (fila==1) {
				resultado=(int)(num[0][0]+num[1][0]+num[2][0]+num[3][0]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de fila 1 es de: " + resultado);
			}
			if (fila==2) {
				resultado=(int)(num[0][1]+num[1][1]+num[2][1]+num[3][1]);
				JOptionPane.showMessageDialog(null, "Resultado de suma  de fila 2 es de:  " + resultado);
			}
			if (fila==3) {
				resultado=(int)(num[0][2]+num[1][2]+num[2][2]+num[3][2]);
				JOptionPane.showMessageDialog(null, "Resultado de suma  de fila 3 es de:  " + resultado);
		}
			if (fila==4) {
				resultado=(int)(num[0][3]+num[1][3]+num[2][3]+num[3][3]);
				JOptionPane.showMessageDialog(null, "Resultado de suma  de fila 4 es de:  " + resultado);
	}
			break;
		case 3:
			linea=Integer.parseInt(JOptionPane.showInputDialog("¿Qué linea? (Línea 1 hasta Línea 7)"));
			if(linea==1) {
				resultado=(int)(num[0][0]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 1 es de: " + resultado);
			}
			if(linea==2) {
				resultado=(int)(num[1][0]+num[0][1]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 2 es de: " + resultado);
			}
			if(linea==3) {
				resultado=(int)(num[2][0]+num[1][1]+num[0][2]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 3 es de:  " + resultado);
			}
			if(linea==4) {
				resultado=(int)(num[3][0]+num[2][1]+num[1][2]+num[0][3]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 4 es de: " + resultado);
			}
			if(linea==5) {
				resultado=(int)(num[3][1]+num[2][1]+num[1][3]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 5 es de:  " + resultado);
			}
			if(linea==6) {
				resultado=(int)(num[3][2]+num[2][3]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 6 es de: " + resultado);
			}
			if(linea==7) {
				resultado=(int)(num[3][3]);
				JOptionPane.showMessageDialog(null, "Resultado de suma de línea 7 es de: " + resultado);
			}
			break;
		case 4:
			columna=Integer.parseInt(JOptionPane.showInputDialog("¿Qué columna? (Columna 1 hasta Columna 4)"));
			if (columna==1) {
				resultado=(int)(num[0][0]*num[0][1]*num[0][2]*num[0][3]);
				JOptionPane.showMessageDialog(null, "Resultado de multiplicación de columna 1 es de: " + resultado);
			}
			if (columna==2){
				resultado=(int)(num[1][0]*num[1][1]*num[1][2]*num[1][3]);
				JOptionPane.showMessageDialog(null, "Resultado de multiplicación de columna 2 es de: " + resultado);
			}
			if (columna==3) {
				resultado=(int)(num[2][0]*num[2][1]*num[2][2]*num[2][3]);
				JOptionPane.showMessageDialog(null, "Resultado de multiplicación de columna 3 es de: " + resultado);
		}
			if (columna==4) {
				resultado=(int)(num[3][0]*num[3][1]*num[3][2]*num[3][3]);
				JOptionPane.showMessageDialog(null, "Resultado de multiplicación de columna 4 es de: " + resultado);
	}
			break;
			case 5:
				fila=Integer.parseInt(JOptionPane.showInputDialog("¿Qué fila? (Fila 1 hasta Fila 4)"));
				if (fila==1) {
					resultado=(int)(num[0][0]*num[1][0]*num[2][0]*num[3][0]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de fila 1 es de: " + resultado);
				}
				if (fila==2) {
					resultado=(int)(num[0][1]*num[1][1]*num[2][1]*num[3][1]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de fila 2 es de: " + resultado);
				}
				if (fila==3) {
					resultado=(int)(num[0][2]*num[1][2]*num[2][2]*num[3][2]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de fila 3 es de: " + resultado);
			}
				if (fila==4) {
					resultado=(int)(num[0][3]*num[1][3]*num[2][3]*num[3][3]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de fila 4 es de: " + resultado);
		}
				break;
			case 6:
				linea=Integer.parseInt(JOptionPane.showInputDialog("¿Qué linea? (Línea 1 hasta Línea 7)"));
				if(linea==1) {
					resultado=(int)(num[0][0]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 1 es de: " + resultado);
				}
				if(linea==2) {
					resultado=(int)(num[1][0]*num[0][1]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 2 es de: " + resultado);
				}
				if(linea==3) {
					resultado=(int)(num[2][0]*num[1][1]*num[0][2]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 3 es de: " + resultado);
				}
				if(linea==4) {
					resultado=(int)(num[3][0]*num[2][1]*num[1][2]*num[0][3]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 4 es de: " + resultado);
				}
				if(linea==5) {
					resultado=(int)(num[3][1]*num[2][1]*num[1][3]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 5 es de: " + resultado);
				}
				if(linea==6) {
					resultado=(int)(num[3][2]*num[2][3]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 6 es de: " + resultado);
				}
				if(linea==7) {
					resultado=(int)(num[3][3]);
					JOptionPane.showMessageDialog(null, "Resultado de multiplicación de línea 7 es de: " + resultado);
				}
				break;
		}
	}
}  
