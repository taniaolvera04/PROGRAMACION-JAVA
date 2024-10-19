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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;



public class V extends JFrame {

	private JPanel PS;
	private JFrame PL;
	private JPanel az;
	int ancho, alto;
	private JTable table;
	private JTable tablag;
	private JSpinner spaño;
	private JLabel lblaño;
	private JButton btns;
	private JButton btnm;
	private JButton btna;
	private JButton btnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				V frame = new V();
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
	public V() {
		setTitle("GANANCIAS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(V.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 856, 632);
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
		
		JLabel lblconsultaTuInversin = new JLabel("¡Consulta las ventas con ayuda de BluCorp!");
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
		creditos.setBounds(257, 557, 305, 31);
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.PLAIN, 11));
		PS.add(creditos);
		
		
		
		
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(101, 203, 689, 355);
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
					
					String sql="SELECT id_p, nombrep, sum(cant), sum(total), time(fecha_hr) from producto join detalle_ventas using(id_p) join ventas using(folio_v) WHERE day(fecha_hr)=day(NOW()) AND month(fecha_hr)=month(NOW()) AND YEAR(fecha_hr)=YEAR(NOW()) group by id_p";
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
				
				
						JButton btnMes = new JButton("Ventas por mes");
						btnMes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								lblaño.setVisible(true);
								spaño.setVisible(true);
								btnh.setVisible(false);
								btns.setVisible(false);
								btnm.setVisible(true);
								
