/*Muestra un cuadro de texto en pantalla en donde le pidas su nombre y edad al usuario*/
import javax.swing.*;
//Importar paquete javax.swing
public class CuadroDialogo {
	//Establecer nombre de clase y abrir llave
	public static void main(String[] args) {
		//Establecer método main y abrir llave
		String name=JOptionPane.showInputDialog("Introduce tu nombre");
		//Definir variable name como String, asignarle clase JOptionPane, método showInputDialog y pedir nombre por consola
		String edad1=JOptionPane.showInputDialog("Introduce tu edad");
		//Definir variable edad1 como String, asignarle clase JOptionPane, método showInputDialog y pedir edad por consola
		int edad2=Integer.parseInt(edad1);
		//Definir variable edad2 como entero, asignarle conversión a entero y entre paréntesis colocar edad1
		System.out.println("Hola " + name + ", el año que viene tendrás " + (edad2+1) + " años");
		//Mandar mensaje a pantalla en la que saludes al usuario, concatenar nombre y la edad que tendrá el sig. año
	}
}
