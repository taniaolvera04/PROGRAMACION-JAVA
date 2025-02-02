                  package cine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PantallaCinema {

	private JFrame frmCinema;
	private JTextField txtnom;
	private JLabel lblimg;
	private JComboBox cmbn;
	private JComboBox cmbpe;
	private JSpinner spn;
	private JTextField txtid;


	/**
	 * Launch the application.
	 */
	
	int ancho, alto;
	private JTextField txt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaCinema window = new PantallaCinema();
					window.frmCinema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaCinema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCinema = new JFrame();
		frmCinema.getContentPane().setBackground(new Color(191, 193, 255));
		frmCinema.setTitle("CINEMA");
		frmCinema.setBounds(100, 100, 469, 508);
		frmCinema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCinema.getContentPane().setLayout(null);
		
		
		JLabel lblnom = new JLabel("Nombre");
		lblnom.setForeground(new Color(0, 3, 136));
		lblnom.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 14));
		lblnom.setHorizontalAlignment(SwingConstants.CENTER);
		lblnom.setBounds(105, 26, 63, 14);
		frmCinema.getContentPane().add(lblnom);
		
		txtnom = new JTextField();
		txtnom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtnom.getText().length()>=30) {
					e.consume();
				}
			}
		});
		txtnom.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 12));
		txtnom.setBounds(178, 24, 131, 20);
		frmCinema.getContentPane().add(txtnom);
		txtnom.setColumns(10);
		

		JLabel lblid = new JLabel("ID");
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setForeground(new Color(0, 3, 136));
		lblid.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 14));
		lblid.setBounds(306, 26, 46, 14);
		frmCinema.getContentPane().add(lblid);
		lblid.setVisible(false);
		
		txtid = new JTextField();
		txtid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtid.getText().length()>=4) {
					e.consume();
				}
			}
		});
		txtid.setEditable(false);
		txtid.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 12));
		txtid.setColumns(10);
		txtid.setBounds(349, 24, 81, 20);
		frmCinema.getContentPane().add(txtid);
		txtid.setVisible(false);
		
		
	
		
		
		
		lblimg = new JLabel("");
		lblimg.setBounds(156, 98, 138, 167);
		frmCinema.getContentPane().add(lblimg);
		ancho=lblimg.getWidth();
		alto=lblimg.getHeight();

		
		cmbpe = new JComboBox();
		cmbpe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String)cmbpe.getSelectedItem();
				if(item.equalsIgnoreCase("Monster High:13 Deseos")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/MH.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("Forrest Gump")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/FG.jpeg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("Bring The Soul: The Movie")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/BTS.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("BLACKPINK The Movie")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/BL.jpeg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("Megamente")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/MG.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("Harry Potter")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/HP.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("8 Mile")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/8M.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("Shrek")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/SH.jpeg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("Volver al Futuro")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/VF.jpeg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}else if(item.equalsIgnoreCase("El Perfecto Asesino")) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/EP.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				}
				
			}
		});
		cmbpe.setModel(new DefaultComboBoxModel(new String[] {"Selecciones", "Monster High:13 Deseos", "Forrest Gump", "Bring The Soul: The Movie", "BLACKPINK The Movie", "Megamente", "Harry Potter", "8 Mile", "Shrek", "Volver al Futuro", "El Perfecto Asesino"}));
		cmbpe.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 13));
		cmbpe.setBounds(103, 65, 230, 22);
		frmCinema.getContentPane().add(cmbpe);
		
		
		JSpinner spad = new JSpinner();
		spad.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spad.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 13));
		spad.setBounds(244, 283, 46, 22);
		frmCinema.getContentPane().add(spad);
		

		
		
		JLabel lblbola = new JLabel("Boletos ($95)");
		lblbola.setHorizontalAlignment(SwingConstants.CENTER);
		lblbola.setForeground(new Color(95, 2, 134));
		lblbola.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 14));
		lblbola.setBounds(103, 285, 101, 14);
		frmCinema.getContentPane().add(lblbola);
		
		JLabel lblboln = new JLabel("Boletos para niño ($60)");
		lblboln.setHorizontalAlignment(SwingConstants.CENTER);
		lblboln.setForeground(new Color(95, 2, 134));
		lblboln.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 14));
		lblboln.setBounds(139, 328, 187, 20);
		frmCinema.getContentPane().add(lblboln);
		
		
		spn = new JSpinner();
		spn.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 13));
		spn.setBounds(244, 359, 46, 22);
		frmCinema.getContentPane().add(spn);
		spn.setVisible(false);
		
		
		cmbn = new JComboBox();
		cmbn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String)cmbn.getSelectedItem();
				if(item.equalsIgnoreCase("SI")) {
					spn.setVisible(true);
					spn.setValue(1);
				}else {
					spn.setVisible(false);
					spn.setValue(0);
				}
			}
		});
		cmbn.setModel(new DefaultComboBoxModel(new String[] {"NO", "SI"}));
		cmbn.setSelectedIndex(0);
		cmbn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 13));
		cmbn.setBounds(168, 359, 54, 22);
		frmCinema.getContentPane().add(cmbn);
		
		

		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblid.setVisible(true);
				txtid.setVisible(true);
				Cinema c=new Cinema();
				int bola=(Integer)spad.getValue();
				int boln=(Integer)spn.getValue();
				int tot=(bola*95)+(boln*60);
				int total=(bola+boln);
				
				c.setNombre(txtnom.getText());
				c.setPelicula((String)cmbpe.getSelectedItem());
				c.setNobolad((Integer)spad.getValue());
				c.setNoboln((Integer)spn.getValue());
			    c.setTotal(tot);
				
				
				if(c.insertar()) {
					JOptionPane.showMessageDialog(null, "Total a pagar: " + tot + "\n" + "# Boletos Adulto: " + bola + "\n" + "# Boletos Niño: " + boln + "\n" + "Total Boletos: "+ total);
				}else {
					JOptionPane.showMessageDialog(null, "Fallo en registro");
				}
			}
		});
		btnRegistrar.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 12));
		btnRegistrar.setBounds(10, 422, 101, 23);
		frmCinema.getContentPane().add(btnRegistrar);

	
	
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cinema c=new Cinema();
				try {
					int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id a consultar"));
					c.setIdp(id);
					txtid.setVisible(true);
					lblid.setVisible(true);
					
					if(c.consultar()) {
						JOptionPane.showMessageDialog(null, "Cliente Encontrado");
						
						txtid.setText(""+c.getIdp());
						txtnom.setText(""+c.getNombre());
						String peli=(String)c.getPelicula();
						cmbpe.setSelectedItem(peli);
						spad.setValue((Integer)c.getNobolad());
						spn.setValue((Integer)c.getNoboln());
						
if (c.getNoboln()>=1) {
	cmbpe.setSelectedItem("SI");
}else {
	cmbpe.setSelectedItem("SI");
}
						
					}else {
						JOptionPane.showMessageDialog(null, "Cliente no Encontrado");
					}
					
				} catch (Exception e2) {
					
				}
			}
		});
		btnConsultar.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 12));
		btnConsultar.setBounds(121, 422, 101, 23);
		frmCinema.getContentPane().add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblid.setVisible(true);
				txtid.setVisible(true);
				Cinema c=new Cinema();
				c.setIdp(Integer.parseInt((txtid.getText())));
				c.setNombre(txtnom.getText());
				c.setPelicula((String)cmbpe.getSelectedItem());
				c.setNobolad((Integer)spad.getValue());
				c.setNoboln((Integer)spn.getValue());
				
				int bola=(Integer)spad.getValue();
				int boln=(Integer)spn.getValue();
				int tot=(bola*95)+(boln*60);
				int total=(bola+boln);
			    c.setTotal(tot);
			    
			
				if(c.actualizar()) {
					JOptionPane.showMessageDialog(null, "Cliente Actualizado");
					JOptionPane.showMessageDialog(null, "Total a pagar: " + tot + "\n" + "# Boletos Adulto: " + bola + "\n" + "# Boletos Niño: " + boln + "\n" + "Total Boletos: "+ total);
				}else {
					JOptionPane.showMessageDialog(null, "Error al actualizar");
				}
			
			}
		});
		btnActualizar.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 12));
		btnActualizar.setBounds(232, 422, 101, 23);
		frmCinema.getContentPane().add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cinema c=new Cinema();
				try {
					int id=Integer.parseInt(JOptionPane.showInputDialog("Introduce id a eliminar"));
					c.setIdp(id);
					
					if(c.eliminar()) {
						JOptionPane.showMessageDialog(null, "Usuario eliminado");
					}else {
						JOptionPane.showMessageDialog(null, "Error");
					}
					
				}catch(Exception e2) {
					
				}
			}
		});
		btnEliminar.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 12));
		btnEliminar.setBounds(343, 422, 101, 23);
		frmCinema.getContentPane().add(btnEliminar);

	}
}