								int año=(int)spaño.getValue();								
							try {
							DefaultTableModel modelo=new DefaultTableModel();
							tablag.setModel(modelo);
						
							PreparedStatement ps=null;
							ResultSet rs=null;
									
							Conexion cn=new Conexion();
							Connection conectar=cn.conectar();
							String sql="SELECT monthname(fecha_hr) mes, sum(total), sum(total) from ventas where year(fecha_hr)='"+año+"' group by mes";
							ps=conectar.prepareStatement(sql);
							rs=ps.executeQuery();
								
							ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
							int cantcol=rmds.getColumnCount();
							modelo.addColumn("MES");
							modelo.addColumn("TOTAL");
									
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
						btnMes.setBounds(390, 127, 149, 23);
						PS.add(btnMes);
						
						JButton btnAo = new JButton("Ventas por año");
						btnAo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								lblaño.setVisible(true);
								spaño.setVisible(true);
								btnh.setVisible(false);
								btns.setVisible(false);
								btnm.setVisible(false);
								btna.setVisible(true);
								int año=(int)spaño.getValue();
								
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablag.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT sum(total)total, year(fecha_hr) año from producto join detalle_ventas using(id_p) join ventas using(folio_v) where year(fecha_hr)='"+año+"' group by año";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
									
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("TOTAL DE GANANCIA OBTENIDO");
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
						btnAo.setBounds(560, 127, 149, 23);
						PS.add(btnAo);
						
						JButton btnDa = new JButton("Ventas por semana");
						btnDa.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								lblaño.setVisible(true);
								spaño.setVisible(true);
								btnh.setVisible(false);
								btnm.setVisible(false);
								btna.setVisible(false);
								btns.setVisible(true);
								
								int año = (int) spaño.getValue();
								
								try {
									DefaultTableModel modelo=new DefaultTableModel();
									tablag.setModel(modelo);
									
									PreparedStatement ps=null;
									ResultSet rs=null;
									
									Conexion cn=new Conexion();
									Connection conectar=cn.conectar();
									
									String sql="SELECT id_p, nombrep, sum(cant), sum(preciov-precioc)*cant, week(fecha_hr) semana from producto join detalle_ventas using(id_p) join ventas using(folio_v) WHERE year(fecha_hr)='"+año+"'group by id_p order by semana";
									ps=conectar.prepareStatement(sql);
									rs=ps.executeQuery();
									
									
									ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
									int cantcol=rmds.getColumnCount();
									modelo.addColumn("ID");
									modelo.addColumn("NOMBRE PRODUCTO");
									modelo.addColumn("CANTIDAD");
									modelo.addColumn("TOTAL");
									modelo.addColumn("SEMANA");
									
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
						btnDa.setBounds(189, 127, 178, 23);
						PS.add(btnDa);
						
						JButton btnHoy = new JButton("Hoy");
						btnHoy.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								lblaño.setVisible(false);
								spaño.setVisible(false);
								btns.setVisible(false);
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
									
									String sql="SELECT id_p, nombrep, sum(cant), sum(total), time(fecha_hr) from producto join detalle_ventas using(id_p) join ventas using(folio_v) WHERE day(fecha_hr)=day(NOW()) AND month(fecha_hr)=month(NOW()) AND YEAR(fecha_hr)=YEAR(NOW()) group by id_p";
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
								Menu m=new Menu();
								m.setVisible(true);
								dispose();
							}
						});
						btnRegresar.setForeground(Color.WHITE);
						btnRegresar.setFont(new Font("Dialog", Font.BOLD, 12));
						btnRegresar.setBackground(new Color(121, 134, 196));
						btnRegresar.setBounds(719, 127, 111, 23);
						PS.add(btnRegresar);
						
						spaño = new JSpinner();
						spaño.setFont(new Font("Segoe UI", Font.PLAIN, 12));
						spaño.setModel(new SpinnerNumberModel(2023, 2023, 2050, 1));
						spaño.setBounds(402, 172, 55, 20);
						PS.add(spaño);
						
						lblaño = new JLabel("Año");
						lblaño.setHorizontalAlignment(SwingConstants.CENTER);
						lblaño.setForeground(new Color(128, 0, 128));
						lblaño.setFont(new Font("Montserrat", Font.BOLD, 14));
						lblaño.setBounds(317, 172, 75, 19);
						PS.add(lblaño);
						
			
						lblaño.setVisible(false);
						spaño.setVisible(false);
						
						btnh = new JButton("");
						btnh.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
						btnh.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e){
								Document documento=new Document();
								try {
									String ruta =System.getProperty("user.home");
									PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ganancias de Hoy.pdf"));                                                                  
									documento.open();
									PdfPTable tabla=new PdfPTable(5);
									tabla.addCell("ID");
									tabla.addCell("NOMBRE PRODUCTO");
									tabla.addCell("CANTIDAD");
									tabla.addCell("TOTAL");
									tabla.addCell("HORA");
									
									
									try {
									
										Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
										PreparedStatement ps=cn.prepareStatement("SELECT id_p, nombrep, sum(cant), sum(total), time(fecha_hr) from producto join detalle_ventas using(id_p) join ventas using(folio_v) WHERE day(fecha_hr)=day(NOW()) AND month(fecha_hr)=month(NOW()) AND YEAR(fecha_hr)=YEAR(NOW()) group by id_p");
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
								JOptionPane.showMessageDialog(null, "Reporte de Ganancias de Hoy Generado");
								
								
								
							}
						});
						btnh.setForeground(Color.WHITE);
						btnh.setFont(new Font("Dialog", Font.BOLD, 12));
						btnh.setBackground(new Color(121, 134, 196));
						btnh.setBounds(10, 225, 81, 58);
					PS.add(btnh);
					
					btns = new JButton("");
					btns.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
					btns.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Document documento=new Document();
							try {
								String ruta =System.getProperty("user.home");
								PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ganancias Semanales.pdf"));                                                                  
								documento.open();
								PdfPTable tabla=new PdfPTable(5);
								tabla.addCell("ID");
								tabla.addCell("NOMBRE PRODUCTO");
								tabla.addCell("CANTIDAD");
								tabla.addCell("TOTAL");
								tabla.addCell("SEMANA");
								
								
								
								try {
								
									Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
									PreparedStatement ps=cn.prepareStatement("SELECT id_p, nombrep, sum(cant), sum(preciov-precioc)*cant, week(fecha_hr) semana from producto join detalle_ventas using(id_p) join ventas using(folio_v) WHERE year(fecha_hr)='\"+año+\"'group by id_p order by semana");
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
							JOptionPane.showMessageDialog(null, "Reporte de Ganancias Semanales Generado");
							
							
								
						}
					});
					btns.setForeground(Color.WHITE);
					btns.setFont(new Font("Dialog", Font.BOLD, 12));
					btns.setBackground(new Color(121, 134, 196));
					btns.setBounds(10, 297, 81, 58);
					PS.add(btns);
			btns.setVisible(false);
						
					
			btnm = new JButton("");
			btnm.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
			btnm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Document documento=new Document();
					int año=(int)spaño.getValue();
					try {
						String ruta =System.getProperty("user.home");
						PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ganancias Mensuales.pdf"));                                                                  
						documento.open();
						PdfPTable tabla=new PdfPTable(2);
						tabla.addCell("MES");
						tabla.addCell("TOTAL");
						
						try {
						
							Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
							PreparedStatement ps=cn.prepareStatement("SELECT monthname(fecha_hr) mes, sum(total), sum(total) from ventas where year(fecha_hr)='"+año+"' group by mes");
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
					JOptionPane.showMessageDialog(null, "Reporte de Ganancias Mensuales Generado");
					
					
						
				}
			});
			btnm.setForeground(Color.WHITE);
			btnm.setFont(new Font("Dialog", Font.BOLD, 12));
			btnm.setBackground(new Color(121, 134, 196));
			btnm.setBounds(10, 366, 81, 60);
			PS.add(btnm);
	btnm.setVisible(false);
				
	
	
	
	btna = new JButton("");
	btna.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
	btna.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Document documento=new Document();
			int año=(int)spaño.getValue();
			try {
				String ruta =System.getProperty("user.home");
				PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ganancias Anuales.pdf"));                                                                  
				documento.open();
				PdfPTable tabla=new PdfPTable(2);
				tabla.addCell("TOTAL DE GANANCIA OBTENIDO");
				tabla.addCell("AÑO");
				
				try {
				
					Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
					PreparedStatement ps=cn.prepareStatement("SELECT sum(total)total, year(fecha_hr) año from producto join detalle_ventas using(id_p) join ventas using(folio_v) where year(fecha_hr)='"+año+"' group by año");
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