package sistema;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import javax.swing.JOptionPane;



import java.awt.Font;

import java.awt.Image;

import java.awt.Toolkit;



import javax.swing.JTextField;

import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;

import javax.swing.SwingConstants;

import javax.swing.JSlider;

import javax.swing.JButton;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;

import javax.swing.event.ChangeEvent;



public class PantallaUsuario {

private JFrame frame;

private JTextField txtid;

private JTextField txtnom;

private JTextField txtape;

private JSlider sldia;

private JComboBox cmbmes;

private JLabel lblimg;

private JLabel lblsig;



SignoUsuario su= new SignoUsuario();



public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

PantallaUsuario window = new PantallaUsuario();

window.frame.setVisible(true);

} catch (Exception e) {

e.printStackTrace();

}

}

});

}

int ancho;

int alto;





public PantallaUsuario() {

initialize();

}



/*

* Initialize the contents of the frame.

*/

private void initialize() {

frame = new JFrame();

frame.getContentPane().setBackground(new Color(254, 216, 240));

frame.getContentPane().setLayout(null);



JLabel lblid = new JLabel("ID");

lblid.setForeground(new Color(221, 4, 140));

lblid.setFont(new Font("BIZ UDPGothic", Font.BOLD, 14));

lblid.setBounds(60, 34, 18, 14);

frame.getContentPane().add(lblid);



txtid = new JTextField();

txtid.addKeyListener(new KeyAdapter() {

@Override

public void keyTyped(KeyEvent e) {

if(txtid.getText().length()>=5) {

e.consume();

}



}

});

txtid.setForeground(new Color(146, 4, 221));

txtid.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));

txtid.setBounds(128, 32, 111, 20);

frame.getContentPane().add(txtid);

txtid.setColumns(10);



JLabel lblnom = new JLabel("Nombre");

lblnom.setHorizontalAlignment(SwingConstants.CENTER);

lblnom.setForeground(new Color(221, 4, 140));

lblnom.setFont(new Font("BIZ UDPGothic", Font.BOLD, 14));

lblnom.setBounds(39, 78, 67, 14);

frame.getContentPane().add(lblnom);



JLabel lblape = new JLabel("Apellido");

lblape.setHorizontalAlignment(SwingConstants.CENTER);

lblape.setForeground(new Color(221, 4, 140));

lblape.setFont(new Font("BIZ UDPGothic", Font.BOLD, 14));

lblape.setBounds(39, 119, 67, 14);

frame.getContentPane().add(lblape);



txtnom = new JTextField();

txtnom.addKeyListener(new KeyAdapter() {

@Override

public void keyTyped(KeyEvent e) {

if(txtnom.getText().length()>=30) {

e.consume();

}

}

});

txtnom.setForeground(new Color(146, 4, 221));

txtnom.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));

txtnom.setColumns(10);

txtnom.setBounds(128, 77, 111, 20);

frame.getContentPane().add(txtnom);



txtape = new JTextField();

txtape.addKeyListener(new KeyAdapter() {

@Override

public void keyTyped(KeyEvent e) {

if(txtape.getText().length()>=30) {

e.consume();

}

}

});

txtape.setForeground(new Color(146, 4, 221));

txtape.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));

txtape.setColumns(10);

txtape.setBounds(128, 118, 111, 20);

frame.getContentPane().add(txtape);



JLabel lblmes = new JLabel("Mes");

lblmes.setHorizontalAlignment(SwingConstants.CENTER);

lblmes.setForeground(new Color(221, 4, 140));

lblmes.setFont(new Font("BIZ UDPGothic", Font.BOLD, 14));

lblmes.setBounds(39, 168, 67, 14);

frame.getContentPane().add(lblmes);






 lblimg = new JLabel("");

lblimg.setBounds(62, 253, 287, 124);

frame.getContentPane().add(lblimg);

ancho=lblimg.getWidth();

alto=lblimg.getHeight();





JLabel lbldia = new JLabel("");

lbldia.setHorizontalAlignment(SwingConstants.CENTER);

lbldia.setForeground(new Color(146, 4, 221));

lbldia.setFont(new Font("BIZ UDGothic", Font.BOLD, 14));

lbldia.setBounds(259, 208, 67, 14);

frame.getContentPane().add(lbldia);



lblsig = new JLabel("");

lblsig.setBounds(60, 276, 46, 14);

frame.getContentPane().add(lblsig);

frame.setBounds(100, 100, 434, 427);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

