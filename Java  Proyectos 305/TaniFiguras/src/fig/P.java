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

public class P extends JFrame {

	private JPanel contentPane;
	private JTextField txtlado;
	private JTextField txtar;
	private JTextField txtpe;
	int ancho, alto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P frame = new P();
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
	public P() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 385);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 207, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel img = new JLabel("");
		img.setBounds(32, 59, 149, 140);
		contentPane.add(img);
		ancho=img.getWidth();
		alto=img.getHeight();
		Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pentagono.png"));
		img.setIcon(new ImageIcon(foto.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
		
		JLabel lbllado = new JLabel("Lado");
		lbllado.setForeground(new Color(128, 0, 128));
		lbllado.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lbllado.setHorizontalAlignment(SwingConstants.CENTER);
		lbllado.setBounds(144, 224, 46, 14);
		contentPane.add(lbllado);
		
		txtlado = new JTextField();
		txtlado.setForeground(new Color(255, 85, 255));
		txtlado.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtlado.setColumns(10);
		txtlado.setBounds(240, 222, 104, 20);
		contentPane.add(txtlado);
		
		JLabel lblarea = new JLabel("Área");
		lblarea.setHorizontalAlignment(SwingConstants.LEFT);
		lblarea.setForeground(new Color(64, 0, 64));
		lblarea.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblarea.setBounds(216, 75, 61, 22);
		contentPane.add(lblarea);
		
		JLabel lblperimetro = new JLabel("Perímetro");
		lblperimetro.setHorizontalAlignment(SwingConstants.LEFT);
		lblperimetro.setForeground(new Color(64, 0, 64));
		lblperimetro.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblperimetro.setBounds(216, 137, 80, 22);
		contentPane.add(lblperimetro);
		
		txtar = new JTextField();
		txtar.setForeground(new Color(222, 145, 255));
		txtar.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtar.setBounds(287, 77, 116, 20);
		contentPane.add(txtar);
		txtar.setColumns(10);
		txtar.setEditable(false);
		
		txtpe = new JTextField();
		txtpe.setForeground(new Color(222, 145, 255));
		txtpe.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtpe.setColumns(10);
		txtpe.setBounds(287, 139, 116, 20);
		contentPane.add(txtpe);
		txtpe.setEditable(false);
		
		JLabel lbln = new JLabel("PENTÁGONO");
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
				double lado=Double.parseDouble(txtlado.getText());
				f.setNombref(lbln.getText());
				f.setA(lado);
				f.setB(0);
				f.setC(0);
				double angulo=36;
				double tan=Math.toRadians(angulo);
				double apotema=(lado/2)/Math.tan(tan);
				perimetro=(lado*5);
				area=(perimetro*apotema)/2;
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
			txtlado.setText("");
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
}
}