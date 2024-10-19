package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC extends JFrame {

private JPanel contentPane;
private JTextField txtnom;
private JTextField txtid;
private JTextField txtestado;
private JTextField txtimc;
private JLabel lblima;

private JSlider slaltura;
private JSpinner peso;
Constructores ng = new Constructores();
Metodos m=new Metodos();

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
IMC frame = new IMC();
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
int ancho, alto;

public IMC() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 700, 642);
setLocationRelativeTo(null);
contentPane = new JPanel();
contentPane.setBackground(new Color(67, 175, 170));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel = new JLabel("Nombre");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel.setBounds(10, 29, 71, 14);
contentPane.add(lblNewLabel);

txtnom = new JTextField();
txtnom.setBounds(117, 26, 117, 20);
contentPane.add(txtnom);
txtnom.setColumns(10);

JLabel lblPesoEnKg = new JLabel("Peso en kg");
lblPesoEnKg.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblPesoEnKg.setBounds(10, 105, 71, 20);
contentPane.add(lblPesoEnKg);

JSpinner peso = new JSpinner();
peso.setModel(new SpinnerNumberModel(1, 1, 500, 1));
peso.setBounds(117, 107, 50, 20);
contentPane.add(peso);

JLabel lblAlturaEnCm = new JLabel("Altura en cm");
lblAlturaEnCm.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblAlturaEnCm.setBounds(10, 172, 87, 20);
contentPane.add(lblAlturaEnCm);

JLabel lblh = new JLabel("");
lblh.setBounds(604, 177, 46, 14);
contentPane.add(lblh);

JSlider slaltura = new JSlider();
slaltura.addChangeListener(new ChangeListener() {
public void stateChanged(ChangeEvent e) {
lblh.setText("" + slaltura.getValue());
}
});
slaltura.setMaximum(200);
slaltura.setMajorTickSpacing(10);
slaltura.setMinorTickSpacing(1);
slaltura.setSnapToTicks(true);
slaltura.setPaintLabels(true);
slaltura.setBackground(new Color(255, 255, 255));
slaltura.setPaintTicks(true);
slaltura.setValue(0);
slaltura.setBounds(116, 167, 466, 35);
contentPane.add(slaltura);

JLabel lblid = new JLabel("ID");
lblid.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblid.setBounds(414, 31, 22, 20);
contentPane.add(lblid);
lblid.setVisible(false);

txtid = new JTextField();
txtid.setBackground(new Color(0, 0, 0));
txtid.setEnabled(false);
txtid.setEditable(false);
txtid.setBounds(453, 33, 86, 20);
contentPane.add(txtid);
txtid.setColumns(10);
txtid.setVisible(false);

JLabel lblima = new JLabel("");
lblima.setBounds(342, 252, 309, 202);
contentPane.add(lblima);
ancho = lblima.getWidth();
alto = lblima.getHeight();

JLabel lblEstado = new JLabel("Estado");
lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblEstado.setBounds(26, 510, 71, 20);
contentPane.add(lblEstado);

txtestado = new JTextField();
txtestado.setBounds(101, 512, 351, 20);
contentPane.add(txtestado);
txtestado.setColumns(10);

JLabel lblImc = new JLabel("IMC");
lblImc.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblImc.setBounds(34, 553, 32, 20);
contentPane.add(lblImc);

txtimc = new JTextField();
txtimc.setBounds(101, 555, 351, 20);
contentPane.add(txtimc);
txtimc.setColumns(10);

JButton btnNewButton = new JButton("Calcular");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String names = txtnom.getText();
double sppeso = (Integer) peso.getValue();
double altura = (double) slaltura.getValue();