lblsig.setVisible(false);











 cmbmes = new JComboBox();

cmbmes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));

cmbmes.setSelectedIndex(0);

cmbmes.setForeground(new Color(146, 4, 221));

cmbmes.setFont(new Font("BIZ UDGothic", Font.BOLD, 14));

cmbmes.setBounds(128, 164, 111, 22);

frame.getContentPane().add(cmbmes);





sldia = new JSlider();

sldia.addChangeListener(new ChangeListener() {

public void stateChanged(ChangeEvent e) {

lbldia.setText(""+sldia.getValue());

String cm=(String)cmbmes.getSelectedItem();

if (cm=="Enero") {

sldia.setMaximum(31);

sldia.setMinimum(1);

} else if (cm=="Febrero") {

sldia.setMaximum(28);

sldia.setMinimum(1);

} else if (cm=="Marzo") {

sldia.setMaximum(31);

sldia.setMinimum(1);

} else if (cm=="Abril") {

sldia.setMaximum(30);

sldia.setMinimum(1);

} else if (cm=="Mayo") {

sldia.setMaximum(31);

sldia.setMinimum(1);

} else if (cm=="Junio") {

sldia.setMaximum(30);

sldia.setMinimum(1);

} else if (cm=="Julio") {

sldia.setMaximum(31);

sldia.setMinimum(1);

} else if (cm=="Agosto") {

sldia.setMaximum(31);

sldia.setMinimum(1);

} else if (cm=="Septiembre") {

sldia.setMaximum(30);

sldia.setMinimum(1);

} else if (cm=="Octubre") {

sldia.setMaximum(31);

sldia.setMinimum(1);

} else if (cm=="Noviembre") {

sldia.setMaximum(30);

sldia.setMinimum(1);

} else if (cm=="Diciembre") {

sldia.setMaximum(31);

sldia.setMinimum(1);

}

}

});

sldia.setValue(1);

sldia.setBounds(120, 209, 129, 14);

frame.getContentPane().add(sldia);







JLabel lbl = new JLabel("Día");

lbl.setHorizontalAlignment(SwingConstants.CENTER);

lbl.setForeground(new Color(221, 4, 140));

lbl.setFont(new Font("BIZ UDPGothic", Font.BOLD, 14));

lbl.setBounds(39, 206, 67, 14);

frame.getContentPane().add(lbl);







JButton btnregistrar = new JButton("Registrar");

btnregistrar.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {




su.setIdusuario(Integer.parseInt(txtid.getText()));

su.setNombre(txtnom.getText());

su.setApellido(txtape.getText());

su.setMes(cmbmes.getSelectedItem());

su.setDia(sldia.getValue());

signo();

su.setSigno(lblsig.getText());


if(su.insertar()) {

JOptionPane.showMessageDialog(null, "Usuario registrado");

}else {

JOptionPane.showMessageDialog(null, "Error en el registro");

}

}



});





btnregistrar.setForeground(new Color(128, 0, 64));

btnregistrar.setFont(new Font("BIZ UDPGothic", Font.BOLD, 13));

btnregistrar.setBounds(284, 31, 103, 23);

frame.getContentPane().add(btnregistrar);

JButton btnconsultar = new JButton("Consultar");
btnconsultar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		try {
			int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id a consultar"));
			su.setIdusuario(id);
			
			if(su.consultar()) {
				JOptionPane.showMessageDialog(null, "Usuario Encontrado");
				
				txtid.setText(""+su.getIdusuario());
				txtnom.setText(""+su.getNombre());
				txtape.setText(""+su.getApellido());
				int dia=(Integer)su.getDia();
				sldia.setValue(dia);
				String mes=(String)su.getMes();
				cmbmes.setSelectedItem(mes);
				lblsig.setText(""+su.getSigno());
				signo();
				
			}else {
				JOptionPane.showMessageDialog(null, "Error");
			}
			
		} catch (Exception e2) {
			
		}
	}
	
	
});
btnconsultar.setForeground(new Color(128, 0, 64));
btnconsultar.setFont(new Font("BIZ UDPGothic", Font.BOLD, 13));
btnconsultar.setBounds(271, 75, 124, 23);
frame.getContentPane().add(btnconsultar);



