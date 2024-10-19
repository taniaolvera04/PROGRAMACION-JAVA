package rosti;

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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;


public class PantallaRosti {

	private JFrame frmRosticera;
	private JTextField txtnom;
	private JTextField txtid;
	private JComboBox cmbp;
	private JComboBox com;
	private JComboBox cmbcom;
	private JLabel lblimg;
	private JLabel lblimg2;
	private JSpinner sp;
	private JLabel lblpre;
	
	
	
int pr=100;
int ran=80;
int  pp=200;
int cos=150;
int c=30;
Rosticeria r=new Rosticeria();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaRosti window = new PantallaRosti();
					window.frmRosticera.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	int ancho, alto;
	int ancho2, alto2;
	
	public PantallaRosti() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRosticera = new JFrame();
		frmRosticera.getContentPane().setBackground(new Color(255, 255, 191));
		frmRosticera.setTitle("ROSTICERÍA");
		frmRosticera.setBounds(100, 100, 450, 634);
		frmRosticera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRosticera.getContentPane().setLayout(null);
		
		JLabel lblnom = new JLabel("Nombre");
		lblnom.setHorizontalAlignment(SwingConstants.CENTER);
		lblnom.setForeground(new Color(242, 139, 0));
		lblnom.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblnom.setBounds(41, 31, 75, 14);
		frmRosticera.getContentPane().add(lblnom);
		
		txtnom = new JTextField();
		txtnom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtnom.getText().length()>=30) {
				e.consume();
				}
			}
		});
		txtnom.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		txtnom.setBounds(123, 30, 127, 20);
		frmRosticera.getContentPane().add(txtnom);
		txtnom.setColumns(10);
		
		JLabel lblid = new JLabel("ID");
		lblid.setForeground(new Color(242, 139, 0));
		lblid.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblid.setBounds(287, 31, 18, 14);
		frmRosticera.getContentPane().add(lblid);
		lblid.setVisible(false);
		
		txtid = new JTextField();
		txtid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtid.getText().length()>=4) {
					e.consume();
				}
			}
		});
		txtid.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		txtid.setColumns(10);
		txtid.setBounds(315, 29, 75, 20);
		frmRosticera.getContentPane().add(txtid);
		txtid.setVisible(false);
		txtid.setEditable(false);
		
		JLabel lblp = new JLabel("Producto");
		lblp.setHorizontalAlignment(SwingConstants.CENTER);
		lblp.setForeground(new Color(242, 139, 0));
		lblp.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblp.setBounds(93, 81, 86, 14);
		frmRosticera.getContentPane().add(lblp);
		
		lblimg = new JLabel("");
		lblimg.setBounds(28, 128, 209, 165);
		frmRosticera.getContentPane().add(lblimg);
		ancho=lblimg.getWidth();
		alto=lblimg.getHeight();
		
		JLabel lblpr = new JLabel("Precio   $");
		lblpr.setHorizontalAlignment(SwingConstants.CENTER);
		lblpr.setForeground(new Color(242, 139, 0));
		lblpr.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblpr.setBounds(259, 188, 75, 14);
		frmRosticera.getContentPane().add(lblpr);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(242, 139, 0));
		separator.setBounds(259, 206, 131, 2);
		frmRosticera.getContentPane().add(separator);
		
		lblpre = new JLabel("");
		lblpre.setHorizontalAlignment(SwingConstants.LEFT);
		lblpre.setForeground(new Color(242, 139, 0));
		lblpre.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblpre.setBounds(331, 188, 75, 14);
		frmRosticera.getContentPane().add(lblpre);
		
		JLabel lblc = new JLabel("Cantidad");
		lblc.setHorizontalAlignment(SwingConstants.CENTER);
		lblc.setForeground(new Color(242, 139, 0));
		lblc.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblc.setBounds(135, 309, 86, 20);
		frmRosticera.getContentPane().add(lblc);
		
		sp = new JSpinner();
		sp.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		sp.setFont(new Font("Segoe UI", Font.BOLD, 13));
		sp.setBounds(236, 310, 48, 20);
		frmRosticera.getContentPane().add(sp);
		
		JLabel lblcom = new JLabel("Complementos ($30)");
		lblcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom.setForeground(new Color(242, 139, 0));
		lblcom.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lblcom.setBounds(55, 366, 178, 20);
		frmRosticera.getContentPane().add(lblcom);
		
	
		
		lblimg2 = new JLabel("");
		lblimg2.setBounds(236, 414, 140, 114);
		frmRosticera.getContentPane().add(lblimg2);
		ancho2=lblimg.getWidth();
		alto2=lblimg2.getHeight();
		
		
		JLabel lbl = new JLabel("0");
		lbl.setBounds(55, 414, 46, 14);
		frmRosticera.getContentPane().add(lbl);
		lbl.setVisible(false);
		
		
		
		 cmbp = new JComboBox();
		cmbp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pollo();
			}
		});
		cmbp.setForeground(new Color(213, 80, 0));
		cmbp.setModel(new DefaultComboBoxModel(new String[] {"", "Pollo Rostizado", "Pollo Ranchero", "Pierna de Pavo", "Costilla"}));
		cmbp.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		cmbp.setBounds(189, 79, 156, 22);
		frmRosticera.getContentPane().add(cmbp);
		
		
		
		

	
		
		
	 cmbcom = new JComboBox();
		cmbcom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String)cmbcom.getSelectedItem();
