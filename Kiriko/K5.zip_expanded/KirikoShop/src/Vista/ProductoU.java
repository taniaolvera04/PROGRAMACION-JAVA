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

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import Controlador.KirikoLRS;
import Modelo.Conexion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ProductoU extends JFrame {

	private JPanel contentPane;
	private JTable tablaproducto;
	private JTextField txt;
	private JLabel logo;
	private JLabel kiriko;
	private JLabel lblNewLabel;
	int ancho, alto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductoU frame = new ProductoU();
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
	public ProductoU() {
		setTitle("PRODUCTO");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Producto.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 688);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 210, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		scrollPane.setBounds(35, 145, 649, 429);
		contentPane.add(scrollPane);
		
		tablaproducto = new JTable();
		tablaproducto.setBackground(new Color(255, 221, 255));
		tablaproducto.setForeground(new Color(128, 0, 128));
		tablaproducto.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		tablaproducto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(tablaproducto);
		
		try {
			DefaultTableModel modelo=new DefaultTableModel();
			tablaproducto.setModel(modelo);
			
			PreparedStatement ps=null;
			ResultSet rs=null;
			
			Conexion cn=new Conexion();
			Connection conectar=cn.conectar();
			
			String sql="SELECT id_p, nombrep, precioc, preciov, cap, stock FROM producto";
			ps=conectar.prepareStatement(sql);
			rs=ps.executeQuery();
			
			
			ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
			int cantcol=rmds.getColumnCount();
			modelo.addColumn("ID");
			modelo.addColumn("NOMBRE");
			modelo.addColumn("PRECIO COMPRA");
			modelo.addColumn("PRECIO VENTA");
			modelo.addColumn("CAPACIDAD");
			modelo.addColumn("STOCK");
			
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
		
		
		
		
		txt = new JTextField();
		txt.setBounds(21, 101, 286, 21);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JButton btn5 = new JButton("Buscar");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=txt.getText();
				try {
					DefaultTableModel modelo=new DefaultTableModel();
					tablaproducto.setModel(modelo);
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT id_p, nombrep, precioc, preciov, cap, stock FROM producto WHERE nombrep like '%"+a+"%'";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
				
					ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
					int cantcol=rmds.getColumnCount();
					modelo.addColumn("ID");
					modelo.addColumn("NOMBRE");
					modelo.addColumn("PRECIO COMPRA");
					modelo.addColumn("PRECIO VENTA");
					modelo.addColumn("CAPACIDAD");
					modelo.addColumn("STOCK");
					
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
		btn5.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5.setBackground(new Color(121, 134, 196));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBounds(317, 99, 87, 23);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("Mostrar");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel modelo=new DefaultTableModel();
					tablaproducto.setModel(modelo);
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT id_p, nombrep, precioc, preciov, cap, stock FROM producto";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
					
					ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
					int cantcol=rmds.getColumnCount();
					modelo.addColumn("ID");
					modelo.addColumn("NOMBRE");
					modelo.addColumn("PRECIO COMPRA");
					modelo.addColumn("PRECIO VENTA");
					modelo.addColumn("CAPACIDAD");
					modelo.addColumn("STOCK");
					
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
		btn4.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4.setBackground(new Color(121, 134, 196));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBounds(512, 99, 87, 23);
		contentPane.add(btn4);
		
		JButton btnLimpiar = new JButton("Borrar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimpiar.setBackground(new Color(121, 134, 196));
		btnLimpiar.setBounds(414, 99, 81, 23);
		contentPane.add(btnLimpiar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(215, 224, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		panel.setBounds(0, 0, 706, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("¡Consulta los productos disponibles en BluCorp!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 114, 168));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 11, 591, 19);
		panel.add(lblNewLabel);

		logo = new JLabel("");
		logo.setBounds(638, 11, 58, 53);
		panel.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel lblPapeleraKirikoshop = new JLabel("Papelería KIRIKOSHOP");
		lblPapeleraKirikoshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblPapeleraKirikoshop.setForeground(new Color(128, 0, 128));
		lblPapeleraKirikoshop.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblPapeleraKirikoshop.setBounds(30, 41, 591, 19);
		panel.add(lblPapeleraKirikoshop);
		
		
				kiriko = new JLabel("");
				kiriko.setBounds(10, 11, 60, 60);
				panel.add(kiriko);
				ancho=kiriko.getWidth();
				alto=kiriko.getHeight();
				Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
				kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

				
				JButton btnSalir = new JButton("Regresar");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					Menu m=new Menu();
					m.setVisible(true);
					dispose();
					}
				});
				btnSalir.setForeground(Color.WHITE);
				btnSalir.setFont(new Font("Dialog", Font.BOLD, 12));
				btnSalir.setBackground(new Color(121, 134, 196));
				btnSalir.setBounds(609, 99, 87, 23);
				contentPane.add(btnSalir);
		
				JButton btnprod = new JButton("");
				btnprod.setIcon(new ImageIcon(Compras.class.getResource("/img/icons8-imprimir-40.png")));
				btnprod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						Document documento=new Document();
						try {
							String ruta =System.getProperty("user.home");
							PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Productos.pdf"));                                                                  
							documento.open();
							PdfPTable tabla=new PdfPTable(6);
							tabla.addCell("ID");
							tabla.addCell("NOMBRE");
							tabla.addCell("PRECIO COMPRA");
							tabla.addCell("PRECIO VENTA");
							tabla.addCell("CAPACIDAD");
							tabla.addCell("STOCK");
							
							
							try {
							
								Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
								PreparedStatement ps=cn.prepareStatement("SELECT * FROM producto");
								ResultSet rs=ps.executeQuery();
								
								if(rs.next()) {
									
								do {
									tabla.addCell(rs.getString(1));
									tabla.addCell(rs.getString(2));
									tabla.addCell(rs.getString(3));
									tabla.addCell(rs.getString(4));
									tabla.addCell(rs.getString(5));
									tabla.addCell(rs.getString(6));
									
								}while(rs.next());
									
								documento.add(tabla);
									
								}
							}catch(DocumentException | SQLException e1) {
								
							}
							
						}catch(DocumentException | HeadlessException | FileNotFoundException e3) {
						
							e3.printStackTrace();
							
						}
						documento.close();
						JOptionPane.showMessageDialog(null, "Reporte de Productos Generado");
						
						
						
					}
				});
				btnprod.setForeground(Color.WHITE);
				btnprod.setFont(new Font("Dialog", Font.BOLD, 12));
				btnprod.setBackground(new Color(121, 134, 196));
				btnprod.setBounds(309, 585, 95, 58);
				contentPane.add(btnprod);
	
				
				
				
		
		
	}
	public void limpiar() {
		txt.setText("");
		
	}
}