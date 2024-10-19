import java.util.Scanner;
import javax.swing.JOptionPane;
public class TanisOperaciones {
	public static void main(String[] args) {
		double[][]num=new double[4][4];
		double n;
		int op, fila, resultado, columna, linea;
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<17; i++) {
		System.out.println("Introduce número (entero o decimal)");
		n=sc.nextDouble();
		for(int a=0; a<5; a++) {
			System.out.println(" ");
			for(int b=1; b<5; b++) {
				num[a][b]=n;
			System.out.print(num[a][b] + " ");
	}
		}
	}
		op=Integer.parseInt(JOptionPane.showInputDialog("Menú de operaciones\n"
				+ "1.Suma Vertical\n"
				+ "2.Suma Horizontal\n"
				+ "3.Suma Diagonal\n"
				+ "4.Multiplicación Vertical\n"
				+ "5.Multiplicación Horizontal\n"
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