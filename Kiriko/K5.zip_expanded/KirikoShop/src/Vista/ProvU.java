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



public class ProvU extends JFrame {

	private JPanel PS;
	private JFrame PL;
	private JPanel az;
	int ancho, alto;
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
				ProvU frame = new ProvU();
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
	public ProvU() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MProv.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 795, 636);
		setLocationRelativeTo(null);
	
		
		PS = new JPanel();
		PS.setBackground(new Color(255, 206, 255));
		PS.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PS);
	    PS.setLayout(null);
		
	    az = new JPanel();
	    az.setBounds(0, 0, 778, 108);
	    az.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		az.setBackground(new Color(235, 194, 243));
		PS.add(az);
		az.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(668, 11, 78, 76);
		az.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel lblcreaUnaCuenta = new JLabel("¡¡¡Bienvenido al apartado de Proveedores!!!");
		lblcreaUnaCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblcreaUnaCuenta.setForeground(new Color(105, 1, 167));
		lblcreaUnaCuenta.setFont(new Font("Dialog", Font.BOLD, 17));
		lblcreaUnaCuenta.setBounds(156, 10, 394, 42);
		az.add(lblcreaUnaCuenta);
		
		JLabel lblBlucorpEstDiseado = new JLabel("BluCorp está diseñado para ayudarle.");
		lblBlucorpEstDiseado.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlucorpEstDiseado.setForeground(new Color(171, 0, 221));
		lblBlucorpEstDiseado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBlucorpEstDiseado.setBounds(198, 55, 313, 24);
		az.add(lblBlucorpEstDiseado);
		
		JLabel kiriko = new JLabel("");
		kiriko.setBounds(20, 10, 68, 69);
		az.add(kiriko);
		ancho=kiriko.getWidth();
		alto=kiriko.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setBounds(236, 567, 305, 31);
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.BOLD, 9));
		PS.add(creditos);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(453, 129, 88, 29);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
			
			}
		});
		btnBorrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(121, 134, 196));
		btnBorrar.setBorder(null);
		PS.add(btnBorrar);
		
		JButton btnConsultar = new JButton("Mostrar");
		btnConsultar.setBounds(551, 128, 93, 31);
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
				scrollPane.setBounds(88, 199, 578, 296);
				PS.add(scrollPane);
				
				tablaprov = new JTable();
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
						txt.setBounds(23, 130, 322, 29);
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
						btn5.setBounds(355, 129, 88, 29);
						PS.add(btn5);
						
						JButton btnprov = new JButton("");
						btnprov.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
						btnprov.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e){
								Document documento=new Document();
								try {
									String ruta =System.getProperty("user.home");
									PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Proveedores.pdf"));                                                                  
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
						btnprov.setForeground(Color.WHITE);
						btnprov.setFont(new Font("Dialog", Font.BOLD, 12));
						btnprov.setBackground(new Color(121, 134, 196));
						btnprov.setBounds(340, 506, 103, 61);
						PS.add(btnprov);
						
						JButton btnRegresar = new JButton("Regresar");
						btnRegresar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Menu m=new Menu();
								m.setVisible(true);
								dispose();
							}
						});
						btnRegresar.setForeground(Color.WHITE);
						btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 12));
						btnRegresar.setBackground(new Color(121, 134, 196));
						btnRegresar.setBounds(662, 128, 93, 31);
						PS.add(btnRegresar);
			
						
						
						
						
						
					
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