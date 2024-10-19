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



public class Inversion extends JFrame {

	private JPanel PS;
	private JFrame PL;
	private JPanel az;
	int ancho, alto;
	private JTable table;
	private JTable tablag;
	private JButton btnh;
	private JButton btnd;
	private JButton btnm;
private JButton btna;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Inversion frame = new Inversion();
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
	public Inversion() {
		setTitle("INVERSIÓN");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inversion.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 856, 653);
		setLocationRelativeTo(null);
	
		
		PS = new JPanel();
		PS.setBackground(new Color(230, 210, 255));
		PS.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PS);
	    PS.setLayout(null);
		
	    az = new JPanel();
	    az.setBounds(0, 0, 840, 93);
	    az.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		az.setBackground(new Color(215, 224, 255));
		PS.add(az);
		az.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(703, 11, 88, 77);
		az.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel lblconsultaTuInversin = new JLabel("¡Consulta tu inversión al día, mes y año con ayuda de BluCorp!");
		lblconsultaTuInversin.setHorizontalAlignment(SwingConstants.CENTER);
		lblconsultaTuInversin.setForeground(new Color(0, 114, 168));
		lblconsultaTuInversin.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblconsultaTuInversin.setBounds(87, 21, 591, 19);
		az.add(lblconsultaTuInversin);
		
		JLabel lblPapeleraKirikoshop = new JLabel("Papelería KIRIKOSHOP");
		lblPapeleraKirikoshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblPapeleraKirikoshop.setForeground(new Color(128, 0, 128));
		lblPapeleraKirikoshop.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblPapeleraKirikoshop.setBounds(87, 55, 591, 19);
		az.add(lblPapeleraKirikoshop);
		
		JLabel kiriko = new JLabel("");
		kiriko.setBounds(10, 104, 63, 61);
		PS.add(kiriko);
		ancho=kiriko.getWidth();
		alto=kiriko.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setBounds(253, 581, 305, 31);
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.PLAIN, 11));
		PS.add(creditos);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(116, 199, 689, 366);
				PS.add(scrollPane);
				
				tablag = new JTable();
				tablag.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				tablag.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"ID", "NOMBRE PRODUCTO", "DÍA", "TOTAL"
					}
				));
				scrollPane.setViewportView(tablag);
				
				try {
					DefaultTableModel modelo=new DefaultTableModel();
					tablag.setModel(modelo);
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT id_p, nombrep, sum(cant), sum(totalc), time(fecha_hrc) from producto join detalle_compras using(id_p) join compras using(folio_c) WHERE day(fecha_hrc)=day(NOW()) AND month(fecha_hrc)=month(NOW()) AND YEAR(fecha_hrc)=YEAR(NOW()) group by id_p";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
					
					ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
					int cantcol=rmds.getColumnCount();
					modelo.addColumn("ID");
					modelo.addColumn("NOMBRE PRODUCTO");
					modelo.addColumn("CANTIDAD");
					modelo.addColumn("TOTAL");
					modelo.addColumn("HORA");
					
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
				
				
						JButton btnMes = new JButton("Inversión por mes");
						btnMes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								btnh.setVisible(false);
								btnd.setVisible(false);
								btna.setVisible(false);
								btnm.setVisible(true);
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablag.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT id_p, nombrep, sum(cant)cant, sum(totalc)totalc, monthname(fecha_hrc)mes from producto join detalle_compras using(id_p) join compras using(folio_c) group by id_p order by mes";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
									
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("ID");
									modelo.addColumn("NOMBRE PRODUCTO");
									modelo.addColumn("CANTIDAD");
									modelo.addColumn("TOTAL");
									modelo.addColumn("MES");
									
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
						btnMes.setForeground(Color.WHITE);
						btnMes.setFont(new Font("Dialog", Font.BOLD, 12));
						btnMes.setBackground(new Color(121, 134, 196));
						btnMes.setBounds(359, 127, 164, 23);
						PS.add(btnMes);
						
						JButton btnAo = new JButton("Inversión por año");
						btnAo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								btnh.setVisible(false);
								btnd.setVisible(false);
								btnm.setVisible(false);
								btna.setVisible(true);
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablag.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT sum(totalc)totalc, year(fecha_hrc) año from producto join detalle_compras using(id_p) join compras using(folio_c) where year(fecha_hrc) group by año";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
									
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("TOTAL DE INVERSIÓN EN PRODUCTOS");
									modelo.addColumn("AÑO");
									
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
						btnAo.setForeground(Color.WHITE);
						btnAo.setFont(new Font("Dialog", Font.BOLD, 12));
						btnAo.setBackground(new Color(121, 134, 196));
						btnAo.setBounds(549, 127, 149, 23);
						PS.add(btnAo);
						
						JButton btnDa = new JButton("Inversión por día");
						btnDa.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								btnh.setVisible(false);
								btnm.setVisible(false);
								btna.setVisible(false);
								btnd.setVisible(true);
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablag.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT id_p, nombrep, sum(cant)cant, sum(totalc)totalc, dayname(fecha_hrc) dia from producto join detalle_compras using(id_p) join compras using(folio_c) group by id_p order by dia";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
									
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("ID");
									modelo.addColumn("NOMBRE PRODUCTO");
									modelo.addColumn("CANTIDAD");
									modelo.addColumn("TOTAL");
									modelo.addColumn("DÍA");
									
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
						btnDa.setForeground(Color.WHITE);
						btnDa.setFont(new Font("Dialog", Font.BOLD, 12));
						btnDa.setBackground(new Color(121, 134, 196));
						btnDa.setBounds(189, 127, 149, 23);
						PS.add(btnDa);
						
						JButton btnHoy = new JButton("Hoy");
						btnHoy.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								btnd.setVisible(false);
								btnm.setVisible(false);
								btna.setVisible(false);
								btnh.setVisible(true);
								
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablag.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT id_p, nombrep, sum(cant), sum(totalc), time(fecha_hrc) from producto join detalle_compras using(id_p) join compras using(folio_c) WHERE day(fecha_hrc)=day(NOW()) AND month(fecha_hrc)=month(NOW()) AND YEAR(fecha_hrc)=YEAR(NOW()) group by id_p";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
									
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("ID");
									modelo.addColumn("NOMBRE PRODUCTO");
									modelo.addColumn("CANTIDAD");
									modelo.addColumn("TOTAL");
									modelo.addColumn("HORA");
									
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
						btnHoy.setForeground(Color.WHITE);
						btnHoy.setFont(new Font("Dialog", Font.BOLD, 12));
						btnHoy.setBackground(new Color(121, 134, 196));
						btnHoy.setBounds(92, 127, 75, 23);
						PS.add(btnHoy);
						
						JButton btnRegresar = new JButton("Regresar");
						btnRegresar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								MenuD m=new MenuD();
								m.setVisible(true);
								dispose();
							}
						});
						btnRegresar.setForeground(Color.WHITE);
						btnRegresar.setFont(new Font("Dialog", Font.BOLD, 12));
						btnRegresar.setBackground(new Color(121, 134, 196));
						btnRegresar.setBounds(719, 127, 111, 23);
						PS.add(btnRegresar);
			
						
						
						
						
						
						
						
						
						btnh = new JButton("");
						btnh.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
						btnh.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e){
								Document documento=new Document();
								try {
									String ruta =System.getProperty("user.home");
									PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Inversión de Hoy.pdf"));                                                                  
									documento.open();
									PdfPTable tabla=new PdfPTable(5);
									tabla.addCell("ID");
									tabla.addCell("NOMBRE PRODUCTO");
									tabla.addCell("CANTIDAD");
									tabla.addCell("TOTAL");
									tabla.addCell("HORA");
									
									
									try {
									
										Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
										PreparedStatement ps=cn.prepareStatement("SELECT id_p, nombrep, sum(cant), sum(totalc), time(fecha_hrc) from producto join detalle_compras using(id_p) join compras using(folio_c) WHERE day(fecha_hrc)=day(NOW()) AND month(fecha_hrc)=month(NOW()) AND YEAR(fecha_hrc)=YEAR(NOW()) group by id_p");
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
								JOptionPane.showMessageDialog(null, "Reporte de Inversión de Hoy Generado");
								
								
								
							}
						});
						btnh.setForeground(Color.WHITE);
						btnh.setFont(new Font("Dialog", Font.BOLD, 12));
						btnh.setBackground(new Color(121, 134, 196));
						btnh.setBounds(10, 225, 96, 58);
					PS.add(btnh);
					
					
					
					
					btnd = new JButton("");
					btnd.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
					btnd.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							Document documento=new Document();
							try {
								String ruta =System.getProperty("user.home");
								PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Inversión por Día.pdf"));                                                                  
								documento.open();
								PdfPTable tabla=new PdfPTable(5);
								tabla.addCell("ID");
								tabla.addCell("NOMBRE PRODUCTO");
								tabla.addCell("CANTIDAD");
								tabla.addCell("TOTAL");
								tabla.addCell("DÍA");
								
								
								try {
								
									Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
									PreparedStatement ps=cn.prepareStatement("SELECT id_p, nombrep, sum(cant)cant, sum(totalc)totalc, dayname(fecha_hrc) dia from producto join detalle_compras using(id_p) join compras using(folio_c) group by id_p order by dia");
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
							JOptionPane.showMessageDialog(null, "Reporte de Inversión por Día Generado");
							
							
							
						}
					});
					btnd.setForeground(Color.WHITE);
					btnd.setFont(new Font("Dialog", Font.BOLD, 12));
					btnd.setBackground(new Color(121, 134, 196));
					btnd.setBounds(10, 297, 96, 58);
				PS.add(btnd);
				btnd.setVisible(false);
				
					
				btnm = new JButton("");
				btnm.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
				btnm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						Document documento=new Document();
						try {
							String ruta =System.getProperty("user.home");
							PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Inversión Mensual.pdf"));                                                                  
							documento.open();
							PdfPTable tabla=new PdfPTable(5);
							tabla.addCell("ID");
							tabla.addCell("NOMBRE PRODUCTO");
							tabla.addCell("CANTIDAD");
							tabla.addCell("TOTAL");
							tabla.addCell("MES");
							
							
							try {
							
								Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
								PreparedStatement ps=cn.prepareStatement("SELECT id_p, nombrep, sum(cant)cant, sum(totalc)totalc, monthname(fecha_hrc)mes from producto join detalle_compras using(id_p) join compras using(folio_c) group by id_p order by mes");
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
						JOptionPane.showMessageDialog(null, "Reporte de Inversión Mensual Generado");
						
						
						
					}
				});
				btnm.setForeground(Color.WHITE);
				btnm.setFont(new Font("Dialog", Font.BOLD, 12));
				btnm.setBackground(new Color(121, 134, 196));
				btnm.setBounds(10, 366, 96, 58);
			PS.add(btnm);
			btnm.setVisible(false);
			
			
			
			
			btna = new JButton("");
			btna.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
			btna.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Document documento=new Document();
					try {
						String ruta =System.getProperty("user.home");
						PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ganancias Anuales.pdf"));                                                                  
						documento.open();
						PdfPTable tabla=new PdfPTable(2);
						tabla.addCell("TOTAL DE INVERSIÓN EN PRODUCTOS");
						tabla.addCell("AÑO");
						
						try {
						
							Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
							PreparedStatement ps=cn.prepareStatement("SELECT sum(total)total, year(fecha_hr) año from producto join detalle_ventas using(id_p) join ventas using(folio_v) where year(fecha_hr)=? group by año");
							ResultSet rs=ps.executeQuery();
							
							if(rs.next()) {
								
							do {
								tabla.addCell(rs.getString(1));
								tabla.addCell(rs.getString(2));
							
								
							}while(rs.next());
								
							documento.add(tabla);
								
							}
						}catch(DocumentException | SQLException e1) {
							
						}
						
					}catch(DocumentException | HeadlessException | FileNotFoundException e3) {
					
						e3.printStackTrace();
						
					}
					documento.close();
					JOptionPane.showMessageDialog(null, "Reporte de Ganancias Anuales Generado");
					
					
						
				}
			});
			btna.setForeground(Color.WHITE);
			btna.setFont(new Font("Dialog", Font.BOLD, 12));
			btna.setBackground(new Color(121, 134, 196));
			btna.setBounds(10, 442, 81, 61);
			PS.add(btna);
		btna.setVisible(false);
			
					
				
					
	}
				
	protected PdfPTable PdfPTable(int i) {
		return null;
	}

	protected Connection conectar() {
		// TODO Auto-generated method stub
		return null;
	}	
}