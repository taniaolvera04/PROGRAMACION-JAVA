import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Edad extends JFrame {

private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Edad frame = new Edad();
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

int ancho;
int alto;

public Edad() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 576, 408);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lbledad = new JLabel("Edad");
lbledad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
lbledad.setBounds(64, 50, 115, 51);
contentPane.add(lbledad);

JSpinner spie = new JSpinner();
spie.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
spie.setModel(new SpinnerNumberModel(1, 1, 100, 1));
spie.setBounds(182, 58, 94, 32);
contentPane.add(spie);



JLabel lblimg = new JLabel("");
lblimg.setBounds(35, 111, 505, 250);
contentPane.add(lblimg);
ancho=lblimg.getWidth();
alto=lblimg.getHeight();




JButton btnenv = new JButton("Enviar");
btnenv.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int edad=(Integer)spie.getValue();
if(edad<=2) {
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/descarga (1).png"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}else if(edad<=11){
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/niño.jpg"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}else if(edad>=12 && edad<=14){
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pubertad.jpg"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}else if(edad>=15 && edad<=18){
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/adolescentes.jpg"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}else if(edad>=19 && edad<=30){
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/menor.jpg"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

} else if(edad>=31 && edad<=65){
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/adulto.jpg"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}else if(edad>=66 && edad<=100){
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/abuelito.jpg"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
}
});
btnenv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
btnenv.setBounds(376, 57, 115, 36);
contentPane.add(btnenv);

JButton btnBorrar = new JButton("Borrar");
btnBorrar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/download.png"));
lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
spie.setValue(1);
};
});
btnBorrar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
btnBorrar.setBounds(376, 10, 115, 36);
contentPane.add(btnBorrar);
}
}
