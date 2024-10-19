import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class FigurasG extends JFrame {

	private JPanel contentPane;
	private JTextField txtar;
	private JTextField txtpe;
	private JTextField txtlado;
	private JTextField txtradio;
	private JTextField txtd;
	private JTextField txtD;
	private JTextField txtB;
	private JTextField txtb;
	private JTextField txtbase;
	private JTextField txtaltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FigurasG frame = new FigurasG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int ancho;
	int alto;
	public FigurasG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 464);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 207, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblfig = new JLabel("Figura");
		lblfig.setForeground(new Color(64, 0, 64));
		lblfig.setHorizontalAlignment(SwingConstants.CENTER);
		lblfig.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblfig.setBounds(81, 23, 95, 22);
		contentPane.add(lblfig);
		
		JLabel lbllado = new JLabel("Lado");
		lbllado.setForeground(new Color(128, 0, 128));
		lbllado.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lbllado.setHorizontalAlignment(SwingConstants.CENTER);
		lbllado.setBounds(126, 306, 46, 14);
		contentPane.add(lbllado);
		lbllado.setVisible(false);
		
		txtlado = new JTextField();
		txtlado.setForeground(new Color(255, 155, 255));
		txtlado.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtlado.setColumns(10);
		txtlado.setBounds(215, 304, 104, 20);
		contentPane.add(txtlado);
		txtlado.setVisible(false);
		
		JLabel lblradio = new JLabel("Radio");
		lblradio.setHorizontalAlignment(SwingConstants.CENTER);
		lblradio.setForeground(new Color(128, 0, 128));
		lblradio.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblradio.setBounds(126, 308, 46, 14);
		contentPane.add(lblradio);
		lblradio.setVisible(false);
		
		txtradio = new JTextField();
		txtradio.setForeground(new Color(255, 155, 255));
		txtradio.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtradio.setColumns(10);
		txtradio.setBounds(215, 305, 104, 20);
		contentPane.add(txtradio);
		txtradio.setVisible(false);
		
		JLabel lbld = new JLabel("Diagonal Menor");
		lbld.setHorizontalAlignment(SwingConstants.CENTER);
		lbld.setForeground(new Color(128, 0, 128));
		lbld.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lbld.setBounds(81, 264, 116, 22);
		contentPane.add(lbld);
		lbld.setVisible(false);
		
		JLabel lblD = new JLabel("Diagonal Mayor");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(new Color(128, 0, 128));
		lblD.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblD.setBounds(81, 341, 116, 22);
		contentPane.add(lblD);
		lblD.setVisible(false);
		
		txtd = new JTextField();
		txtd.setForeground(new Color(255, 155, 255));
		txtd.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtd.setColumns(10);
		txtd.setBounds(215, 266, 104, 20);
		contentPane.add(txtd);
		txtd.setVisible(false);
		
		txtD = new JTextField();
		txtD.setForeground(new Color(255, 155, 255));
		txtD.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtD.setColumns(10);
		txtD.setBounds(215, 343, 104, 20);
		contentPane.add(txtD);
		txtD.setVisible(false);
		
		JLabel lblb = new JLabel("Base Menor");
		lblb.setHorizontalAlignment(SwingConstants.CENTER);
		lblb.setForeground(new Color(128, 0, 128));
		lblb.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblb.setBounds(81, 264, 116, 22);
		contentPane.add(lblb);
		lblb.setVisible(false);
		
		JLabel lblB = new JLabel("Base Mayor");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setForeground(new Color(128, 0, 128));
		lblB.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblB.setBounds(81, 341, 116, 22);
		contentPane.add(lblB);
		lblB.setVisible(false);
		
		txtB = new JTextField();
		txtB.setForeground(new Color(255, 155, 255));
		txtB.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtB.setColumns(10);
		txtB.setBounds(215, 344, 104, 20);
		contentPane.add(txtB);
		txtB.setVisible(false);
		
		txtb = new JTextField();
		txtb.setForeground(new Color(255, 155, 255));
		txtb.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtb.setColumns(10);
		txtb.setBounds(215, 267, 104, 20);
		contentPane.add(txtb);
		txtb.setVisible(false);
		
		JLabel lblbase = new JLabel("Base");
		lblbase.setHorizontalAlignment(SwingConstants.CENTER);
		lblbase.setForeground(new Color(128, 0, 128));
		lblbase.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblbase.setBounds(81, 264, 116, 22);
		contentPane.add(lblbase);
		lblbase.setVisible(false);
		
		txtbase = new JTextField();
		txtbase.setForeground(new Color(255, 155, 255));
		txtbase.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtbase.setColumns(10);
		txtbase.setBounds(215, 267, 104, 20);
		contentPane.add(txtbase);
		txtbase.setVisible(false);
		
		
		txtaltura = new JTextField();
		txtaltura.setForeground(new Color(255, 155, 255));
		txtaltura.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtaltura.setColumns(10);
		txtaltura.setBounds(215, 344, 104, 20);
		contentPane.add(txtaltura);
		txtaltura.setVisible(false);
		
		JLabel lblaltura = new JLabel("Altura");
		lblaltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblaltura.setForeground(new Color(128, 0, 128));
		lblaltura.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblaltura.setBounds(81, 341, 116, 22);
		contentPane.add(lblaltura);
		lblaltura.setVisible(false);
		
		
		JLabel lblimg = new JLabel(" ");
		lblimg.setBounds(45, 72, 199, 181);
		contentPane.add(lblimg);
		ancho=lblimg.getWidth();
		alto=lblimg.getHeight();
		lblimg.setVisible(false);
		
		
		JComboBox cmbfig = new JComboBox();
		cmbfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int figura=cmbfig.getSelectedIndex();
				lbllado.setVisible(false);
				txtlado.setVisible(false);
				lblradio.setVisible(false);
				txtradio.setVisible(false);
				lbld.setVisible(false);
				txtd.setVisible(false);
				lblD.setVisible(false);
				txtD.setVisible(false);
				lblB.setVisible(false);
				txtB.setVisible(false);
				lblb.setVisible(false);
				txtb.setVisible(false);
				lblbase.setVisible(false);
				txtbase.setVisible(false);
				lblaltura.setVisible(false);
				txtaltura.setVisible(false);
				lblimg.setVisible(false);
				
				switch(figura) {
				case 0:
					lblimg.setVisible(true);
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cuadrado.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbllado.setVisible(true);
					txtlado.setVisible(true);
					break;
					
				case 1:
					lblimg.setVisible(true);
					Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/circulo.png"));
					lblimg.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lblradio.setVisible(true);
					txtradio.setVisible(true);
					break;
				case 2:
					lblimg.setVisible(true);
					Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/triangulo.png"));
					lblimg.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbllado.setVisible(true);
					txtlado.setVisible(true);
					break;
				case 3:
					lblimg.setVisible(true);
					Image foto4=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rombo.png"));
					lblimg.setIcon(new ImageIcon(foto4.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbld.setVisible(true);
					txtd.setVisible(true);
					lblD.setVisible(true);
					txtD.setVisible(true);
					break;
				case 4:
					lblimg.setVisible(true);
					Image foto5=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/trapecio.jpg"));
					lblimg.setIcon(new ImageIcon(foto5.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lblB.setVisible(true);
					txtB.setVisible(true);
					lblb.setVisible(true);
					txtb.setVisible(true);
					break;
				case 5:
					lblimg.setVisible(true);
					Image foto6=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pentagono.png"));
					lblimg.setIcon(new ImageIcon(foto6.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbllado.setVisible(true);
					txtlado.setVisible(true);
					break;
				case 6:
					lblimg.setVisible(true);
					Image foto7=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rectangulo.jpeg"));
					lblimg.setIcon(new ImageIcon(foto7.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lblbase.setVisible(true);
					txtbase.setVisible(true);
					lblaltura.setVisible(true);
					txtaltura.setVisible(true);
					break;
				}
			}
		});
		cmbfig.setMaximumRowCount(7);
		cmbfig.setModel(new DefaultComboBoxModel(new String[] {"Cuadrado", "Círculo", "Triángulo Equilátero", "Rombo", "Trapecio", "Pentágono", "Rectángulo"}));
		cmbfig.setSelectedIndex(0);
		cmbfig.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		cmbfig.setForeground(new Color(91, 63, 254));
		cmbfig.setBounds(186, 25, 178, 22);
		contentPane.add(cmbfig);
		
		
		JLabel lblarea = new JLabel("Área");
		lblarea.setHorizontalAlignment(SwingConstants.LEFT);
		lblarea.setForeground(new Color(64, 0, 64));
		lblarea.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblarea.setBounds(258, 110, 61, 22);
		contentPane.add(lblarea);
		
		JLabel lblperimetro = new JLabel("Perímetro");
		lblperimetro.setHorizontalAlignment(SwingConstants.LEFT);
		lblperimetro.setForeground(new Color(64, 0, 64));
		lblperimetro.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblperimetro.setBounds(254, 168, 80, 22);
		contentPane.add(lblperimetro);
		
		txtar = new JTextField();
		txtar.setForeground(new Color(222, 145, 255));
		txtar.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtar.setBounds(334, 113, 116, 20);
		contentPane.add(txtar);
		txtar.setColumns(10);
		
		txtpe = new JTextField();
		txtpe.setForeground(new Color(222, 145, 255));
		txtpe.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtpe.setColumns(10);
		txtpe.setBounds(334, 171, 116, 20);
		contentPane.add(txtpe);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String figura=(String)cmbfig.getSelectedItem();
				double area=0, perimetro=0;
				if (figura=="Cuadrado") {
					double lado=Double.parseDouble(txtlado.getText());
					area=(lado*lado);
					perimetro=(lado*4);
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				} else if (figura=="Círculo") {
					double radio=Double.parseDouble(txtradio.getText());
					area=(3.1416)*(Math.pow(radio, 2));
					perimetro=(2)*(3.1416)*radio;
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				}  else if (figura=="Triángulo Equilátero") {
					double lado=Double.parseDouble(txtlado.getText());
					double base=(lado/2);
					double rcl=Math.pow(lado,2);
					double rcb=+Math.pow(base,2);
					double altura=Math.sqrt(rcl-rcb);
					area=(base*altura)/2;		
					perimetro=lado*3;
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				} else if (figura=="Rombo") {
					double d=Double.parseDouble(txtd.getText());
					double D=Double.parseDouble(txtD.getText());
					double lado=Math.sqrt(Math.pow(D, 2) + Math.pow(d,2));
					area=(D*d)/2;
					perimetro=(lado*4)/2;
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				} else if (figura=="Trapecio") {
					double b=Double.parseDouble(txtb.getText());
					double B=Double.parseDouble(txtB.getText());
					double base=(B-b)/2;
					double altura=(B-b);
					double h2=Math.pow(altura, 2);
					double b2=Math.pow(base, 2);
					double lado=Math.sqrt(h2+b2);
					area=((B+b)/2)*altura;
					perimetro=(lado*2)+B+b;
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				} else if (figura=="Pentágono") {
					double lado=Double.parseDouble(txtlado.getText());
					double angulo=36;
					double tan=Math.toRadians(angulo);
					double apotema=(lado/2)/Math.tan(tan);
					perimetro=(lado*5);
					area=(perimetro*apotema)/2;
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				} else if (figura=="Rectángulo") {
					double base=Double.parseDouble(txtbase.getText());
					double altura=Double.parseDouble(txtaltura.getText());
					area=(base*altura);
					perimetro=(base+base+altura+altura);
					DecimalFormat df=new DecimalFormat("#.00");
					txtar.setText(""+df.format(area));
					txtpe.setText(""+df.format(perimetro));
				}
			}
		});
		btnCalcular.setForeground(new Color(156, 0, 223));
		btnCalcular.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btnCalcular.setBounds(114, 391, 95, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtar.setText("");
				txtpe.setText("");
				cmbfig.setSelectedItem("Cuadrado");
					lbllado.setVisible(false);
					txtlado.setVisible(false);
					lblradio.setVisible(false);
					txtlado.setVisible(false);
					lbllado.setVisible(false);
					txtlado.setVisible(false);
					lbld.setVisible(false);
					txtd.setVisible(false);
					lblD.setVisible(false);
					txtD.setVisible(false);
					lblB.setVisible(false);
					txtB.setVisible(false);
					lblb.setVisible(false);
					txtb.setVisible(false);
			  		lbllado.setVisible(false);
					txtlado.setVisible(false);
					lblbase.setVisible(false);
					txtbase.setVisible(false);
					lblaltura.setVisible(false);
					txtaltura.setVisible(false);
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					
			}
		});
		btnLimpiar.setForeground(new Color(156, 0, 223));
		btnLimpiar.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btnLimpiar.setBounds(258, 391, 95, 23);
		contentPane.add(btnLimpiar);
		
		
		
		
	}
}
