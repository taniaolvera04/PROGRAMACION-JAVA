package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.log.SysoCounter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import Controlador.KirikoLRS;
import Modelo.Conexion;

public class Ventas extends JFrame {

	private JPanel panel;
	private JTextField txtid;
	private JTextField txtst;
	private JTextField txtct;
	private JTextField txtnp;
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
		setTitle("VENTAS ADMIN");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventas.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 715);
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
		txtid.setBounds(190, 97, 67, 20);
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
		txtst.setBounds(259, 136, 91, 20);
		txtst.setEditable(false);
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
		txtnp.setBounds(467, 97, 212, 20);
		txtnp.setEditable(false);
		txtnp.setHorizontalAlignment(SwingConstants.LEFT);
		txtnp.setForeground(new Color(128, 0, 128));
		txtnp.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtnp.setColumns(10);
		panel.add(txtnp);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 272, 598, 254);
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
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
		
		
		
		
		JButton btnticket = new JButton("");
		btnticket.setBounds(58, 549, 114, 77);
		btnticket.setIcon(new ImageIcon(Ventas.class.getResource("/img/icons8-imprimir-40.png")));
		btnticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				double total=Double.parseDouble(txttot.getText());
				int cantidad=Integer.parseInt(txtct.getText());
				int idp=Integer.parseInt(txtid.getText());	
				PreparedStatement ps=null;
				ResultSet rs = null;
				
				
				k.setId(2);
				k.setCantidad(cantidad);
				k.setTotal(total);
				
				if(k.insertarV()) {
			System.out.println("inserto venta");
			
					if(k.recF()) {
						
			int folio=k.getFoliov();
			System.out.println(folio);
			
			
			DefaultTableModel modelo=(DefaultTableModel) tablav.getModel();
			int filas=modelo.getRowCount();
			
						for(int i=0; i<filas;i++) {
							int id=Integer.parseInt(modelo.getValueAt(i, 0).toString());
							int ct=Integer.parseInt(modelo.getValueAt(i, 3).toString());
			        	k.setFoliov(folio);
						k.setIdp(id);
						k.setCantidad(ct);
						
						if(k.insertarDV()) {
							System.out.println("detalle v");		
						
						}
					
						}
						
					JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
					
					Ticket();
					
				}else {
					JOptionPane.showMessageDialog(null, "Error en registro");
					
				
		}			
			}
			}
		});
		btnticket.setFont(new Font("Dialog", Font.BOLD, 12));
		btnticket.setBackground(new Color(121, 134, 196));
		btnticket.setForeground(new Color(255, 255, 255));
		panel.add(btnticket);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(453, 210, 91, 23);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimpiar.setBackground(new Color(121, 134, 196));
		panel.add(btnLimpiar);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 723, 77);
		panel1.setBackground(new Color(215, 224, 255));
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
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
				mas.setBounds(39, 189, 103, 55);
				mas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int cantidad=Integer.parseInt(txtct.getText());
						int stock=Integer.parseInt(txtst.getText());
						if(cantidad>stock || stock==0) {
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
						double subtotal = total - iva;

						System.out.println("IVA: " + iva);
						System.out.println("Subtotal: " + subtotal);
						txttot.setText(""+aMoneda(total));
						txtsub.setText(""+aMoneda(subtotal));
						txtiva.setText(""+aMoneda(iva));
					}
						}
				});
				mas.setForeground(Color.WHITE); 
				mas.setFont(new Font("Dialog", Font.BOLD, 55));
				mas.setBackground(new Color(147, 255, 147));
				panel.add(mas);
				
				JButton menos = new JButton("-");
				menos.setBounds(170, 189, 103, 55);
				menos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int fila=tablav.getSelectedRow();
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
				panel.add(menos);
				
				JLabel lblIva = new JLabel("IVA");
				lblIva.setBounds(378, 549, 91, 14);
				lblIva.setHorizontalAlignment(SwingConstants.CENTER);
				lblIva.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblIva.setBackground(Color.WHITE);
				panel.add(lblIva);
				
				txtiva = new JTextField();
				txtiva.setBounds(484, 546, 136, 20);
				txtiva.setHorizontalAlignment(SwingConstants.LEFT);
				txtiva.setForeground(new Color(128, 0, 128));
				txtiva.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txtiva.setColumns(10);
				panel.add(txtiva);
				
				JLabel lblSubtotal = new JLabel("SUBTOTAL");
				lblSubtotal.setBounds(378, 596, 91, 14);
				lblSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
				lblSubtotal.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblSubtotal.setBackground(Color.WHITE);
				panel.add(lblSubtotal);
				
				txtsub = new JTextField();
				txtsub.setBounds(484, 593, 136, 20);
				txtsub.setHorizontalAlignment(SwingConstants.LEFT);
				txtsub.setForeground(new Color(128, 0, 128));
				txtsub.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txtsub.setColumns(10);
				panel.add(txtsub);
				
				JLabel lblTotal = new JLabel("TOTAL");
				lblTotal.setBounds(378, 772, 82, 14);
				lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
				lblTotal.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblTotal.setBackground(Color.WHITE);
				panel.add(lblTotal);
				
				txttotal = new JTextField();
				txttotal.setBounds(464, 766, 157, 20);
				txttotal.setHorizontalAlignment(SwingConstants.LEFT);
				txttotal.setForeground(new Color(128, 0, 128));
				txttotal.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txttotal.setColumns(10);
				panel.add(txttotal);
				
				JButton btnRegresar = new JButton("Regresar");
				btnRegresar.setBounds(587, 210, 91, 23);
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
				panel.add(btnRegresar);
				
				kiriko = new JLabel("");
				kiriko.setBounds(26, 88, 76, 77);
				panel.add(kiriko);
				ancho=kiriko.getWidth();
				alto=kiriko.getHeight();
				kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				
				txtpv = new JTextField();
				txtpv.setBounds(622, 156, 91, 20);
				txtpv.setEditable(false);
				txtpv.setHorizontalAlignment(SwingConstants.LEFT);
				txtpv.setForeground(new Color(128, 0, 128));
				txtpv.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txtpv.setColumns(10);
				panel.add(txtpv);
				txtpv.setVisible(false);
				
				JLabel lblTotal_1 = new JLabel("TOTAL");
				lblTotal_1.setBounds(378, 646, 91, 14);
				lblTotal_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblTotal_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
				lblTotal_1.setBackground(Color.WHITE);
				panel.add(lblTotal_1);
				
				txttot = new JTextField();
				txttot.setBounds(484, 643, 136, 20);
				txttot.setHorizontalAlignment(SwingConstants.LEFT);
				txttot.setForeground(new Color(128, 0, 128));
				txttot.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				txttot.setColumns(10);
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
	
	public void Ticket() {
		KirikoLRS k=new KirikoLRS();
		PreparedStatement ps=null;
		ResultSet rs = null;
		Document documento=new Document();
		if(k.recF()) {
			
			int folio=k.getFoliov();
			System.out.println(folio);
		
		
	

		try {
			String ruta =System.getProperty("user.home");
			PdfWriter.getInstance(documento, new FileOutputStream(ruta +"/Desktop/Ticket de Venta.pdf"));                                                                  
			documento.open();
			PdfPTable tabla=new PdfPTable(6);
			tabla.addCell("FOLIO");
			tabla.addCell("NOMBRE");
			tabla.addCell("PRECIO");
			tabla.addCell("CANTIDAD");
			tabla.addCell("TOTAL");
			tabla.addCell("FECHA Y HORA");
		
			
			try {
				       
			
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/kiriko","root","");
				 ps=cn.prepareStatement("SELECT folio_v, nombrep, preciov, cant, total, fecha_hr FROM ventas join detalle_ventas using(folio_v) join producto using(id_p) WHERE folio_v=?");
				 
				ps.setInt(1, k.getFoliov());
				 
				 rs=ps.executeQuery();
				
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

				e1.printStackTrace();
			}
			
		}catch(DocumentException | HeadlessException | FileNotFoundException e3) {
		
			e3.printStackTrace();
			
		}
		documento.close();
		JOptionPane.showMessageDialog(null, "Ticket Generado");
		
		}
	
	}
	
	
	
	
	
}