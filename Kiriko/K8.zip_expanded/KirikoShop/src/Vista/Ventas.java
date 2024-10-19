package Vista;

import java.awt.EventQueue;
import Controlador.KirikoLRS;
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
import com.itextpdf.text.log.SysoCounter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
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


import Modelo.Conexion;

public class Ventas extends JFrame {

	private JPanel panel;
	private JTextField txtid;
	private JTextField txtst;
	private JTextField txtct;
	private JTextField txtnp;
	private JTextField txt;
	private JLabel lblNewLabel;
	int ancho, alto;
	private JTextField txtiva;
	private JTextField txtsub;
	private JTextField txttotal;
	private JTable tablav;
	private JLabel logo;
	private JLabel kiriko;
	private JTextField txtpv;
	
	double precio, subtotal, iva;
	int cantidad;
	
	
	private DefaultTableModel modelo;
	private Object[]datos=new Object[5];
	private JTextField txttot;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
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
	public Ventas() {
		setTitle("PRODUCTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 753);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setBackground(new Color(230, 210, 255));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("ID");
		lbl.setBounds(125, 100, 70, 14);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBackground(new Color(255, 255, 255));
		lbl.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		panel.add(lbl);
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		Image foto2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));

		
		
		
		txtid = new JTextField();
		txtid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(txtid.getText());	
				try {
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT * FROM producto WHERE id_p='"+id+"'";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
					System.out.println(sql);
					KirikoLRS k=new KirikoLRS();
					if(rs.next()) {
						
						k.setIdp(rs.getInt("id_p"));
						k.setNombrep(rs.getString("nombrep"));
						k.setPreciov(rs.getDouble("preciov"));
						k.setStock(rs.getInt("stock"));
					}
					

					txtnp.setText(""+ k.getNombrep());
					txtst.setText(""+k.getStock());
					txtpv.setText(""+k.getPreciov());
					System.out.println(k.getNombrep());
					System.out.println(k.getStock());
					System.out.println(k.getPreciov());
					
					
				}catch(SQLException ex) {
					System.err.println(ex.getMessage());
					
				}
				
			
			}
		});
		txtid.setBounds(190, 97, 67, 20);
		txtid.setForeground(new Color(128, 0, 128));
		txtid.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtid.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblnp = new JLabel("NOMBRE PRODUCTO");
		lblnp.setBounds(305, 100, 137, 14);
		lblnp.setHorizontalAlignment(SwingConstants.CENTER);
		lblnp.setBackground(new Color(255, 255, 255));
		lblnp.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		panel.add(lblnp);
		
		txtst = new JTextField();
		txtst.setEditable(false);
		txtst.setBounds(259, 136, 91, 20);
		txtst.setHorizontalAlignment(SwingConstants.LEFT);
		txtst.setForeground(new Color(128, 0, 128));
		txtst.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtst.setColumns(10);
		panel.add(txtst);
		
		JLabel lblst = new JLabel("STOCK");
		lblst.setBounds(170, 139, 91, 14);
		lblst.setHorizontalAlignment(SwingConstants.CENTER);
		lblst.setBackground(new Color(255, 255, 255));
		lblst.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		panel.add(lblst);
		
		JLabel lblct = new JLabel("CANTIDAD");
		lblct.setBounds(378, 139, 114, 14);
		lblct.setHorizontalAlignment(SwingConstants.CENTER);
		lblct.setBackground(new Color(255, 255, 255));
		lblct.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		panel.add(lblct);
		
		txtct = new JTextField();
		txtct.setBounds(484, 136, 114, 20);
		txtct.setHorizontalAlignment(SwingConstants.LEFT);
		txtct.setForeground(new Color(128, 0, 128));
		txtct.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtct.setColumns(10);
		panel.add(txtct);
		
		txtnp = new JTextField();
		txtnp.setEditable(false);
		txtnp.setBounds(467, 97, 212, 20);
		txtnp.setHorizontalAlignment(SwingConstants.LEFT);
		txtnp.setForeground(new Color(128, 0, 128));
		txtnp.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtnp.setColumns(10);
		panel.add(txtnp);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		scrollPane.setBounds(49, 321, 598, 254);
		panel.add(scrollPane);
		
		tablav = new JTable();
		tablav.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KirikoLRS k=new KirikoLRS();
				
				int fila=tablav.getSelectedRow();
