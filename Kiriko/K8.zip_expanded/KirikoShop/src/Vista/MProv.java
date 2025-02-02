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

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
//LIBRERÍAS DE JASPER

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class MProv extends JFrame {

	private JPanel PS;
	private JFrame PL;
	private JPanel az;
	private JTextField txttel;
	int ancho, alto;
	private JTextField txtn;
	private JTextField txtid;
	private JTable table;
	private JTable tablaprov;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				MProv frame = new MProv();
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
	public MProv() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rebec\\OneDrive\\Pictures\\IMG-20230826-WA0022.jpg"));
		setTitle("ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 964, 758);
		setLocationRelativeTo(null);
	
		
		PS = new JPanel();
		PS.setBackground(new Color(243, 194, 203));
		PS.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PS);
	    PS.setLayout(null);
		
	    az = new JPanel();
	    az.setBounds(0, 0, 950, 108);
	    az.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		az.setBackground(new Color(235, 194, 243));
		PS.add(az);
		az.setLayout(null);
		
		JLabel lblid = new JLabel("ID");
		lblid.setBounds(52, 344, 31, 21);
		lblid.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblid);
		lblid.setVisible(false);
		
		txtid = new JTextField();
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setEditable(false);
		txtid.setBounds(42, 375, 70, 31);
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
		
		JLabel lblcreaUnaCuenta = new JLabel("¡¡¡Bienvenido al apartado de Proveedores!!!");
		lblcreaUnaCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblcreaUnaCuenta.setForeground(new Color(105, 1, 167));
		lblcreaUnaCuenta.setFont(new Font("Dialog", Font.BOLD, 20));
		lblcreaUnaCuenta.setBounds(23, 10, 474, 42);
		az.add(lblcreaUnaCuenta);
		
		JLabel lblBlucorpEstDiseado = new JLabel("BluCorp está diseñado para ayudarle.");
		lblBlucorpEstDiseado.setHorizontalAlignment(SwingConstants.LEFT);
		lblBlucorpEstDiseado.setForeground(new Color(171, 0, 221));
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
		
		JLabel lblu = new JLabel("Ingresa el telèfono del proveedor");
		lblu.setBounds(42, 269, 212, 21);
		lblu.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblu);
		
		txttel = new JTextField();
		txttel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txttel.getText().length()==10) {
					e.consume();
				}
			}
		});
		txttel.setBounds(42, 303, 267, 31);
		txttel.setFont(new Font("Dialog", Font.PLAIN, 12));
		txttel.setColumns(10);
		PS.add(txttel);
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setBounds(331, 680, 305, 31);
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.BOLD, 9));
		PS.add(creditos);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(40, 643, 126, 31);
		btnRegistrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS kp=new KirikoLRS();
				String nombre=txtn.getText();
				String tel=txttel.getText();
				kp.setNombreprov(nombre);
			kp.setTel(tel);
			
					 if(kp.insertarprov()) {
				 
					JOptionPane.showMessageDialog(null, "Proveedor registrado\n"
							+ "Proveedor: " + kp.getNombreprov() + "\n"
							+ "Telèfono " + kp.getTel() + "\n");

				 
				}else {
					JOptionPane.showMessageDialog(null, "ERROR");
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
				KirikoLRS kp=new KirikoLRS();
				String nombre=txtn.getText();
				String tel=txttel.getText();
				kp.setNombreprov(txtn.getText());
				kp.setTel(txttel.getText());
				PreparedStatement ps=null;
				DefaultTableModel modelo=new DefaultTableModel();
				try {
					Conexion c=new Conexion();
					Connection cn =c.conectar();
					ps=cn.prepareStatement("UPDATE proveedores SET nombre_prov=?, tel=? WHERE id_prov=?");
					ps.setString(3, txtid.getText());
					ps.setString(1, txtn.getText());
					ps.setString(2, txttel.getText());
					ps.executeUpdate();
					 
					JOptionPane.showMessageDialog(null, "Proveedor Actualizado\n"
							+ "Proveedor: " +kp.getNombreprov() + "\n"
							+ "Teléfono: " + kp.getTel() + "\n");
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
				txttel.setText("");
			txtid.setText("");	
			
			}
		});
		btnBorrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(121, 134, 196));
		btnBorrar.setBorder(null);
		PS.add(btnBorrar);
		
		JLabel lblIngresaTuNombre = new JLabel("Ingresa el nombre del proveedor");
		lblIngresaTuNombre.setBounds(42, 197, 185, 21);
		lblIngresaTuNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		PS.add(lblIngresaTuNombre);
		
		txtn = new JTextField();
		txtn.setBounds(42, 228, 267, 31);
		txtn.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtn.setColumns(10);
		PS.add(txtn);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(347, 643, 126, 31);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps=null;
				DefaultTableModel modelo=new DefaultTableModel();
				try {
					Conexion c=new Conexion();
					Connection cn=c.conectar();
					int fila=tablaprov.getSelectedRow();
					String id=tablaprov.getValueAt(fila, 0).toString();
					ps=cn.prepareStatement("DELETE FROM proveedores WHERE id_prov=?");
					ps.setString(1, id);
					ps.execute();
					JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
					txtid.setText("");
					txtn.setText("");
					txttel.setText("");
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
						tablaprov.setModel(modelo);
					
						String sql="SELECT id_prov, nombre_prov, tel FROM proveedores";
					ps=cn.prepareStatement(sql);
					rs=ps.executeQuery();
					ResultSetMetaData rsm=(ResultSetMetaData) rs.getMetaData();
					int cantidadColumnas=rsm.getColumnCount();
					modelo.addColumn("ID");
					modelo.addColumn("Nombre");
					modelo.addColumn("Teléfono");
					
					
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
		
				JButton btnCerrarSesion = new JButton("Regresar");
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
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(357, 197, 528, 404);
				PS.add(scrollPane);
				
				tablaprov = new JTable();
				tablaprov.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						PreparedStatement ps=null;
						ResultSet rs=null;
						try{
							Conexion c=new Conexion();
							Connection cn=c.conectar();
							
							int fila=tablaprov.getSelectedRow();
							String codigo=tablaprov.getValueAt(fila, 0).toString();
							
							
							
							ps=cn.prepareStatement("SELECT id_prov, nombre_prov, tel FROM proveedores WHERE id_prov=?");
							ps.setString(1, codigo);
							rs=ps.executeQuery();
							while(rs.next()) {
								txtid.setVisible(true);
								lblid.setVisible(true);
								
								txtid.setText(rs.getString("id_prov"));
								txtn.setText(rs.getString("nombre_prov"));
							txttel.setText(rs.getString("tel"));
							}
							
						}catch(Exception e2) {
							System.out.println(e2.toString());
						}
						
						
						
					}
				});
				tablaprov.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"ID", "Nombre", "Teléfono"
					}
				));
				scrollPane.setViewportView(tablaprov);
				try {
					PreparedStatement ps=null;
					ResultSet rs=null;
						Conexion cx=new Conexion();
						Connection cn=cx.conectar();
						
						DefaultTableModel modelo=new DefaultTableModel();
						tablaprov.setModel(modelo);
						
						txt = new JTextField();
						txt.setColumns(10);
						txt.setBounds(447, 141, 279, 31);
						PS.add(txt);
						
						JButton btn5 = new JButton("Buscar");
						btn5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								String a=txt.getText();
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablaprov.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT id_prov, nombre_prov, tel FROM proveedores WHERE nombre_prov like '%"+a+"%'";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
								
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("ID");
									modelo.addColumn("Nombre");
									modelo.addColumn("Teléfono");
									
									while(rs.next()) {
										Object[]filas=new Object[cantcol];
										for(int i=0;i<cantcol;i++) {
											filas[i]=rs.getObject(i+1);
										}
										modelo.addRow(filas);
									}
									
								}catch(SQLException ex) {
									System.err.println(ex.getMessage());
									
								}
							}
						});
						btn5.setForeground(Color.WHITE);
						btn5.setFont(new Font("Dialog", Font.BOLD, 12));
						btn5.setBackground(new Color(121, 134, 196));
						btn5.setBounds(771, 142, 114, 27);
						PS.add(btn5);
						
						JButton btnreporte = new JButton("");
						btnreporte.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e){
								Document documento=new Document();
								try {
									String ruta =System.getProperty("user.home");
									PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Reporte.pdf"));                                                                  
									documento.open();
									PdfPTable tabla=new PdfPTable(3);
									tabla.addCell("ID");
									tabla.addCell("NOMBRE DE PROVEEDOR");
									tabla.addCell("TELÉFONO DE PROVEEDOR");
									
									try {
									
										Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
										PreparedStatement ps=cn.prepareStatement("SELECT * FROM proveedores");
										ResultSet rs=ps.executeQuery();
										
										if(rs.next()) {
											
										do {
											tabla.addCell(rs.getString(1));
											tabla.addCell(rs.getString(2));
											tabla.addCell(rs.getString(3));
										}while(rs.next());
											
										documento.add(tabla);
											
										}
									}catch(DocumentException | SQLException e1) {
										
									}
									
								}catch(DocumentException | HeadlessException | FileNotFoundException e3) {
								
									e3.printStackTrace();
									
								}
								documento.close();
								JOptionPane.showMessageDialog(null, "Reporte Generado");
								
								
								
							}
						});
						btnreporte.setForeground(Color.WHITE);
						btnreporte.setFont(new Font("Dialog", Font.BOLD, 12));
						btnreporte.setBackground(new Color(121, 134, 196));
						btnreporte.setBounds(42, 448, 103, 61);
						PS.add(btnreporte);
			
						
						
						
						
						
					
						String sql="SELECT id_prov, nombre_prov, tel FROM proveedores";
					ps=cn.prepareStatement(sql);
					rs=ps.executeQuery();
					ResultSetMetaData rsm=(ResultSetMetaData) rs.getMetaData();
					int cantidadColumnas=rsm.getColumnCount();
					modelo.addColumn("ID");
					modelo.addColumn("Nombre");
					modelo.addColumn("Teléfono");
					
					
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
	
	
	protected PdfPTable PdfPTable(int i) {
		return null;
		
	}

	protected Connection conectar() {
		// TODO Auto-generated method stub
		return null;
	}	
}