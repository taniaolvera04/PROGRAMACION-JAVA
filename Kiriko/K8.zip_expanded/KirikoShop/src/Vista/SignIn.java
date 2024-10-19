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
import java.util.UUID;

import Controlador.KirikoLRS;

public class SignIn extends JFrame {

	private JPanel PS;
	private JFrame PL;
	private JPanel az;
	private JTextField txtu;
	private JPasswordField txtc;
	private JPasswordField txtc2;
	int ancho, alto;
	private JTextField txtn;
	private JTextField txtap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(289, 54, 383, 717);
		setLocationRelativeTo(null);
		
		PS = new JPanel();
		PS.setBackground(new Color(255, 255, 255));
		PS.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PS);
		PS.setLayout(null);
		
	    az = new JPanel();
	    az.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), null, null));
		az.setBackground(new Color(215, 224, 255));
		az.setBounds(0, 0, 371, 84);
		PS.add(az);
		az.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(291, 11, 70, 61);
		az.add(logo);
		ancho=logo.getWidth();
		alto=logo.getHeight();
		Image foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IMG-20230826-WA0022.jpg"));
		logo.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));

		
		JLabel lblcreaUnaCuenta = new JLabel("¡Crea una cuenta nueva!");
		lblcreaUnaCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblcreaUnaCuenta.setForeground(new Color(0, 114, 168));
		lblcreaUnaCuenta.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblcreaUnaCuenta.setBounds(23, 20, 199, 14);
		az.add(lblcreaUnaCuenta);
		
		JLabel lblBlucorpEstDiseado = new JLabel("BluCorp está diseñado para ayudarle.");
		lblBlucorpEstDiseado.setHorizontalAlignment(SwingConstants.LEFT);
		lblBlucorpEstDiseado.setForeground(new Color(0, 149, 221));
		lblBlucorpEstDiseado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBlucorpEstDiseado.setBounds(23, 45, 227, 14);
		az.add(lblBlucorpEstDiseado);
		
		JLabel kiriko = new JLabel("");
		kiriko.setBounds(42, 87, 60, 55);
		PS.add(kiriko);
		ancho=kiriko.getWidth();
		alto=kiriko.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1697592790252.jpg"));
		kiriko.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel lblu = new JLabel("Ingresa un nombre de usuario");
		lblu.setFont(new Font("Dialog", Font.BOLD, 12));
		lblu.setBounds(42, 301, 185, 21);
		PS.add(lblu);
		
		JLabel lbln = new JLabel("Ingresa tu nombre");
		lbln.setFont(new Font("Dialog", Font.BOLD, 12));
		lbln.setBounds(42, 153, 185, 21);
		PS.add(lbln);
		
		txtn = new JTextField();
		txtn.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtn.setColumns(10);
		txtn.setBounds(42, 185, 267, 31);
		PS.add(txtn);
		
		JLabel lblap = new JLabel("Ingresa tu apellido paterno");
		lblap.setFont(new Font("Dialog", Font.BOLD, 12));
		lblap.setBounds(42, 227, 185, 21);
		PS.add(lblap);
		
		txtap = new JTextField();
		txtap.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtap.setColumns(10);
		txtap.setBounds(42, 259, 267, 31);
		PS.add(txtap);
		
		
		
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
		txtu.setColumns(10);
		txtu.setBounds(42, 333, 267, 31);
		PS.add(txtu);
		
		JLabel lblc = new JLabel("Introduce una contraseña");
		lblc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblc.setBounds(42, 375, 162, 21);
		PS.add(lblc);
		
		txtc = new JPasswordField();
		txtc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtc.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtc.setHorizontalAlignment(SwingConstants.LEFT);
		txtc.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtc.setEchoChar('•');
		txtc.setBounds(42, 407, 267, 31);
		PS.add(txtc);
		
		JCheckBox Password = new JCheckBox("Mostrar contraseña");
		Password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char i=txtc.getEchoChar();
				if(Password.isSelected()==true) {
				txtc.setEchoChar((char) 0);
				}else if(Password.isSelected()==false) {
				txtc.setEchoChar('•');
					}
			}
		});
		Password.setFont(new Font("Dialog", Font.BOLD, 11));
		Password.setBackground(Color.WHITE);
		Password.setBounds(42, 445, 153, 23);
		PS.add(Password);
		
		JLabel lblc2 = new JLabel("Confirma tu contraseña");
		lblc2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblc2.setBounds(42, 482, 162, 21);
		PS.add(lblc2);
		
		txtc2 = new JPasswordField();
		txtc2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtc2.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtc2.setHorizontalAlignment(SwingConstants.LEFT);
		txtc2.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtc2.setEchoChar('•');
		txtc2.setBounds(42, 514, 267, 31);
		PS.add(txtc2);
		
		JCheckBox Password2 = new JCheckBox("Mostrar contraseña");
		Password2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char i=txtc2.getEchoChar();
				if(Password2.isSelected()==true) {
				txtc2.setEchoChar((char) 0);
				}else if(Password2.isSelected()==false) {
				txtc2.setEchoChar('•');
					}
			}
		});
		Password2.setFont(new Font("Dialog", Font.BOLD, 11));
		Password2.setBackground(Color.WHITE);
		Password2.setBounds(42, 564, 153, 23);
		PS.add(Password2);
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.BOLD, 9));
		creditos.setBounds(23, 647, 305, 31);
		PS.add(creditos);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KirikoLRS k=new KirikoLRS();
				String nombre=txtn.getText();
				String ap=txtap.getText();
				String usuario=txtu.getText();
				String pass=txtc.getText();
				String pass2=txtc2.getText();
				k.setNombre(nombre);
				k.setAp(ap);
				k.setNombreu(usuario);
				k.setContra(pass);
				k.setTipo("Admin");
				k.setCodigo(UUID.randomUUID().toString().toUpperCase().substring(0, 5));
					
				
				if(usuario.isEmpty() || pass.isEmpty() || pass2.isEmpty()) {
  			JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else if(pass2.equals(pass2)!=pass.equals(pass2)) {
					JOptionPane.showMessageDialog(null, "Contraseñas deben ser iguales");
				}else {
			
				if(k.insertar()) {
					JOptionPane.showMessageDialog(null, "¡Registro Exitoso!\n"
							+ "Usuario: " + k.getNombreu() + "\n"
							+ "Contraseña: " + k.getContra() + "\n"
							+ "Código de recuperación: " + k.getCodigo() + "\n");
				}else {
					JOptionPane.showMessageDialog(null, "ERROR");
			}
				}
			}
			
			
			
		});
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(121, 134, 196));
		btnRegistrar.setBounds(42, 605, 126, 31);
		PS.add(btnRegistrar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario=txtu.getText();
				String pass=txtc.getText();
				String pass2=txtc2.getText();
				
				
				if(usuario.isEmpty() || pass.isEmpty() || pass2.isEmpty()) {
  			JOptionPane.showMessageDialog(null, "Tienes campos vacíos");
				}else {
					Login window = new Login();
					window.PL.setVisible(true);
					dispose();
				}
			}
		});
		btnSiguiente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setBackground(new Color(121, 134, 196));
		btnSiguiente.setBounds(183, 605, 126, 31);
		PS.add(btnSiguiente);
		
		JButton btnBorrar = new JButton("Borrar todo");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtn.setText("");
				txtap.setText("");
				txtu.setText("");
				txtc.setText("");
				txtc2.setText("");
				Password.setSelected(false);
				Password2.setSelected(false);
			}
		});
		btnBorrar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnBorrar.setForeground(new Color(81, 81, 81));
		btnBorrar.setBackground(new Color(255, 255, 255));
		btnBorrar.setBorder(null);
		btnBorrar.setBounds(231, 545, 126, 18);
		PS.add(btnBorrar);
		
	
		

	}
}