if (item.equalsIgnoreCase("SI")) {
	com.setVisible(true);
	lbl.setText("30");
	
}else if(item.equalsIgnoreCase("NO")){
	com.setVisible(false);
	com.setSelectedItem("");
	lbl.setText("0");
}
			}
		});
		cmbcom.setForeground(new Color(213, 80, 0));
		cmbcom.setModel(new DefaultComboBoxModel(new String[] {"NO", "SI"}));
		cmbcom.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		cmbcom.setBounds(243, 366, 62, 22);
		frmRosticera.getContentPane().add(cmbcom);
		
	    com = new JComboBox();
		com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				com.setVisible(true);
				String i=(String)cmbcom.getSelectedItem();
				if(i.equalsIgnoreCase("SI")) {
					com();	
				}else {
					com();
				}
				
			
			}
	
		});
		com.setModel(new DefaultComboBoxModel(new String[] {"", "Cebollitas", "Nopales", "Papas", "Salchichas"}));
		com.setForeground(new Color(213, 80, 0));
		com.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		com.setBounds(41, 459, 156, 22);
		frmRosticera.getContentPane().add(com);
		com.setVisible(false);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rosticeria r=new Rosticeria();
				lblid.setVisible(true);
				txtid.setVisible(true);
				
				
			String p=(String)cmbp.getSelectedItem();
			String co=(String)cmbcom.getSelectedItem();
			String tc=(String)com.getSelectedItem();
			int cm=(Integer.parseInt(lbl.getText()));
				
				
				
				
				r.setNombre(txtnom.getText());
				r.setProducto((String)cmbp.getSelectedItem());
				r.setCantp((Integer)sp.getValue());
				r.setComplemento((String)com.getSelectedItem());
				
				int cpo=(Integer)sp.getValue();
				int ppre=(Integer.parseInt(lblpre.getText()));
				int pre=(cpo*ppre);
				int tot=pre+cm;
				DecimalFormat df=new DecimalFormat();
				double iv=((tot/1.16)*0.16);

				
				r.setTotal(tot);
				r.setIva((double)iv);
				
				if(r.insertar()) {
					
					JOptionPane.showMessageDialog(null, "Producto: " + p + "\nCantidad: " + cpo + "\nComplementos: " + co + "\nTipo de Complementos: " + tc +
							 "\nTotal a pagar: " + tot + "\nIVA: " + df.format(iv));
					limpiar();
				}else {       
					JOptionPane.showMessageDialog(null, "Error en registro");
				}
				
			}
		});
		btnRegistrar.setForeground(new Color(255, 98, 21));
		btnRegistrar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnRegistrar.setBounds(10, 561, 91, 23);
		frmRosticera.getContentPane().add(btnRegistrar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				txtid.setVisible(true);
				lblid.setVisible(true);
				try {
					int id=Integer.parseInt(JOptionPane.showInputDialog("Introduce ID a consultar"));
					r.setIdc(id);
					
					
					if(r.consultar()) {
						JOptionPane.showMessageDialog(null, "Cliente encontrado");
						txtid.setText(""+r.getIdc());
						txtnom.setText(""+r.getNombre());
						String p=(String)r.getProducto();
						cmbp.setSelectedItem(p);
						String c=(String)r.getComplemento();
						com.setSelectedItem(c);
						sp.setValue((Integer)r.getCantp());
						
						if(com.isVisible()==true) {
							cmbcom.setSelectedItem("SI");
						}else{
							cmbcom.setSelectedItem("NO");
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Cliente no Encontrado");
					}
					
					
				}catch(Exception e2){
					
				}
				
				
				
			}
		});
		btnConsultar.setForeground(new Color(255, 98, 21));
		btnConsultar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnConsultar.setBounds(111, 561, 101, 23);
		frmRosticera.getContentPane().add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rosticeria r=new Rosticeria();
				lblid.setVisible(true);
				txtid.setVisible(true);
				
				
			String p=(String)cmbp.getSelectedItem();
			String co=(String)cmbcom.getSelectedItem();
			String tc=(String)com.getSelectedItem();
			int cm=(Integer.parseInt(lbl.getText()));
				
				
				
				r.setIdc(Integer.parseInt(txtid.getText()));
				r.setNombre(txtnom.getText());
				r.setProducto((String)cmbp.getSelectedItem());
				r.setCantp((Integer)sp.getValue());
				r.setComplemento((String)com.getSelectedItem());
			
				
				
				int cpo=(Integer)sp.getValue();
				int ppre=(Integer.parseInt(lblpre.getText()));
				int pre=(cpo*ppre);
				int tot=pre+cm;
				DecimalFormat df=new DecimalFormat();
				double iv=((tot/1.16)*0.16);

				
				r.setTotal(tot);
				r.setIva((double)iv);
				
				if(r.actualizar()) {
					JOptionPane.showMessageDialog(null, "Cliente Actualizado");
					JOptionPane.showMessageDialog(null, "Producto: " + p + "\nCantidad: " + cpo + "\nComplementos: " + co + "\nTipo de Complementos: " + tc +
							 "\nTotal a pagar: " + tot + "\nIVA: " + df.format(iv));
					
				}else {       
					JOptionPane.showMessageDialog(null, "Error al actualizar ID");
				}
			}
		});
		btnActualizar.setForeground(new Color(255, 98, 21));
		btnActualizar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnActualizar.setBounds(222, 561, 101, 23);
		frmRosticera.getContentPane().add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id=Integer.parseInt(JOptionPane.showInputDialog("Introduce ID a eliminar"));
					r.setIdc(id);
					
					if(r.eliminar()) {
						JOptionPane.showMessageDialog(null, "Cliente eliminado");
						limpiar();
					}else {
						JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
					}
					
					
				}catch(Exception e2) {
					
				}
				
				
			}
		});
		btnEliminar.setForeground(new Color(255, 98, 21));
		btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnEliminar.setBounds(331, 561, 93, 23);
		frmRosticera.getContentPane().add(btnEliminar);
	
		
	}
	
	
	public void limpiar() {
		txtnom.setText("");
		txtid.setText("");
		cmbp.setSelectedItem("");
		cmbcom.setSelectedItem("NO");
		lblimg.setText("");
		lblimg2.setText("");
		sp.setValue(1);
		
	}
	
	
	
	
	public void pollo() {
		String it=(String)cmbp.getSelectedItem();
		if(it.equalsIgnoreCase("")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			lblpre.setText("");
		} else if(it.equalsIgnoreCase("Pollo Rostizado")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pr.jpg"));
			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			lblpre.setText(""+pr);     
		}else if(it.equalsIgnoreCase("Pollo Ranchero")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pran.jpg"));
			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			lblpre.setText(""+ran);
		}else if(it.equalsIgnoreCase("Pierna de Pavo")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pp.jpg"));
			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			lblpre.setText(""+pp);
		}else if(it.equalsIgnoreCase("Costilla")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cos.jpg"));
			lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			lblpre.setText(""+cos);
		}
	}
	
	
	public void com() {
		String co=(String)com.getSelectedItem();
		if(co.equalsIgnoreCase("")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
			lblimg2.setIcon(new ImageIcon(foto.getScaledInstance(ancho2, alto2, Image.SCALE_SMOOTH)));
			com.setVisible(false);
		} else if(co.equalsIgnoreCase("Cebollitas")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ceb.jpg"));
			lblimg2.setIcon(new ImageIcon(foto.getScaledInstance(ancho2, alto2, Image.SCALE_SMOOTH)));
		}else if(co.equalsIgnoreCase("Nopales")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/no.jpg"));
			lblimg2.setIcon(new ImageIcon(foto.getScaledInstance(ancho2, alto2, Image.SCALE_SMOOTH)));
		}else if(co.equalsIgnoreCase("Papas")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pa.jpg"));
			lblimg2.setIcon(new ImageIcon(foto.getScaledInstance(ancho2, alto2, Image.SCALE_SMOOTH)));
		}else if(co.equalsIgnoreCase("Salchichas")) {					
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sa.jpg"));
			lblimg2.setIcon(new ImageIcon(foto.getScaledInstance(ancho2, alto2, Image.SCALE_SMOOTH)));
		}
	}
	
	
	
}
