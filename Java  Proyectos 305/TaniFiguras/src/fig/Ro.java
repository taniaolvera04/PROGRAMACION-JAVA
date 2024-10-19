package fig;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ro extends JFrame {

	private JPanel contentPane;
	private JTextField txtd;
	private JTextField txtar;
	private JTextField txtpe;
	int ancho, alto;
	private JTextField txtD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ro frame = new Ro();
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
	public Ro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 385);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 207, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel img = new JLabel("");
		img.setBounds(51, 56, 116, 117);
		contentPane.add(img);
		ancho=img.getWidth();
		alto=img.getHeight();
		Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rombo.png"));
		img.setIcon(new ImageIcon(foto.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
		
		JLabel lblb = new JLabel("Diagonal menor");
		lblb.setForeground(new Color(128, 0, 128));
		lblb.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblb.setHorizontalAlignment(SwingConstants.CENTER);
		lblb.setBounds(100, 197, 116, 14);
		contentPane.add(lblb);
		
		txtd = new JTextField();
		txtd.setForeground(new Color(255, 85, 255));
		txtd.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtd.setColumns(10);
		txtd.setBounds(235, 195, 104, 20);
		contentPane.add(txtd);
		
		JLabel lblarea = new JLabel("Área");
		lblarea.setHorizontalAlignment(SwingConstants.LEFT);
		lblarea.setForeground(new Color(64, 0, 64));
		lblarea.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblarea.setBounds(235, 75, 61, 22);
		contentPane.add(lblarea);
		
		JLabel lblperimetro = new JLabel("Perímetro");
		lblperimetro.setHorizontalAlignment(SwingConstants.LEFT);
		lblperimetro.setForeground(new Color(64, 0, 64));
		lblperimetro.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblperimetro.setBounds(226, 137, 80, 22);
		contentPane.add(lblperimetro);
		
		txtar = new JTextField();
		txtar.setForeground(new Color(222, 145, 255));
		txtar.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtar.setBounds(316, 77, 116, 20);
		contentPane.add(txtar);
		txtar.setColumns(10);
		txtar.setEditable(false);
		
		txtpe = new JTextField();
		txtpe.setForeground(new Color(222, 145, 255));
		txtpe.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtpe.setColumns(10);
		txtpe.setBounds(316, 139, 116, 20);
		contentPane.add(txtpe);
		txtpe.setEditable(false);
		
		
		JLabel lbln = new JLabel("ROMBO");
		lbln.setHorizontalAlignment(SwingConstants.CENTER);
		lbln.setForeground(new Color(109, 0, 174));
		lbln.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		lbln.setBounds(137, 24, 181, 14);
		contentPane.add(lbln);
		
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area=0, perimetro=0;
				Figuras f=new Figuras();
				double d=Double.parseDouble(txtd.getText());
				double D=Double.parseDouble(txtD.getText());
				if(d>D) {
					JOptionPane.showMessageDialog(null, "Valores incorrectos");
				}else {
					double lado=Math.sqrt(Math.pow(D, 2) + Math.pow(d,2));
					f.setNombref(lbln.getText());
					f.setA(d);
					f.setB(D);
					f.setC(0);
					area=(D*d)/2;
					perimetro=(lado*4)/2;
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
					f.setArea(Double.parseDouble(txtar.getText()));
					f.setPerimetro(Double.parseDouble(txtpe.getText()));
					if(f.insertar()) {
						JOptionPane.showMessageDialog(null, "Figura registrada");
					}else {
						JOptionPane.showMessageDialog(null, "Error en registro");
					}
					
			}
			}
	});
	btnCalcular.setForeground(new Color(156, 0, 223));
	btnCalcular.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
	btnCalcular.setBounds(10, 296, 130, 23);
	contentPane.add(btnCalcular);

	JButton btnLimpiar = new JButton("LIMPIAR");
	btnLimpiar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			txtar.setText("");
			txtpe.setText("");
			txtd.setText("");
			txtD.setText("");
		}
		});
	btnLimpiar.setForeground(new Color(156, 0, 223));
	btnLimpiar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
	btnLimpiar.setBounds(160, 296, 111, 23);
	contentPane.add(btnLimpiar);
	
	
	
	JButton btnRegresar = new JButton("REGRESAR");
	btnRegresar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Menu m=new Menu();
			m.setVisible(true);
			dispose();
		}
	});
	btnRegresar.setForeground(new Color(156, 0, 223));
	btnRegresar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
	btnRegresar.setBounds(292, 298, 121, 23);
	contentPane.add(btnRegresar);
	
	JLabel lblh = new JLabel("Diagonal mayor");
	lblh.setHorizontalAlignment(SwingConstants.CENTER);
	lblh.setForeground(new Color(128, 0, 128));
	lblh.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
	lblh.setBounds(100, 241, 116, 14);
	contentPane.add(lblh);
	
	txtD = new JTextField();
	txtD.setForeground(new Color(255, 85, 255));
	txtD.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
	txtD.setColumns(10);
	txtD.setBounds(235, 240, 104, 20);
	contentPane.add(txtD);
}
}