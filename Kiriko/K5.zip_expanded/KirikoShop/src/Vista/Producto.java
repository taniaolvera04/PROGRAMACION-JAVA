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

public class Producto extends JFrame {

	private JPanel contentPane;
	private JTextField txtnp;
	private JTextField txtpv;
	private JTextField txtcp;
	private JTextField txtpc;
	private JTable tablaproducto;
	private JTextField txt;
	private JTextField txtst;
	private JTextField txtid;
	private JLabel logo;
	private JLabel kiriko;
	private JLabel lblNewLabel;
	int ancho, alto;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto frame = new Producto();
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
	public Producto() {
		setTitle("PRODUCTO");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Producto.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 788);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 210, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnp = new JLabel("NOMBRE PRODUCTO");
		lblnp.setBounds(69, 100, 145, 14);
		lblnp.setHorizontalAlignment(SwingConstants.CENTER);
		lblnp.setBackground(new Color(255, 255, 255));
		lblnp.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblnp);
		
		txtnp = new JTextField();
		txtnp.setBounds(224, 97, 180, 20);
		txtnp.setForeground(new Color(128, 0, 128));
		txtnp.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtnp.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(txtnp);
		txtnp.setColumns(10);
		
		JLabel lblpc = new JLabel("PRECIO COMPRA ($)\r\n");
		lblpc.setBounds(441, 100, 137, 14);
		lblpc.setHorizontalAlignment(SwingConstants.CENTER);
		lblpc.setBackground(new Color(255, 255, 255));
		lblpc.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblpc);
		
		txtpv = new JTextField();
		txtpv.setBounds(205, 136, 91, 20);
		txtpv.setHorizontalAlignment(SwingConstants.LEFT);
		txtpv.setForeground(new Color(128, 0, 128));
		txtpv.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpv.setColumns(10);
		contentPane.add(txtpv);
		
		JLabel lblpv = new JLabel("PRECIO VENTA ($)\r\n");
		lblpv.setBounds(69, 139, 137, 14);
		lblpv.setHorizontalAlignment(SwingConstants.CENTER);
		lblpv.setBackground(new Color(255, 255, 255));
		lblpv.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblpv);
		
		JLabel lblcp = new JLabel("CAPACIDAD Ó PESO DE PRODUCTO (g/ml)");
		lblcp.setBounds(306, 139, 272, 14);
		lblcp.setHorizontalAlignment(SwingConstants.CENTER);
		lblcp.setBackground(new Color(255, 255, 255));
		lblcp.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblcp);
		
		txtcp = new JTextField();
		txtcp.setBounds(588, 136, 91, 20);
		txtcp.setHorizontalAlignment(SwingConstants.LEFT);
		txtcp.setForeground(new Color(128, 0, 128));
		txtcp.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtcp.setColumns(10);
		contentPane.add(txtcp);
		
		txtpc = new JTextField();
		txtpc.setBounds(588, 97, 91, 20);
		txtpc.setHorizontalAlignment(SwingConstants.LEFT);
		txtpc.setForeground(new Color(128, 0, 128));
		txtpc.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpc.setColumns(10);
		contentPane.add(txtpc);
		
		txtst = new JTextField();
		txtst.setHorizontalAlignment(SwingConstants.LEFT);
		txtst.setForeground(new Color(128, 0, 128));
		txtst.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtst.setColumns(10);
		txtst.setBounds(363, 177, 91, 20);
		contentPane.add(txtst);
		
		txtid = new JTextField();
		txtid.setEditable(false);
		txtid.setHorizontalAlignment(SwingConstants.LEFT);
		txtid.setForeground(new Color(128, 0, 128));
		txtid.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtid.setColumns(10);
		txtid.setBounds(172, 177, 68, 20);
		contentPane.add(txtid);
		txtid.setVisible(false);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		scrollPane.setBounds(30, 374, 649, 343);
		contentPane.add(scrollPane);
		
		tablaproducto = new JTable();
		tablaproducto.setBackground(new Color(255, 221, 255));
		tablaproducto.setForeground(new Color(128, 0, 128));
		tablaproducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PreparedStatement ps=null;
				ResultSet rs=null;
				lbl.setVisible(true);
				txtid.setVisible(true);
				try {
				Conexion cx=new Conexion();
				Connection cn=cx.conectar();
				int fila=tablaproducto.getSelectedRow();
				String idp=tablaproducto.getValueAt(fila, 0).toString();
	         	ps=cn.prepareStatement("SELECT id_p, nombrep, precioc, preciov, cap, stock FROM producto WHERE id_p=?");
				ps.setString(1, idp);
				rs=ps.executeQuery();

				
			if(rs.next()) {
				txtid.setText(rs.getString("id_p"));
					txtnp.setText(rs.getString("nombrep"));
					txtpc.setText(rs.getString("precioc"));
					txtpv.setText(rs.getString("preciov"));
					txtcp.setText(rs.getString("cap"));
					txtst.setText(rs.getString("stock"));
				}
			

				}catch(Exception e2) {
					System.out.println(e2.toString());

				}
			}
		});
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
		txt.setBounds(125, 311, 279, 21);
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
		btn5.setBounds(442, 309, 114, 23);
		contentPane.add(btn5);
		
		
		
		
		JButton btn1 = new JButton("Registrar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				String nombre=txtnp.getText();
				double precioc=Double.parseDouble(txtpc.getText());
				double preciov=Double.parseDouble(txtpv.getText());
				double capacidad=Double.parseDouble(txtcp.getText());
				int stock=Integer.parseInt(txtst.getText());
				
				k.setNombrep(nombre);
				k.setPrecioc(precioc);
				k.setPreciov(preciov);
				k.setCapacidad(capacidad);
				k.setStock(stock);
				if(nombre.isEmpty()){
					JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else {
					
				
				if(k.insertarP()) {
					JOptionPane.showMessageDialog(null, "Registro exitoso");
				}else {
					JOptionPane.showMessageDialog(null, "Error en registro");
				}
				}
				
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1.setBackground(new Color(121, 134, 196));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBounds(30, 242, 103, 23);
		contentPane.add(btn1);
		
		
		JButton btn2 = new JButton("Modificar");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				lbl.setVisible(true);
				txtid.setVisible(true);
				
				
				String nombre=txtnp.getText();
				double precioc=Double.parseDouble(txtpc.getText());
				double preciov=Double.parseDouble(txtpv.getText());
				double capacidad=Double.parseDouble(txtcp.getText());
				int stock=Integer.parseInt(txtst.getText());
				
				k.setNombrep(nombre);
				k.setPrecioc(precioc);
				k.setPreciov(preciov);
				k.setCapacidad(capacidad);
				k.setStock(stock);
				k.setIdp(Integer.parseInt(txtid.getText()));
				
				if(k.actualizarP()) {
					JOptionPane.showMessageDialog(null, "Producto Actualizado");
					
				}else {       
					JOptionPane.showMessageDialog(null, "Error al actualizar");
				}
				}
			
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2.setBackground(new Color(121, 134, 196));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBounds(157, 242, 114, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Eliminar");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps=null;
				lbl.setVisible(true);
				txtid.setVisible(true);
				try {
					Conexion cx=new Conexion();
					Connection cn=cx.conectar();
					int fila=tablaproducto.getSelectedRow();
					String idp=tablaproducto.getValueAt(fila, 0).toString();
		         	ps=cn.prepareStatement("DELETE FROM producto WHERE id_p=?");
					ps.setString(1, idp);
					ps.execute();
JOptionPane.showMessageDialog(null, "Producto Eliminado");
limpiar();
		

					}catch(Exception e2) {
						System.out.println(e2.toString());

					}
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3.setBackground(new Color(121, 134, 196));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBounds(295, 242, 109, 23);
		contentPane.add(btn3);
		
		lbl = new JLabel("ID");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBackground(new Color(255, 255, 255));
		lbl.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		lbl.setBounds(107, 180, 55, 14);
		contentPane.add(lbl);
		lbl.setVisible(false);
		
		JLabel lblst = new JLabel("STOCK");
		lblst.setHorizontalAlignment(SwingConstants.CENTER);
		lblst.setBackground(new Color(255, 255, 255));
		lblst.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		lblst.setBounds(250, 180, 114, 14);
		contentPane.add(lblst);
		
		JButton btn4 = new JButton("Mostrar todo");
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
		btn4.setBounds(429, 242, 132, 23);
		contentPane.add(btn4);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimpiar.setBackground(new Color(121, 134, 196));
		btnLimpiar.setBounds(588, 242, 91, 23);
		contentPane.add(btnLimpiar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(215, 224, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		panel.setBounds(0, 0, 706, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("¡Administra tus productos de manera más eficiente!");
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
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		
		
				kiriko = new JLabel("");
				kiriko.setBounds(10, 100, 51, 48);
				contentPane.add(kiriko);
				ancho=kiriko.getWidth();
				alto=kiriko.getHeight();
				kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				
				JButton btnSalir = new JButton("Regresar");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					MenuD m=new MenuD();
					m.setVisible(true);
					dispose();
					}
				});
				btnSalir.setForeground(Color.WHITE);
				btnSalir.setFont(new Font("Dialog", Font.BOLD, 12));
				btnSalir.setBackground(new Color(121, 134, 196));
				btnSalir.setBounds(588, 310, 91, 23);
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
				btnprod.setBounds(10, 290, 81, 58);
				contentPane.add(btnprod);
	
				
				
				
		
		
	}
	public void limpiar() {
		txtid.setVisible(false);
		lbl.setVisible(false);
		txtnp.setText("");
		txtpc.setText("");
		txtpv.setText("");
		txtcp.setText("");
		txtst.setText("");
		
	}
}