String id=tablav.getValueAt(fila, 0).toString();
	String nombre=tablav.getValueAt(fila, 1).toString();
	String precio=tablav.getValueAt(fila, 2).toString();
				String cantidad=tablav.getValueAt(fila, 3).toString();
				String subtotal=tablav.getValueAt(fila, 4).toString();
				txtid.setText(""+id);
				txtnp.setText(""+nombre);
				txtpv.setText(""+precio);
				txtct.setText(""+cantidad);
				txtsub.setText(""+subtotal);
				
				int i=Integer.parseInt(txtid.getText());	
				try {
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT * FROM producto WHERE id_p='"+i+"'";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
					System.out.println(sql);
					
					if(rs.next()) {
				
				k.setStock(rs.getInt("stock"));
					}
					txtst.setText(""+k.getStock());
			
			}catch(SQLException ex) {
				System.err.println(ex.getMessage());
				
			}
			}
		});
		tablav.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		tablav.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Precio", "Cantidad", "Subtotal"
			}
		));
		scrollPane.setViewportView(tablav);
		
		try {
			DefaultTableModel modelo=new DefaultTableModel();
			
			PreparedStatement ps=null;
			ResultSet rs=null;
			
			Conexion cn=new Conexion();
			Connection conectar=cn.conectar();
			
			String sql="SELECT id_p, nombrep FROM producto";
			ps=conectar.prepareStatement(sql);
			rs=ps.executeQuery();
			
			
			ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
			int cantcol=rmds.getColumnCount();
			modelo.addColumn("ID");
			modelo.addColumn("NOMBRE");
			modelo.addColumn("PRECIO");
			modelo.addColumn("CANTIDAD");
			modelo.addColumn("SUBTOTAL");
			
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
		txt.setBounds(125, 284, 279, 21);
		panel.add(txt);
		txt.setColumns(10);
		
		JButton btn5 = new JButton("Buscar");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=txt.getText();
				try {
					DefaultTableModel modelo=new DefaultTableModel();
					tablav.setModel(modelo);
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT id_p, nombrep FROM producto";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
				
					ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
					int cantcol=rmds.getColumnCount();
					
					modelo.addColumn("ID");
					modelo.addColumn("NOMBRE");
					modelo.addColumn("PRECIO");
					modelo.addColumn("CANTIDAD");
					modelo.addColumn("SUBTOTAL");
					
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
		btn5.setBounds(442, 282, 114, 23);
		panel.add(btn5);
		
		
		
		
		JButton btnticket = new JButton("");
		btnticket.setIcon(new ImageIcon(Ventas.class.getResource("/img/icons8-imprimir-40.png")));
		btnticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				double total=Double.parseDouble(txttot.getText());
				int cantidad=Integer.parseInt(txtct.getText());
				int idp=Integer.parseInt(txtid.getText());
				
				k.setId(2);
				k.setIdp(idp);
				k.setCantidad(cantidad);
				k.setTotal(total);
				
				if(k.insertarV() && k.insertarDV()) {
					JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
					Document documento=new Document();
					try {
						String ruta =System.getProperty("user.home");
						PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ticket de Compra.pdf"));                                                                  
						documento.open();
						PdfPTable tabla=new PdfPTable(4);
						tabla.addCell("ID");
						tabla.addCell("FOLIO VENTA");
						tabla.addCell("TOTAL");
						tabla.addCell("FECHA Y HORA");
						
						try {
						
							Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
							PreparedStatement ps=cn.prepareStatement("SELECT * FROM ventas");
							ResultSet rs=ps.executeQuery();
							
							if(rs.next()) {
								
							do {
								tabla.addCell(rs.getString(1));
								tabla.addCell(rs.getString(2));
								tabla.addCell(rs.getString(3));
								tabla.addCell(rs.getString(4));

							}while(rs.next());
								
							documento.add(tabla);
								
							}
						}catch(DocumentException | SQLException e1) {
							
						}
						
					}catch(DocumentException | HeadlessException | FileNotFoundException e3) {
					
						e3.printStackTrace();
						
					}
					documento.close();
					JOptionPane.showMessageDialog(null, "Ticket Generado");
					
				}else {
					JOptionPane.showMessageDialog(null, "Error en registro");
				}
				
			}
		});
		btnticket.setFont(new Font("Dialog", Font.BOLD, 12));
		btnticket.setBackground(new Color(121, 134, 196));
		btnticket.setForeground(new Color(255, 255, 255));
		btnticket.setBounds(49, 586, 103, 61);
		panel.add(btnticket);
		
		JButton btn4 = new JButton("Mostrar todo");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel modelo=new DefaultTableModel();
					tablav.setModel(modelo);
					
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					Conexion cn=new Conexion();
					Connection conectar=cn.conectar();
					
					String sql="SELECT id_p, nombrep FROM producto";
					ps=conectar.prepareStatement(sql);
					rs=ps.executeQuery();
					
					
					ResultSetMetaData rmds=(ResultSetMetaData)rs.getMetaData();
					int cantcol=rmds.getColumnCount();
					modelo.addColumn("ID");
					modelo.addColumn("NOMBRE");
					modelo.addColumn("PRECIO");
					modelo.addColumn("CANTIDAD");
					modelo.addColumn("SUBTOTAL");
					
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
		btn4.setBounds(305, 210, 132, 23);
		panel.add(btn4);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimpiar.setBackground(new Color(121, 134, 196));
		btnLimpiar.setBounds(453, 210, 91, 23);
		panel.add(btnLimpiar);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(215, 224, 255));
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		panel1.setBounds(0, 0, 723, 77);
		panel.add(panel1);
		panel1.setLayout(null);
		
		lblNewLabel = new JLabel("¡Registra tus ventas de manera más eficiente! ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 114, 168));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 11, 591, 19);
		panel1.add(lblNewLabel);
		//Image foto2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pro/icons8-caro-2-50.png"));
		
		JLabel lblPapeleraKirikoshop = new JLabel("Papelería KIRIKOSHOP");
		lblPapeleraKirikoshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblPapeleraKirikoshop.setForeground(new Color(128, 0, 128));
		lblPapeleraKirikoshop.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblPapeleraKirikoshop.setBounds(30, 41, 591, 19);
		panel1.add(lblPapeleraKirikoshop);
		

		logo = new JLabel("");
		logo.setBounds(643, 11, 70, 61);
  		panel1.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		logo.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		//Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("pro/icons8-caro-2-50.png"));
				
		
		
				JButton mas = new JButton("+");
				mas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int cantidad=Integer.parseInt(txtct.getText());
						int stock=Integer.parseInt(txtst.getText());
						if(cantidad>stock) {
					JOptionPane.showMessageDialog(null, "Stock insuficiente");
						}else {
						modelo=(DefaultTableModel) tablav.getModel();
						tablav.setModel(modelo);
						calcularprecio();	
					
						datos[0]=txtid.getText().trim();
						datos[1]=txtnp.getText().trim();
						datos[2]=txtpv.getText().trim();
						datos[3]=txtct.getText().trim();
						datos[4]=txtsub.getText().trim();
						modelo.addRow(datos);
						
						// Supongamos que la columna que quieres sumar es la columna 2 (índice 1)
						int columna = 4;
						double total = 0;

						for (int i = 0; i < tablav.getRowCount(); i++) {
						    double valor = Double.parseDouble(tablav.getValueAt(i, columna).toString());
						    total += valor;
						}

						double iva = total * 0.16;
						double subtotal = total + iva;

						System.out.println("IVA: " + iva);
						System.out.println("Subtotal: " + subtotal);
						txttot.setText(""+aMoneda(subtotal));
						txtsub.setText(""+aMoneda(total));
						txtiva.setText(""+aMoneda(iva));
					}
						}
				});
				mas.setForeground(Color.WHITE); 
				mas.setFont(new Font("Dialog", Font.BOLD, 55));
				mas.setBackground(new Color(147, 255, 147));
				mas.setBounds(39, 189, 103, 55);
				panel.add(mas);
				
				JButton menos = new JButton("-");
				menos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int fila=tablav.getSelectedRow();
						String id=tablav.getValueAt(fila, 0).toString();
					
						txtid.setText("");
						txtpv.setText("");
						txtct.setText("");
						txtnp.setText("");
						txtst.setText("");
						
						modelo.removeRow(fila);
						
						int columna = 4;
						double total = 0;

						for (int i = 0; i < tablav.getRowCount(); i++) {
						    double valor = Double.parseDouble(tablav.getValueAt(i, columna).toString());
						    total += valor;
						}

						double iva = total * 0.16;
						double subtotal = total + iva;

						System.out.println("IVA: " + iva);
						System.out.println("Subtotal: " + subtotal);
						txttot.setText(""+aMoneda(subtotal));
						txtsub.setText(""+aMoneda(total));
						txtiva.setText(""+aMoneda(iva));
					}
				});
				menos.setForeground(Color.WHITE);
				menos.setFont(new Font("Dialog", Font.BOLD, 55));
				menos.setBackground(new Color(255, 111, 111));
				menos.setBounds(170, 189, 103, 55);
				panel.add(menos);
				
				JLabel lblIva = new JLabel("IVA");
				lblIva.setHorizontalAlignment(SwingConstants.CENTER);
				lblIva.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblIva.setBackground(Color.WHITE);
				lblIva.setBounds(378, 597, 91, 14);
				panel.add(lblIva);
				
				txtiva = new JTextField();
				txtiva.setHorizontalAlignment(SwingConstants.LEFT);
				txtiva.setForeground(new Color(128, 0, 128));
				txtiva.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txtiva.setColumns(10);
				txtiva.setBounds(484, 594, 136, 20);
				panel.add(txtiva);
				
				JLabel lblSubtotal = new JLabel("SUBTOTAL");
				lblSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
				lblSubtotal.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblSubtotal.setBackground(Color.WHITE);
				lblSubtotal.setBounds(378, 633, 91, 14);
				panel.add(lblSubtotal);
				
				txtsub = new JTextField();
				txtsub.setHorizontalAlignment(SwingConstants.LEFT);
				txtsub.setForeground(new Color(128, 0, 128));
				txtsub.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txtsub.setColumns(10);
				txtsub.setBounds(484, 630, 136, 20);
				panel.add(txtsub);
				
				JLabel lblTotal = new JLabel("TOTAL");
				lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
				lblTotal.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblTotal.setBackground(Color.WHITE);
				lblTotal.setBounds(378, 772, 82, 14);
				panel.add(lblTotal);
				
				txttotal = new JTextField();
				txttotal.setHorizontalAlignment(SwingConstants.LEFT);
				txttotal.setForeground(new Color(128, 0, 128));
				txttotal.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txttotal.setColumns(10);
				txttotal.setBounds(464, 766, 157, 20);
				panel.add(txttotal);
				
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
				btnRegresar.setBounds(606, 282, 91, 23);
				panel.add(btnRegresar);
				
				kiriko = new JLabel("");
				kiriko.setBounds(26, 88, 76, 77);
				panel.add(kiriko);
				ancho=kiriko.getWidth();
				alto=kiriko.getHeight();
				kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				
				txtpv = new JTextField();
				txtpv.setEditable(false);
				txtpv.setHorizontalAlignment(SwingConstants.LEFT);
				txtpv.setForeground(new Color(128, 0, 128));
				txtpv.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txtpv.setColumns(10);
				txtpv.setBounds(622, 156, 91, 20);
				panel.add(txtpv);
				txtpv.setVisible(false);
				
				JLabel lblTotal_1 = new JLabel("TOTAL");
				lblTotal_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblTotal_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblTotal_1.setBackground(Color.WHITE);
				lblTotal_1.setBounds(378, 670, 91, 14);
				panel.add(lblTotal_1);
				
				txttot = new JTextField();
				txttot.setHorizontalAlignment(SwingConstants.LEFT);
				txttot.setForeground(new Color(128, 0, 128));
				txttot.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txttot.setColumns(10);
				txttot.setBounds(484, 668, 136, 20);
				panel.add(txttot);
				
		
		
	}
	public void limpiar() {
		txtid.setText("");
		txtnp.setText("");
		txtpv.setText("");
		txtct.setText("");
		txtst.setText("");
	}
	
	public void calcularprecio() {
		double pv=Double.parseDouble(txtpv.getText());
		int ct=Integer.parseInt(txtct.getText());
		
precio=pv*ct;
txtsub.setText(""+aMoneda(precio));
		iva=precio*0.16;
		txtiva.setText(""+aMoneda(iva));
		
	}
	
	public double aMoneda(double precio) {
		return Math.round(precio*100.0)/100.0;
	}
	
	
}