JButton btnEliminar = new JButton("Eliminar");
btnEliminar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		try {
			int id=Integer.parseInt(JOptionPane.showInputDialog("Introduce id a eliminar"));
			su.setIdusuario(id);
			
			if(su.eliminar()) {
				JOptionPane.showMessageDialog(null, "Usuario eliminado");
			}else {
				JOptionPane.showMessageDialog(null, "Error");
			}
			
		}catch(Exception e2) {
			
		}
	}
});
btnEliminar.setForeground(new Color(128, 0, 64));
btnEliminar.setFont(new Font("BIZ UDPGothic", Font.BOLD, 13));
btnEliminar.setBounds(284, 116, 103, 23);
frame.getContentPane().add(btnEliminar);




JButton btnActualizar = new JButton("Actualizar");
btnActualizar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		su.setIdusuario(Integer.parseInt(txtid.getText()));

		su.setNombre(txtnom.getText());

		su.setApellido(txtape.getText());

		su.setMes(cmbmes.getSelectedItem());

		su.setDia(sldia.getValue());
		
		signo();
		
		su.setSigno(lblsig.getText());

		

		if(su.actualizar()) {

		JOptionPane.showMessageDialog(null, "Usuario actualizado");

		}else {

		JOptionPane.showMessageDialog(null, "Error");

		}
		
	}
});
btnActualizar.setForeground(new Color(128, 0, 64));
btnActualizar.setFont(new Font("BIZ UDPGothic", Font.BOLD, 13));
btnActualizar.setBounds(271, 159, 124, 23);
frame.getContentPane().add(btnActualizar);
}




public void signo() {
	int dia=(Integer) sldia.getValue();
	String item=cmbmes.getSelectedItem().toString();
	String sig="";
	
	
	     if(item.equalsIgnoreCase("Marzo")) {
            if(dia<20) {
			
			lblsig.setText("Piscis");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/piscis.jpeg"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			
		}
		
			
		}else if(dia>=20) {
			
			lblsig.setText("Aries");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/aries.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	
	   
	     
	     
	if(item.equalsIgnoreCase("Abril")) {
		if(dia<20) {
			
			lblsig.setText("Aries");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/aries.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			
		}else if(dia>=20) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tauro.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Tauro");
		}
	}
	
	
	if(item.equalsIgnoreCase("Mayo")) {
		if(dia<=20) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tauro.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Tauro");
		}else if(dia>=21) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/geminis.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Géminis");
		}
	}
	
	
	
	if(item.equalsIgnoreCase("Junio")) {
		if (dia<=20) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/geminis.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Géminis");
		}else if(dia>=21) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cancer.jpeg"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Cáncer");
		}
	}
	
	
	if(item.equalsIgnoreCase("Julio")) {
		if (dia<=22) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cancer.jpeg"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Cáncer");
		}else if(dia>=23) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/leo.jpeg"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Leo");
		}
	}
	
	
	if(item.equalsIgnoreCase("Agosto")) {
		if(dia<=22) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/leo.jpeg"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Leo");
		}else if(dia>=23) {
			lblsig.setText("Virgo");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/virgo.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));


		}
	}
	
	
	if(item.equalsIgnoreCase("Septiembre")) {
		if(dia<=22) {
			lblsig.setText("Virgo");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/virgo.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));


		}else if(dia>=23) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/libra.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Libra");
		}
	}
	
	
	if(item.equalsIgnoreCase("Octubre")) {
		if(dia<=22) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/libra.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

			lblsig.setText("Libra");
		}else if(dia>=23) {
			lblsig.setText("Escorpio");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/escorpio.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}
	}
	
	if(item.equalsIgnoreCase("Noviembre")) {
		if(dia<=21) {
			lblsig.setText("Escorpio");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/escorpio.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}else if(dia>=22) {
			lblsig.setText("Sagitario");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sagitario.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}
	}
	
	
	if(item.equalsIgnoreCase("Diciembre")) {
		if(dia<=21) {
			lblsig.setText("Sagitario");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sagitario.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}else if(dia>=22) {
			lblsig.setText("Capricornio");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/capricornio.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}
	}
	
	
	if(item.equalsIgnoreCase("Enero")) {
		
		if(dia<20) {
			lblsig.setText("Capricornio");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/capricornio.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			
		}else if( dia>=20) {

			lblsig.setText("Acuario");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/acuario.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

	}
}
	
	if(item.equalsIgnoreCase("Febrero")) {
		if(dia<=18) {
			lblsig.setText("Acuario");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/acuario.png"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}else if(dia>=19) {
			lblsig.setText("Piscis");

			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/piscis.jpeg"));

			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		}
		su.setSigno(lblsig.getText());
	}
	

}
}