if(names.isEmpty() || sppeso==1 || altura==0) {
JOptionPane.showMessageDialog(null, "Campos vacíos");
}else {
	
m.cal(altura, sppeso);

txtimc.setText(""+m.recal());



double imc=(Double.parseDouble(m.recal()));

if (imc < 18.5) {
txtestado.setText(names + " Estás por debajo del peso recomendado.");
Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/bp.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

} else if (imc >= 18.5 && imc < 25) {
txtestado.setText(names + " Tu peso es saludable.");

Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/s.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else if (imc >= 25 && imc < 30) {
txtestado.setText(names + " Tienes sobrepeso.");

Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sp.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else if (imc >= 30 && imc < 34) {
txtestado.setText(names + " Tienes obesidad nivel uno.");

Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o1.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else if (imc >= 34 && imc < 39) {
txtestado.setText(names + " Tienes obesidad nivel dos.");

Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o2.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else if (imc >= 39 && imc < 49) {
txtestado.setText(names + " Tienes obesidad nivel tres.");

Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o3.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else if (imc >= 49 && imc < 60) {
txtestado.setText(names + " Tienes obesidad nivel cuatro.");

Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o4.jpeg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
txtestado.setText(names + " Tienes obesidad nivel cinco.");
Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o5.jpg"));
lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
ng.setNombre(txtnom.getText());
ng.setPeso((Integer) peso.getValue());
ng.setAltura((Integer) slaltura.getValue());
ng.setEstado((String)txtestado.getText());
ng.setImc(Double.parseDouble(txtimc.getText()));

if (ng.insertarcliente()) {
JOptionPane.showMessageDialog(null, "Cliente agregado");

} else {
JOptionPane.showMessageDialog(null, "*Error en el registro*");
}


System.out.println(ng.getNombre());
System.out.println(ng.getPeso());
System.out.println(ng.getAltura());
System.out.println(ng.getImc());
System.out.println(ng.getEstado());


}

}
});
btnNewButton.setBounds(78, 237, 89, 23);
contentPane.add(btnNewButton);

JButton btnNewButton_1 = new JButton("Consultar");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		try {

			int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id que quieras consultar"));
			ng.setIdusuario(id);
			

			if(ng.consultar()) {
				
				JOptionPane.showMessageDialog(null,"Cliente encontrado");
				
				
			
				lblid.setVisible(true);
				txtid.setVisible(true);
				

			int p= (Integer)ng.getPeso();
			peso.setValue(p);

			int a =(Integer)ng.getAltura();
			slaltura.setValue(a);

			txtnom.setText(""+ng.getNombre());
			
			txtestado.setText(""+ng.getEstado());
			txtimc.setText(""+ng.getImc());
			
			txtid.setText(""+ng.getIdusuario());
			

			}else {
				JOptionPane.showMessageDialog(null, "*Error al encontrar al usuario*");
			}

			}catch(Exception e2){
				
			}
		
	
		
	}
});
btnNewButton_1.setBounds(216, 237, 89, 23);
contentPane.add(btnNewButton_1);

JButton btnNewButton_2 = new JButton("Actualizar");
btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		lblid.setVisible(true);
		txtid.setVisible(true);

		String names = txtnom.getText();
		double sppeso = (Integer) peso.getValue();
		double altura = (double) slaltura.getValue();
		m.cal(altura, sppeso);

		txtimc.setText(""+m.recal());


		double imc=(Double.parseDouble(m.recal()));
		if (imc < 18.5) {
			txtestado.setText(names + " Estás por debajo del peso recomendado.");
			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/bp.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			} else if (imc >= 18.5 && imc < 25) {
			txtestado.setText(names + " Tu peso es saludable.");

			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/s.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			} else if (imc >= 25 && imc < 30) {
			txtestado.setText(names + " Tienes sobrepeso.");

			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sp.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			} else if (imc >= 30 && imc < 34) {
			txtestado.setText(names + " Tienes obesidad nivel uno.");

			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o1.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			} else if (imc >= 34 && imc < 39) {
			txtestado.setText(names + " Tienes obesidad nivel dos.");

			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o2.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			} else if (imc >= 39 && imc < 49) {
			txtestado.setText(names + " Tienes obesidad nivel tres.");

			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o3.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			} else if (imc >= 49 && imc < 60) {
			txtestado.setText(names + " Tienes obesidad nivel cuatro.");

			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o4.jpeg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			} else {
			txtestado.setText(names + " Tienes obesidad nivel cinco.");
			Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/o5.jpg"));
			lblima.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			}


		
		ng.setNombre(txtnom.getText());
		ng.setPeso((Integer)peso.getValue());
		ng.setAltura((Integer)slaltura.getValue());
		ng.setEstado((String)txtestado.getText());
		ng.setImc(Double.parseDouble(txtimc.getText()));
	

		if(ng.actualizar()) {

		JOptionPane.showMessageDialog(null, "Cliente actualizado");

		}else {

		JOptionPane.showMessageDialog(null, "*Error*");

		}
	}
});
btnNewButton_2.setBounds(63, 292, 114, 23);
contentPane.add(btnNewButton_2);

JButton btnNewButton_3 = new JButton("Eliminar");
btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id que quieres eliminar"));
		ng.setIdusuario(id);

		if(ng.eliminar()) {
		JOptionPane.showMessageDialog(null,"Cliente eliminado");
		}else {
		JOptionPane.showMessageDialog(null,"*Error*");
		}
	}
});
btnNewButton_3.setBounds(216, 292, 89, 23);
contentPane.add(btnNewButton_3);

JButton btnNewButton_4 = new JButton("Limpiar");
btnNewButton_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		txtimc.setText("");
		txtestado.setText("");
		peso.setValue(1);
		slaltura.setValue(0);
		txtnom.setText("");
		lblid.setVisible(false);
		txtid.setVisible(false);
		lblima.setVisible(false);
	}
});
btnNewButton_4.setBounds(157, 353, 89, 23);
contentPane.add(btnNewButton_4);

}



}