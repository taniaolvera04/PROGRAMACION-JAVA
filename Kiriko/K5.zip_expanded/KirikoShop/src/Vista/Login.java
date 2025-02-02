  package Vista;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Login {
	JFrame PL;
	private JLabel fondo;
	int ancho, alto;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblBlucorpEstDiseado;
	private JLabel logo;
	private JLabel kiriko;
	private JLabel lblu;
	private JTextField txtu;
	private JLabel candado;
	private JButton btnForgot;
	private JLabel creditos;
	private JPasswordField txtc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.PL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		PL = new JFrame();
		PL.setBounds(100, 100, 960, 635);
		PL.setLocationRelativeTo(null);
		PL.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/1697592790252.jpg")));
		PL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PL.getContentPane().setLayout(null);

		

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), null));
		panel.setBounds(289, 59, 371, 472);
		PL.getContentPane().add(panel);
		panel.setLayout(null);

		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(215, 224, 255));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		panel_1.setBounds(0, 0, 371, 84);
		panel.add(panel_1);
		panel_1.setLayout(null);

		

		lblNewLabel = new JLabel("¡Bienvenido!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(0, 114, 168));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 21, 101, 14);
		panel_1.add(lblNewLabel);

		
		lblBlucorpEstDiseado = new JLabel("BluCorp está diseñado para ayudarle.");
		lblBlucorpEstDiseado.setHorizontalAlignment(SwingConstants.LEFT);
		lblBlucorpEstDiseado.setForeground(new Color(0, 149, 221));
		lblBlucorpEstDiseado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBlucorpEstDiseado.setBounds(30, 46, 227, 14);
		panel_1.add(lblBlucorpEstDiseado);

		

		logo = new JLabel("");
		logo.setBounds(291, 11, 70, 61);
		panel_1.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));


		kiriko = new JLabel("");
		kiriko.setBounds(50, 89, 51, 48);
		panel.add(kiriko);
		ancho=kiriko.getWidth();
		alto=kiriko.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		
		lblu = new JLabel("Usuario");
		lblu.setFont(new Font("Dialog", Font.BOLD, 12));
		lblu.setBounds(50, 148, 94, 21);
		panel.add(lblu);
		
		txtu = new JTextField();
		txtu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtu.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtu.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtu.setBounds(50, 180, 267, 31);
		panel.add(txtu);
		txtu.setColumns(10);
		
		JLabel lblc = new JLabel("Contraseña");
		lblc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblc.setBounds(50, 222, 94, 21);
		panel.add(lblc);
	

		candado = new JLabel("");
		candado.setBounds(87, 398, 28, 15);
		ancho=candado.getWidth();
		alto=candado.getHeight();
		Image foto4 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/candado.png"));
		candado.setIcon(new ImageIcon(foto4.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		panel.add(candado);

		
		btnForgot = new JButton("¿Olvidaste la contraseña?");
		btnForgot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Connection conectar=null;
				PreparedStatement ps=null;
				ResultSet rs = null;
				try {
				    String pass = null;
				    String usser = null;
				    String codigo =JOptionPane.showInputDialog("Introduce código");
				    conectar = DriverManager.getConnection("jdbc:mysql://localhost/kiriko", "root", "");
				    ps = conectar.prepareStatement("SELECT codigo, ussername,password  FROM usuario WHERE codigo=?");
				    ps.setString(1, codigo );
				    rs = ps.executeQuery();
				    
				    if (rs.next()) {
				    	JOptionPane.showMessageDialog(null, "Usuario encontrado");
				       codigo = rs.getString(1);
				       usser=rs.getString(2);
				       pass=rs.getString(3);
				       txtu.setText(usser);
				       txtc.setText(pass);
				    
				    } else {
				        JOptionPane.showMessageDialog(null, "ERROR");
				    }

				} catch (Exception e2) {
				    JOptionPane.showMessageDialog(null, "ERROR");
				}
				
			}
		});
		btnForgot.setFont(new Font("Dialog", Font.BOLD, 12));
		btnForgot.setForeground(new Color(128, 128, 128));
		btnForgot.setBackground(new Color(255, 255, 255));
		btnForgot.setBounds(107, 386, 185, 39);
		btnForgot.setBorder(null);
		panel.add(btnForgot);

		
		creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setFont(new Font("Dialog", Font.BOLD, 9));
		creditos.setBounds(33, 424, 305, 31);
		panel.add(creditos);
		

		txtc = new JPasswordField();
		txtc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtc.getPassword().length>=50) {
					e.consume();
				}
			}
		});
		txtc.setEchoChar('•');
		txtc.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtc.setHorizontalAlignment(SwingConstants.LEFT);
		txtc.setBounds(50, 252, 267, 31);
		panel.add(txtc);

		
		
		fondo = new JLabel("            ");
		fondo.setBounds(0, 0, 944, 596);
		PL.getContentPane().add(fondo);
		ancho=fondo.getWidth();
		alto=fondo.getHeight();
		Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/de.jpg"));
		fondo.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		
		JCheckBox Password = new JCheckBox("Mostrar contraseña");
		Password.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 txtc.getEchoChar();
				if(Password.isSelected()==true) {
				txtc.setEchoChar((char) 0);
				}else if(Password.isSelected()==false) {
				txtc.setEchoChar('•');
					}
				
			}
		});
		Password.setBackground(new Color(255, 255, 255));
		Password.setFont(new Font("Dialog", Font.BOLD, 11));
		Password.setBounds(47, 306, 153, 23);
		panel.add(Password);
				

		JButton btnLogin = new JButton("Iniciar sesión");
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario=txtu.getText();
				String pass=String.valueOf(txtc.getPassword());
				if(usuario.isEmpty() || pass.isEmpty()) {
  			JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else {
			

					Connection conectar=null;
					PreparedStatement ps=null;
					ResultSet rs = null;
					try {
					    String usserCorrecto = null;
					    String passCorrecta = null;
					    String tipo = null;
					   

					    conectar = DriverManager.getConnection("jdbc:mysql://localhost/kiriko", "root", "");

					    ps = conectar.prepareStatement("SELECT ussername,password,tipo FROM usuario WHERE ussername=?");
					    ps.setString(1, usuario );
					    rs = ps.executeQuery();
					    
					    if (rs.next()) {
					        usserCorrecto = rs.getString(1);
					        passCorrecta = rs.getString(2);
					        tipo = rs.getString(3);
					    }

					    if (usserCorrecto !=null && pass!=null && pass.equals(passCorrecta)) {
					        if(tipo!=null){
					            if (tipo.equals("Admin")) {
					            	JOptionPane.showMessageDialog(null, "Acceso Permitido");
									Barra b=new Barra();
									b.setVisible(true);
									PL.dispose();
					            } else if (tipo.equals("Usuario")) {
					            	JOptionPane.showMessageDialog(null, "Acceso Permitido");
									Barra2 b2=new Barra2();
									b2.setVisible(true);
									PL.dispose();
					            }
					        }
					    } else {
					        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
					    }

					} catch (Exception e2) {
					    JOptionPane.showMessageDialog(null, "Acceso Denegado");
					}
					}
				
			}
		});
		btnLogin.setBackground(new Color(121, 134, 196));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBounds(131, 347, 118, 31);
		panel.add(btnLogin);
		
		

	}

}