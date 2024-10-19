import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class P3 extends JFrame {

private JPanel contentPane;
private JTextField nom;
private JTextField ed;
private JTextField saludo;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
P3 frame = new P3();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public P3() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 585, 463);
contentPane = new JPanel();
contentPane.setBackground(new Color(235, 210, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel edad1 = new JLabel("Edad");
edad1.setForeground(new Color(64, 0, 64));
edad1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
edad1.setBounds(65, 121, 82, 24);
contentPane.add(edad1);

JLabel nombre = new JLabel("Nombre");
nombre.setForeground(new Color(64, 0, 64));
nombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
nombre.setBounds(65, 39, 108, 24);
contentPane.add(nombre);

nom = new JTextField();
nom.setForeground(new Color(255, 113, 113));
nom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
nom.setBackground(new Color(255, 255, 255));
nom.setBounds(157, 37, 287, 35);
contentPane.add(nom);
nom.setColumns(10);

ed = new JTextField();
ed.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
ed.setForeground(new Color(255, 113, 113));
ed.setBackground(new Color(255, 255, 255));
ed.setBounds(157, 120, 173, 33);
contentPane.add(ed);
ed.setColumns(10);

JButton btnAceptar = new JButton("Aceptar");
btnAceptar.setForeground(new Color(64, 0, 64));
btnAceptar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
btnAceptar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int edad;
String name;
name=nom.getText();
edad=Integer.parseInt(ed.getText());
if (edad<=2) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un bebé.");
}else
if (edad<=11) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un niño.");
}else
if (edad<=14) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un puberto.");
}else
if( edad<=18) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un adolescente.");
}else
if(edad>=19 && edad<=30) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un joven.");
}else
if(edad>=31 && edad<=65) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un adulto.");
} else
if(edad>=66 && edad<=100) {
saludo.setText("Hola, " + name+ ". Tienes " + edad + " años," + " eres un adulto mayor.");
}
}
});
btnAceptar.setBounds(135, 185, 116, 35);
contentPane.add(btnAceptar);

saludo = new JTextField();
saludo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
saludo.setForeground(new Color(57, 244, 151));
saludo.setBackground(new Color(255, 255, 255));
saludo.setBounds(82, 231, 416, 43);
contentPane.add(saludo);
saludo.setColumns(10);
JButton btnCancelar = new JButton("Cancelar");
btnCancelar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		nom.setText("");	
		ed.setText("");
		saludo.setText("");
	}
});
btnCancelar.setForeground(new Color(64, 0, 64));
btnCancelar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
btnCancelar.setBounds(328, 185, 116, 35);
contentPane.add(btnCancelar);
}
}

