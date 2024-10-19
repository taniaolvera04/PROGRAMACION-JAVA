package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Recuperacion extends JFrame {

	private JPanel PR;
	private JPanel az;
	private JTextField txtid;
	int ancho, alto;
	private JTextField txtu;
	private JTextField txtco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recuperacion frame = new Recuperacion();
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
	public Recuperacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 383, 518);
		setLocationRelativeTo(null);
		
		PR = new JPanel();
		PR.setBackground(new Color(255, 255, 255));
		PR.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PR);
		PR.setLayout(null);
		
		
	    az = new JPanel();
	    az.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		az.setBackground(new Color(215, 224, 255));
		az.setBounds(0, 0, 371, 84);		
		PR.add(az);
		az.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(291, 11, 70, 61);
		az.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		
		JLabel lblcreaUnaCuenta = new JLabel("¿Olvidaste tu contraseña?");
		lblcreaUnaCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblcreaUnaCuenta.setForeground(new Color(0, 114, 168));
		lblcreaUnaCuenta.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblcreaUnaCuenta.setBounds(23, 20, 227, 14);
		az.add(lblcreaUnaCuenta);
		
		JLabel lblBlucorpEstDiseado = new JLabel("BluCorp está diseñado para ayudarle.");
		lblBlucorpEstDiseado.setHorizontalAlignment(SwingConstants.LEFT);
		lblBlucorpEstDiseado.setForeground(new Color(0, 149, 221));
		lblBlucorpEstDiseado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBlucorpEstDiseado.setBounds(23, 45, 227, 14);
		az.add(lblBlucorpEstDiseado);
		
		JLabel kiriko = new JLabel("");
		kiriko.setBounds(42, 87, 51, 48);
		PR.add(kiriko);
		ancho=kiriko.getWidth();
		alto=kiriko.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel lblid = new JLabel("Ingresa tu ID de usuario");
		lblid.setFont(new Font("Dialog", Font.BOLD, 12));
		lblid.setBounds(42, 146, 185, 21);
		PR.add(lblid);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtid.setColumns(10);
		txtid.setBounds(42, 178, 267, 31);
		PR.add(txtid);
		
		JLabel lblu = new JLabel("Ingresa tu nombre de usuario");
		lblu.setFont(new Font("Dialog", Font.BOLD, 12));
		lblu.setBounds(42, 222, 185, 21);
		PR.add(lblu);
		
		txtu = new JTextField();
		txtu.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtu.setColumns(10);
		txtu.setBounds(42, 254, 267, 31);
		PR.add(txtu);
		
		JLabel lblco = new JLabel("Ingresa tu código de recuperación");
		lblco.setFont(new Font("Dialog", Font.BOLD, 12));
		lblco.setBounds(42, 296, 267, 21);
		PR.add(lblco);
		
		txtco = new JTextField();
		txtco.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtco.setColumns(10);
		txtco.setBounds(42, 328, 267, 31);
		PR.add(txtco);
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.BOLD, 9));
		creditos.setBounds(20, 435, 305, 31);
		PR.add(creditos);
		
		JButton btnRecuperar = new JButton("Recuperar");
		btnRecuperar.setForeground(Color.WHITE);
		btnRecuperar.setBackground(new Color(121, 134, 196));
		btnRecuperar.setBounds(42, 385, 126, 31);
		PR.add(btnRecuperar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario=txtu.getText();
				//String id=txt.getText();

				if(usuario.isEmpty()) {
  			JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else {
				if(usuario.equals("Kiriko")) {
					JOptionPane.showMessageDialog(null, "Acceso permitido");
					Login window = new Login();
					window.PL.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Acceso Denegado");
				}
				}
			}
		});
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnSiguiente.setBackground(new Color(121, 134, 196));
		btnSiguiente.setBounds(183, 384, 126, 31);
		PR.add(btnSiguiente);
	
	}
}
