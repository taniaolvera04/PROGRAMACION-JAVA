package Vista;

import java.awt.EventQueue;
import Controlador.KirikoLRS;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import Modelo.Conexion;
import javax.swing.SwingConstants;
public class Perfil extends JFrame {

	private JPanel Panel;
	
	Conexion c = new Conexion();
	int ancho, alto;
	private JTextField txtn;
	private JTextField txtid;
	private JTextField txtap;
	private JTextField txtu;
	private JTextField txtc;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
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
	public Perfil() {
		setTitle("PERFIL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 538);
		setLocationRelativeTo(null);
		Panel = new JPanel();
		Panel.setBackground(new Color(0, 0, 0));
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Panel);
		Panel.setLayout(null);
		
		JLabel usu = new JLabel("");
		usu.setBounds(352, 11, 74, 75);
		Panel.add(usu);
		ancho=usu.getWidth();
		alto=usu.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/usu.jpg"));
		usu.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		
		
		JPanel p = new JPanel();
		p.setBackground(new Color(58, 58, 58));
		p.setBounds(29, 90, 429, 378);
		Panel.add(p);
		p.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalTextPosition(SwingConstants.CENTER);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblId.setBounds(114, 0, 89, 48);
		p.add(lblId);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblNombre.setBounds(35, 70, 89, 48);
		p.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO");
		lblApellido.setHorizontalTextPosition(SwingConstants.CENTER);
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblApellido.setBounds(35, 129, 89, 48);
		p.add(lblApellido);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setHorizontalTextPosition(SwingConstants.CENTER);
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblContrasea.setBounds(24, 247, 110, 48);
		p.add(lblContrasea);
		
		JLabel lblNombreDeUsuario = new JLabel("USSERNAME");
		lblNombreDeUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario.setForeground(Color.WHITE);
		lblNombreDeUsuario.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblNombreDeUsuario.setBounds(35, 188, 89, 48);
		p.add(lblNombreDeUsuario);
		
		txtn = new JTextField();
		txtn.setBackground(new Color(214, 214, 214));
		txtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
		txtn.setBounds(184, 85, 171, 20);
		p.add(txtn);
		txtn.setColumns(10);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Segoe UI", Font.BOLD, 13));
		txtid.setColumns(10);
		txtid.setBackground(new Color(214, 214, 214));
		txtid.setBounds(200, 15, 78, 20);
		p.add(txtid);
		txtid.setEditable(false);
		
		txtap = new JTextField();
		txtap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		txtap.setColumns(10);
		txtap.setBackground(new Color(214, 214, 214));
		txtap.setBounds(184, 144, 171, 20);
		p.add(txtap);
		
		txtu = new JTextField();
		txtu.setFont(new Font("Segoe UI", Font.BOLD, 13));
		txtu.setColumns(10);
		txtu.setBackground(new Color(214, 214, 214));
		txtu.setBounds(184, 203, 171, 20);
		p.add(txtu);
		
		txtc = new JTextField();
		txtc.setFont(new Font("Segoe UI", Font.BOLD, 13));
		txtc.setColumns(10);
		txtc.setBackground(new Color(214, 214, 214));
		txtc.setBounds(184, 261, 171, 20);
		p.add(txtc);
		
		
		PreparedStatement ps=null;
		ResultSet rs = null;
		KirikoLRS k= new KirikoLRS();
		try {
			Conexion c = new Conexion();
			Connection cn = c.conecta();
			
			String sql="SELECT * FROM usuario";
			ps=cn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				
				int id = rs.getInt("id_u");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("ap");
				String usser = rs.getString("ussername");
				String pass = rs.getString("password");
				
				
				txtid.setText(""+id);
				txtn.setText(nombre);
				txtap.setText(apellido);
				txtu.setText(usser);
				txtc.setText(pass);
			}
			
		}catch(Exception e2) {
			System.out.println(e2.toString());
		}
		
		
		
		JButton btnA = new JButton("ACTUALIZAR");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
PreparedStatement ps = null;
				
				try {
					Conexion c = new Conexion();
					Connection cn = c.conecta();
					ps=cn.prepareStatement("UPDATE usuario SET nombre=?, ap=?, ussername=?, password=? WHERE id_u=?");
					
					ps.setString(1, txtn.getText());
					ps.setString(2, txtap.getText());
					ps.setString(3, txtu.getText());
					ps.setString(4, txtc.getText());
					ps.setString(5, txtid.getText());
					
					ps.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Datos Actualizados");
					
					
					
				}catch(Exception e2) {
					System.out.println(e2.toString());
				}
				
			}
		});
		btnA.setForeground(new Color(255, 255, 255));
		btnA.setBackground(new Color(177, 120, 254));
		btnA.setFont(new Font("Segoe UI Black", Font.ITALIC, 13));
		btnA.setBounds(64, 324, 139, 31);
		p.add(btnA);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuD m=new MenuD();
				m.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Segoe UI Black", Font.ITALIC, 13));
		btnRegresar.setBackground(new Color(177, 120, 254));
		btnRegresar.setBounds(225, 324, 139, 31);
		p.add(btnRegresar);
		
		
		JLabel lblPerfil = new JLabel("CONSULTA TU PERFIL\r\n");
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfil.setForeground(Color.WHITE);
		lblPerfil.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblPerfil.setBorder(null);
		lblPerfil.setBounds(66, 23, 291, 44);
		Panel.add(lblPerfil);

	}
}
