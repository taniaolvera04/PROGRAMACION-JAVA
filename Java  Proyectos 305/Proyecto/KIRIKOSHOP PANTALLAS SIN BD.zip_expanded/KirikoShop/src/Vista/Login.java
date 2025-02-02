package Vista;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
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


public class Login {
	SignIn si=new SignIn();
	Recuperacion r=new Recuperacion();
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
	private JButton btnCrearCuenta;
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
		PL.setLocationRelativeTo(null);;
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
				r.setVisible(true);
				PL.dispose();
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
				 char i=txtc.getEchoChar();
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
				String pass=txtc.getText();

				if(usuario.isEmpty() || pass.isEmpty()) {
  			JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else {
				if(usuario.equals("Kiriko") && pass.equals("BLACKPINK")) {
					JOptionPane.showMessageDialog(null, "Acceso permitido");
				}else {
					JOptionPane.showMessageDialog(null, "Acceso Denegado");
				}
				}
			}
		});
		btnLogin.setBackground(new Color(121, 134, 196));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBounds(199, 348, 118, 31);
		panel.add(btnLogin);
		
		btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                PL.dispose();
				si.setVisible(true);
			}
		});
		btnCrearCuenta.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCrearCuenta.setBorder(null);
		btnCrearCuenta.setForeground(new Color(0, 0, 255));
		btnCrearCuenta.setBackground(new Color(255, 255, 255));
		btnCrearCuenta.setBounds(51, 348, 118, 31);
		panel.add(btnCrearCuenta);
		
		

	}

}