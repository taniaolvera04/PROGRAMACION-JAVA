package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import Controlador.KirikoLRS;
import Modelo.Conexion;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VAd extends JFrame {

	private JPanel PS;
	private JFrame PL;
	private JPanel az;
	private JTextField txtu;
	private JPasswordField txtc;
	private JPasswordField txtc2;
	int ancho, alto;
	private JTextField txtn;
	private JTextField txtap;
	private JTextField txtid;
	private JTable table;
	private JTable table_1;
	private JComboBox cmbt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAd frame = new VAd();
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
	public VAd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VAd.class.getResource("/img/1697592790252.jpg")));
		setTitle("ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 964, 758);
		setLocationRelativeTo(null);
	
		
		PS = new JPanel();
		PS.setBackground(new Color(243, 194, 233));
		PS.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PS);
	    PS.setLayout(null);
		
	    az = new JPanel();
	    az.setBounds(0, 0, 950, 108);
	    az.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		az.setBackground(new Color(215, 224, 255));
		PS.add(az);
		az.setLayout(null);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(357, 129, 31, 21);
		lblid.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblid);
		lblid.setVisible(false);
		
		txtid = new JTextField();
		txtid.setBounds(388, 128, 133, 21);
		txtid.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtid.setColumns(10);
		PS.add(txtid);
		txtid.setVisible(false);
		JLabel logo = new JLabel("");
		logo.setBounds(852, 10, 88, 88);
		az.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		
		cmbt = new JComboBox();
		cmbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cmbt.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbt.setModel(new DefaultComboBoxModel(new String[] {"Usuario", "Admin"}));
		cmbt.setBounds(594, 130, 167, 21);
		PS.add(cmbt);

		
		JLabel lblt = new JLabel("Tipo");
		lblt.setFont(new Font("Dialog", Font.BOLD, 12));
		lblt.setBounds(564, 129, 39, 21);
		PS.add(lblt);
		
		JLabel lblcreaUnaCuenta = new JLabel("¡¡Ingrese un nuevo usuario!!");
		lblcreaUnaCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblcreaUnaCuenta.setForeground(new Color(0, 114, 168));
		lblcreaUnaCuenta.setFont(new Font("Dialog", Font.BOLD, 20));
		lblcreaUnaCuenta.setBounds(23, 10, 296, 42);
		az.add(lblcreaUnaCuenta);
		
		JLabel lblBlucorpEstDiseado = new JLabel("BluCorp está diseñado para ayudarle.");
		lblBlucorpEstDiseado.setHorizontalAlignment(SwingConstants.LEFT);
		lblBlucorpEstDiseado.setForeground(new Color(0, 149, 221));
		lblBlucorpEstDiseado.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblBlucorpEstDiseado.setBounds(23, 62, 313, 24);
		az.add(lblBlucorpEstDiseado);
		
		JLabel kiriko = new JLabel("");
		kiriko.setBounds(42, 118, 83, 69);
		PS.add(kiriko);
		ancho=kiriko.getWidth();
		alto=kiriko.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel lblu = new JLabel("Ingresa un nombre de usuario");
		lblu.setBounds(42, 338, 185, 21);
		lblu.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblu);
		
		txtu = new JTextField();
		txtu.setBounds(42, 369, 236, 31);
		txtu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtu.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtu.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtu.setColumns(10);
		PS.add(txtu);
		
		JLabel lblc = new JLabel("Introduce una contraseña");
		lblc.setBounds(42, 416, 162, 21);
		lblc.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblc);
		
		txtc = new JPasswordField();
		txtc.setBounds(42, 453, 236, 31);
		txtc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtc.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtc.setHorizontalAlignment(SwingConstants.LEFT);
		txtc.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtc.setEchoChar('•');
		PS.add(txtc);
	
		
		
		
		JCheckBox Password = new JCheckBox("Mostrar contraseña");
		Password.setBounds(42, 493, 153, 23);
		Password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char i=txtc.getEchoChar();
				if(Password.isSelected()==true) {
				txtc.setEchoChar((char) 0);
				}else if(Password.isSelected()==false) {
				txtc.setEchoChar('•');
					}
			}
		});
		Password.setFont(new Font("Dialog", Font.BOLD, 11));
		Password.setBackground(new Color(243, 194, 233));
		PS.add(Password);
		
		JLabel lblc2 = new JLabel("Confirma la contraseña");
		lblc2.setBounds(42, 522, 162, 21);
		lblc2.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblc2);
		
		txtc2 = new JPasswordField();
		txtc2.setBounds(42, 553, 236, 31);
		txtc2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtc2.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtc2.setHorizontalAlignment(SwingConstants.LEFT);
		txtc2.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtc2.setEchoChar('•');
		PS.add(txtc2);
		
		JCheckBox Password2 = new JCheckBox("Mostrar contraseña");
		Password2.setBounds(42, 598, 153, 23);
		Password2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char i=txtc2.getEchoChar();
				if(Password2.isSelected()==true) {
				txtc2.setEchoChar((char) 0);
				}else if(Password2.isSelected()==false) {
				txtc2.setEchoChar('•');
					}
			}
		});
		Password2.setFont(new Font("Dialog", Font.BOLD, 11));
		Password2.setBackground(new Color(243, 194, 233));
		PS.add(Password2);
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setBounds(331, 680, 305, 31);
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.BOLD, 9));
		PS.add(creditos);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(42, 643, 126, 31);
		btnRegistrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				String nombre=txtn.getText();
				String apellido=txtap.getText();
				String usuario=txtu.getText();
				String pass=txtc.getText();
				String pass2=txtc2.getText();
				String tipo=(String) cmbt.getSelectedItem();
				k.setNombre(nombre);
				k.setAp(apellido);
				k.setNombreu(usuario);
				k.setContra(pass);
				k.setTipo(tipo);
				k.setCodigo(UUID.randomUUID().toString().toUpperCase().substring(0, 5));
				lblid.setVisible(false);
    			txtid.setVisible(false);
				
				if(usuario.isEmpty() || pass.isEmpty() || pass2.isEmpty()) {
  			JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else if(pass2.equals(pass)!=pass.equals(pass2)) {
					JOptionPane.showMessageDialog(null, "Contraseñas deben ser iguales");
				
				}else {
			
					 if(k.insertar()) {
				 
					JOptionPane.showMessageDialog(null, "Usuario registrado\n"
							+ "Usuario: " + k.getNombreu() + "\n"
							+ "Contraseña " + k.getContra() + "\n"
							+ "Código " + k.getCodigo() + "\n"
									+ "	Tipo " + k.getTipo());
					

				 
				}else {
					JOptionPane.showMessageDialog(null, "ERROR");
			}
				
				}
				
			}
			
			
		});
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(121, 134, 196));
		PS.add(btnRegistrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(196, 643, 126, 31);
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				String nombre=txtn.getText();
				String apellido=txtap.getText();
				String usuario=txtu.getText();
				String pass=txtc.getText();
				String pass2=txtc2.getText();
				k.setNombre(txtn.getText());
				k.setAp(txtap.getText());
				k.setNombreu(txtu.getText());
				k.setContra(txtc.getText());
				txtid.setVisible(true);
				lblid.setVisible(true);
				String op=(String) cmbt.getSelectedItem();
				lblt.setVisible(true);
				PreparedStatement ps=null;
				DefaultTableModel modelo=new DefaultTableModel();
				try {
					Conexion c=new Conexion();
					Connection cn =c.conectar();
					ps=cn.prepareStatement("UPDATE usuario SET nombre=?, ap=?, ussername=?,tipo=? WHERE id_u=?");
					ps.setString(5, txtid.getText());
					ps.setString(1, txtn.getText());
					ps.setString(2, txtap.getText());
					ps.setString(3, txtu.getText());
					//ps.setString(4, txtc.getText());
ps.setString(4, (String) cmbt.getSelectedItem());



					ps.executeUpdate();
					 
					JOptionPane.showMessageDialog(null, "Usuario Actualizado\n"
							+ "Usuario: " + k.getNombreu() + "\n"
							+ "Contraseña " + k.getContra() + "\n");
					} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
				}
		});
		btnActualizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setBackground(new Color(121, 134, 196));
		PS.add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar todo");
		btnBorrar.setBounds(637, 645, 126, 29);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtn.setText("");
				txtap.setText("");
				txtu.setText("");
				txtc.setText("");
				txtc2.setText("");
				Password.setSelected(false);
				Password2.setSelected(false);
			txtid.setText("");	
			
			}
		});
		btnBorrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(121, 134, 196));
		btnBorrar.setBorder(null);
		PS.add(btnBorrar);
		
		JLabel lblIngresaTuNombre = new JLabel("Ingresa el nombre");
		lblIngresaTuNombre.setBounds(42, 197, 185, 21);
		lblIngresaTuNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblIngresaTuNombre);
		
		txtn = new JTextField();
		txtn.setBounds(42, 228, 236, 31);
		txtn.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtn.setColumns(10);
		PS.add(txtn);
		
		JLabel lblIngresaTuApellido = new JLabel("Ingresa el apellido");
		lblIngresaTuApellido.setBounds(42, 269, 185, 21);
		lblIngresaTuApellido.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblIngresaTuApellido);
		
		txtap = new JTextField();
		txtap.setBounds(42, 300, 236, 31);
		txtap.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtap.setColumns(10);
		PS.add(txtap);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(347, 643, 126, 31);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps=null;
				DefaultTableModel modelo=new DefaultTableModel();
				try {
					Conexion c=new Conexion();
					Connection cn=c.conectar();
					int fila=table_1.getSelectedRow();
					String id=table_1.getValueAt(fila, 0).toString();
					ps=cn.prepareStatement("DELETE FROM usuario WHERE id_u=?");
					ps.setString(1, id);
					ps.execute();
					JOptionPane.showMessageDialog(null, "Usuario Eliminado");
					txtn.setText("");
					txtap.setText("");
					txtid.setText("");
					txtu.setText("");
					txtc.setText("");
					txtc2.setText("");
					cmbt.setSelectedItem("Usuario");
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			
			}
		});
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnEliminar.setBackground(new Color(121, 134, 196));
		PS.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Mostrar");
		btnConsultar.setBounds(497, 643, 126, 31);
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement ps=null;
					ResultSet rs=null;
						Conexion cx=new Conexion();
						Connection cn=cx.conectar();
						
						DefaultTableModel modelo=new DefaultTableModel();
						table_1.setModel(modelo);
					
						String sql="SELECT id_u, nombre, ap, ussername, tipo FROM usuario";
					ps=cn.prepareStatement(sql);
					rs=ps.executeQuery();
					ResultSetMetaData rsm=(ResultSetMetaData) rs.getMetaData();
					int cantidadColumnas=rsm.getColumnCount();
					modelo.addColumn("id");
					modelo.addColumn("Nombre");
					modelo.addColumn("Apellido");
					modelo.addColumn("Ussername");
				//	modelo.addColumn("Password");
					modelo.addColumn("Tipo");
					
					
					while(rs.next()) {
						Object [] fila=new Object[cantidadColumnas];
						for(int i=0;i<cantidadColumnas;i++) {
							fila [i]=rs.getObject(i+1);
						}
									modelo.addRow(fila);
						
						
					}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnConsultar.setBackground(new Color(121, 134, 196));
		PS.add(btnConsultar);
		
				JButton btnCerrarSesion = new JButton("Salir");
				btnCerrarSesion.setBounds(792, 643, 126, 31);
				btnCerrarSesion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MenuD m=new MenuD();
						m.setVisible(true);
						dispose();
						
					}
				});
				btnCerrarSesion.setForeground(Color.WHITE);
				btnCerrarSesion.setFont(new Font("Segoe UI", Font.BOLD, 12));
				btnCerrarSesion.setBackground(new Color(121, 134, 196));
				PS.add(btnCerrarSesion);
				
				JButton btnusu = new JButton("");
				btnusu.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
				btnusu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						Document documento=new Document();
						try {
							String ruta =System.getProperty("user.home");
							PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Usuarios.pdf"));                                                                  
							documento.open();
							PdfPTable tabla=new PdfPTable(5);
							tabla.addCell("ID");
							tabla.addCell("NOMBRE");
							tabla.addCell("APELLIDO");
							tabla.addCell("USSERNAME");
							tabla.addCell("TIPO");
							
							
							try {
							
								Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
								PreparedStatement ps=cn.prepareStatement("SELECT id_u, nombre, ap, ussername, tipo FROM usuario");
								ResultSet rs=ps.executeQuery();
								
								if(rs.next()) {
									
								do {
									tabla.addCell(rs.getString(1));
									tabla.addCell(rs.getString(2));
									tabla.addCell(rs.getString(3));
									tabla.addCell(rs.getString(4));
									tabla.addCell(rs.getString(5));
								}while(rs.next());
									
								documento.add(tabla);
									
								}
							}catch(DocumentException | SQLException e1) {
								
							}
							
						}catch(DocumentException | HeadlessException | FileNotFoundException e3) {
						
							e3.printStackTrace();
							
						}
						documento.close();
						JOptionPane.showMessageDialog(null, "Reporte de Usuarios Generado");
						
						
						
					}
				});
				btnusu.setForeground(Color.WHITE);
				btnusu.setFont(new Font("Dialog", Font.BOLD, 12));
				btnusu.setBackground(new Color(121, 134, 196));
				btnusu.setBounds(838, 416, 103, 61);
				PS.add(btnusu);
	
				
				
				
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(300, 180, 528, 404);
				PS.add(scrollPane);
				
				table_1 = new JTable();
				table_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						PreparedStatement ps=null;
						ResultSet rs=null;
						try{
							Conexion c=new Conexion();
							Connection cn=c.conectar();
							
							int fila=table_1.getSelectedRow();
							String codigo=table_1.getValueAt(fila, 0).toString();
							ps=cn.prepareStatement("SELECT id_u, nombre, ap, ussername, tipo FROM usuario WHERE id_u=?");
							ps.setString(1, codigo);
							rs=ps.executeQuery();
							while(rs.next()) {
								txtid.setText(rs.getString("id_u"));
								txtn.setText(rs.getString("nombre"));
								txtap.setText(rs.getString("ap"));
								txtu.setText(rs.getString("ussername"));
							cmbt.setToolTipText(rs.getString("tipo"));
								//txtc2.setText(rs.getString("password"));
								
							}
							
						}catch(Exception e2) {
							System.out.println(e2.toString());
						}
						
						
						
					}
				});
				table_1.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"id", "Nombre", "Apellido", "Ussername", "Tipo"
					}
				));
				scrollPane.setViewportView(table_1);
				try {
					PreparedStatement ps=null;
					ResultSet rs=null;
						Conexion cx=new Conexion();
						Connection cn=cx.conectar();
						
						DefaultTableModel modelo=new DefaultTableModel();
						table_1.setModel(modelo);
			
					
						String sql="SELECT id_u, nombre, ap, ussername,tipo FROM usuario";
					ps=cn.prepareStatement(sql);
					rs=ps.executeQuery();
					ResultSetMetaData rsm=(ResultSetMetaData) rs.getMetaData();
					int cantidadColumnas=rsm.getColumnCount();
					modelo.addColumn("id");
					modelo.addColumn("Nombre");
					modelo.addColumn("Apellido");
					modelo.addColumn("Ussername");
					//modelo.addColumn("Password");
					modelo.addColumn("Tipo");
					
					
					while(rs.next()) {
						Object [] fila=new Object[cantidadColumnas];
						for(int i=0;i<cantidadColumnas;i++) {
							fila [i]=rs.getObject(i+1);
						}
									modelo.addRow(fila);
						
						
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		

		
}

	protected Connection conectar() {
		// TODO Auto-generated method stub
		return null;
	}	
}