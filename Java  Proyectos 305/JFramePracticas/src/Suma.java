import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;

public class Suma {

private JFrame frame;
private JTextField n1;
private JTextField n2;
private JTextField r;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Suma window = new Suma();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public Suma() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNmero = new JLabel("Número 2");
lblNmero.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
lblNmero.setBounds(36, 47, 157, 26);
frame.getContentPane().add(lblNmero);

JLabel lblResultado = new JLabel("Resultado");
lblResultado.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
lblResultado.setBounds(36, 114, 157, 26);
frame.getContentPane().add(lblResultado);

JLabel lblNewLabel = new JLabel("Número 1");
lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
lblNewLabel.setBounds(36, 11, 157, 26);
frame.getContentPane().add(lblNewLabel);

n1 = new JTextField();
n1.setBounds(129, 17, 96, 19);
frame.getContentPane().add(n1);
n1.setColumns(10);

n2 = new JTextField();
n2.setBounds(129, 53, 96, 19);
frame.getContentPane().add(n2);
n2.setColumns(10);

r = new JTextField();
r.setBounds(117, 113, 163, 34);
frame.getContentPane().add(r);
r.setColumns(10);

JButton btnNewButton = new JButton("Sumar");
btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double num1, num2, res;
num1=Double.parseDouble(n1.getText());
num2=Double.parseDouble(n2.getText());
res=num1+num2;
r.setText(""+res);

}
});
btnNewButton.setBounds(299, 15, 103, 21);
frame.getContentPane().add(btnNewButton);

JPanel panel = new JPanel();
panel.setBackground(new Color(224, 255, 255));
panel.setBounds(0, 183, 436, 80);
frame.getContentPane().add(panel);
panel.setLayout(null);

JButton Restar = new JButton("Restar");
Restar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
Restar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double num1, num2, res;
num1=Double.parseDouble(n1.getText());
num2=Double.parseDouble(n2.getText());
res=num1-num2;
r.setText(""+res);
}
});
Restar.setBounds(299, 51, 103, 21);
frame.getContentPane().add(Restar);

JButton btnMultiplicar = new JButton("Multiplicar");
btnMultiplicar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
btnMultiplicar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double num1, num2, res;
num1=Double.parseDouble(n1.getText());
num2=Double.parseDouble(n2.getText());
res=num1*num2;
r.setText(""+res);
}
});
btnMultiplicar.setBounds(299, 82, 103, 21);
frame.getContentPane().add(btnMultiplicar);

JButton btnDividir = new JButton("Dividir");
btnDividir.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
btnDividir.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double num1, num2, res;
num1=Double.parseDouble(n1.getText());
num2=Double.parseDouble(n2.getText());
if(num2==0) {
r.setText("NO SE PUEDE DIVIDIR ENTRE 0");
}else {
res=num1/num2;
r.setText(""+res);
}
}
});
btnDividir.setBounds(299, 118, 103, 21);
frame.getContentPane().add(btnDividir);

JButton btnPotencia = new JButton("Potencia");
btnPotencia.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
btnPotencia.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double num1, num2, res;
num1=Double.parseDouble(n1.getText());
num2=Double.parseDouble(n2.getText());
res=(Math.pow(num1, num2));
r.setText(""+res);
}
});
btnPotencia.setBounds(299, 149, 103, 21);
frame.getContentPane().add(btnPotencia);

JButton btnNewButton_1 = new JButton("Limpiar");
btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
btnNewButton_1.setBounds(148, 157, 96, 21);
frame.getContentPane().add(btnNewButton_1);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(208, 204, 232));
panel_1.setBounds(0, 0, 436, 87);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JMenuBar menuBar = new JMenuBar();
menuBar.setBackground(new Color(65, 105, 225));
menuBar.setToolTipText("opciones");
frame.setJMenuBar(menuBar);
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1.setText("");
n2.setText("");
r.setText("");
}
});
}
}
