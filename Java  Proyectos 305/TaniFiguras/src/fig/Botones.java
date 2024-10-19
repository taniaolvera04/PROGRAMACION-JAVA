package fig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Botones extends JFrame {

	private JPanel contentPane;
	private JLabel lbldato1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botones frame = new Botones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}
	/**
	 * Create the frame.
	 */
	int ancho;
	int largo;

	private JTextField dato1;
	private JTextField dato2;
	private JTextField dato3;
	private JTextField txtid;
	public Botones() {
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 485, 526);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 225, 225));
		contentPane.setForeground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblimg = new JLabel("");
		lblimg.setBounds(20, 75, 218, 188);
		contentPane.add(lblimg);
		ancho=lblimg.getWidth();
		largo=lblimg.getHeight();
		
		JLabel lblNewLabel = new JLabel("FIGURA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(221, 0, 83));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(32, 22, 86, 35);
		contentPane.add(lblNewLabel);
		
		
		
		lbldato1 = new JLabel("");
		lbldato1.setHorizontalAlignment(SwingConstants.CENTER);
		lbldato1.setForeground(new Color(128, 0, 64));
		lbldato1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lbldato1.setBounds(30, 290, 194, 20);
		contentPane.add(lbldato1);
		lbldato1.setVisible(false);

		dato1 = new JTextField();
		dato1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		dato1.setBounds(250, 290, 111, 20);
		contentPane.add(dato1);
		dato1.setColumns(10);
		dato1.setVisible(false);
		
		JLabel lblpe = new JLabel("");
		lblpe.setHorizontalAlignment(SwingConstants.CENTER);
		lblpe.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		lblpe.setForeground(new Color(128, 0, 128));
		lblpe.setBackground(Color.WHITE);
		lblpe.setBounds(348, 187, 105, 23);
		contentPane.add(lblpe);
		lblpe.setVisible(false);

		JLabel lblar = new JLabel("");
		lblar.setHorizontalAlignment(SwingConstants.CENTER);
		lblar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		lblar.setForeground(new Color(128, 0, 128));
		lblar.setBackground(Color.WHITE);
		lblar.setBounds(342, 136, 111, 23);
		contentPane.add(lblar);
		lblar.setVisible(false);
		
		
		JLabel lbldato2 = new JLabel("");
		lbldato2.setHorizontalAlignment(SwingConstants.CENTER);
		lbldato2.setForeground(new Color(128, 0, 64));
		lbldato2.setBackground(new Color(255, 255, 255));
		lbldato2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lbldato2.setBounds(30, 333, 194, 20);
		contentPane.add(lbldato2);
		lbldato2.setVisible(false);

		dato2 = new JTextField();
		dato2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		dato2.setBounds(250, 333, 111, 20);
		contentPane.add(dato2);
		dato2.setColumns(10);
		dato2.setVisible(false);
		
		JLabel lblid = new JLabel("ID");
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setForeground(new Color(64, 0, 64));
		lblid.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		lblid.setBounds(338, 34, 45, 13);
		contentPane.add(lblid);
		
		txtid = new JTextField();
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		txtid.setForeground(new Color(0, 0, 64));
		txtid.setEnabled(false);
		txtid.setEditable(false);
		txtid.setBackground(new Color(255, 255, 255));
		txtid.setBounds(382, 31, 63, 19);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lbl1 = new JLabel("Área:");
		lbl1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		lbl1.setBounds(268, 136, 63, 23);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Perímetro:");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		lbl2.setBounds(234, 187, 111, 23);
		contentPane.add(lbl2);
		
		JLabel lbldato3 = new JLabel("");
		lbldato3.setHorizontalAlignment(SwingConstants.CENTER);
		lbldato3.setForeground(new Color(128, 0, 64));
		lbldato3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 14));
		lbldato3.setBounds(30, 371, 194, 20);
		contentPane.add(lbldato3);
		lbldato3.setVisible(false);

		dato3 = new JTextField();
		dato3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		dato3.setBounds(250, 371, 111, 20);
		contentPane.add(dato3);
		dato3.setColumns(10);
		dato3.setVisible(false);
		
		JComboBox cmbfig = new JComboBox();
		cmbfig.setForeground(new Color(121, 0, 46));
		cmbfig.setBackground(new Color(255, 255, 255));
		cmbfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int figura=cmbfig.getSelectedIndex();
				lbldato1.setVisible(false);
				dato1.setVisible(false);
				lbldato2.setVisible(false);
				dato2.setVisible(false);
				lbldato3.setVisible(false);
				dato3.setVisible(false);
				
				
				switch(figura) {
				case 0:
					lblimg.setVisible(true);
					lbldato1.setVisible(true);
					lbldato1.setText("LADO");
					dato1.setVisible(true);
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cuadrado.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					
					break;
					
				case 1:
					lblimg.setVisible(true);
					Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/circulo.png"));
					lblimg.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbldato1.setVisible(true);
					lbldato1.setText("RADIO");
					dato1.setVisible(true);
					break;
				case 2:
					lblimg.setVisible(true);
					Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/triangulo.png"));
					lblimg.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbldato1.setVisible(true);
					lbldato1.setText("LADO");
					dato1.setVisible(true);
					break;
				case 3:
					lblimg.setVisible(true);
					Image foto4=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rombo.png"));
					lblimg.setIcon(new ImageIcon(foto4.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbldato1.setVisible(true);
					lbldato1.setText("DIAGONAL MENOR");
					dato1.setVisible(true);
					dato3.setVisible(true);
					lbldato3.setVisible(true);
					lbldato3.setText("DIAGONAL MAYOR");
					break;
				case 4:
					lblimg.setVisible(true);
					Image foto5=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/trapecio.jpg"));
					lblimg.setIcon(new ImageIcon(foto5.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbldato1.setVisible(true);
					lbldato1.setText("BASE MENOR");
					dato1.setVisible(true);
					lbldato2.setVisible(true);
					lbldato2.setText("BASE MAYOR");
					dato2.setVisible(true);
					lbldato3.setVisible(true);
					lbldato3.setText("ALTURA");
					dato3.setVisible(true);
					break;
				case 5:
					lblimg.setVisible(true);
					Image foto6=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pentagono.png"));
					lblimg.setIcon(new ImageIcon(foto6.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbldato1.setVisible(true);
					lbldato1.setText("LADO");
					dato1.setVisible(true);
					break;
				case 6:
					lblimg.setVisible(true);
					Image foto7=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rectangulo.jpeg"));
					lblimg.setIcon(new ImageIcon(foto7.getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH)));
					lbldato1.setVisible(true);
					lbldato1.setText("BASE");
					dato1.setVisible(true);
					lbldato3.setVisible(true);
					lbldato3.setText("ALTURA");
					dato3.setVisible(true);
					break;
				}
				}
		});
		cmbfig.setModel(new DefaultComboBoxModel(new String[] {"CUADRADO", "CÍRCULO", "TRIÁNGULO EQUILÁTERO", "ROMBO", "TRAPECIO", "PENTÁGONO", "RECTÁNGULO"}));
		cmbfig.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		cmbfig.setBounds(133, 28, 195, 27);
		contentPane.add(cmbfig);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		btnConsultar.setForeground(new Color(196, 0, 103));
		btnConsultar.setBackground(new Color(255, 255, 255));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras f=new Figuras();
				
					try {
						int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a consultar"));
		                f.setIdf(id);

						if(f.consultar()) {

						JOptionPane.showMessageDialog(null, "Figura encontrada");
						txtid.setText(""+id);
						cmbfig.setSelectedItem(f.getNombref());
						dato1.setText(""+f.getA());
						dato2.setText(""+f.getB());
						dato3.setText(""+f.getC());
						lblar.setText(""+f.getArea());
						lblpe.setText(" "+f.getPerimetro());
						String op=(String)cmbfig.getSelectedItem();
						switch(op){
						case "CUADRADO":
						double lado=Double.parseDouble(dato1.getText());
						double ACua=lado*lado;
						double PCua=lado*4;
						lblar.setText(""+ACua);
						lblpe.setText(""+PCua);
						break;
						case "CÍRCULO":
							double radio=Double.parseDouble(dato1.getText());
							float ACir=(float) (Math.PI*(radio*radio));
							float PCir=(float) (Math.PI*(radio*2));
							lblar.setText(""+ACir);
							lblpe.setText(""+PCir);
							break;
						case "TRIÁNGULO EQUILÁTERO":
							double Lado=Double.parseDouble(dato1.getText());
							double base=(Lado/2);
							double a=Math.pow(Lado, 2);
							double b=Math.pow(base, 2);
							double res=a-b;
							double altura=Math.sqrt(res);
							float ATE=(float) (Lado*altura)/2;
							float PTE=(float) (Lado*3);
							lblar.setText(""+ATE);
							lblpe.setText(""+PTE);
							break;
						case "ROMBO":
							double DMA=Double.parseDouble(dato1.getText());
							double DME=Double.parseDouble(dato2.getText());
							if (DMA == DME){
								JOptionPane.showMessageDialog(null, "Valores incorrectos");
							}
							if (DMA < DME){
								JOptionPane.showMessageDialog(null, "Valores incorrectos");
							}
							else if (DMA > DME){
							double LADO=Math.sqrt(Math.pow(DMA, 2)+Math.pow(DME, 2));
							float AR=(float) (DMA*DME)/2;
							float PR=(float) (LADO*4)/2;
							lblar.setText(""+AR);
							lblpe.setText(""+PR);
							}break;
						case "TRAPECIO":
							double BMA=Double.parseDouble(dato1.getText());
							double BME=Double.parseDouble(dato2.getText());
							double Altura=Double.parseDouble(dato3.getText());

							if (BMA == BME){
								JOptionPane.showMessageDialog(null, "Valores incorrectos");
							}
							if (BMA < BME){
								JOptionPane.showMessageDialog(null, "Valores incorrectos");
							}
							else if (BMA > BME){
							double Base=(BMA-BME)/2;
							double b2=Math.pow(Base, 2);
							double h2=Math.pow(Altura, 2);
							double lad=Math.sqrt(h2+b2);
							float AT=(float) ((BMA+BME)*Altura)/2;
							float PT=(float) ((float) (lad*2)+BMA+BME);
							lblar.setText(""+AT);
							lblpe.setText(""+PT);
							}break;
						case "PENTÁGONO":
							double LadO=Double.parseDouble(dato1.getText());
							double angulo =36;
							double tan=Math.toRadians(angulo);
							double apotema=(LadO/2)/Math.tan(tan);
							float Pp=(float) (LadO*5);
							float Ap=(float) (Pp*apotema)/2;
							lblar.setText(""+Ap);
							lblpe.setText(""+Pp);
							break;
						case "RECTÁNGULO":
							
							double baseR=Double.parseDouble(dato1.getText());
							double alturaR=Double.parseDouble(dato2.getText());
							if (baseR == alturaR){
								JOptionPane.showMessageDialog(null, "Valores incorrectos");
							}else if (baseR != alturaR){
							float ARe=(float) (baseR*alturaR);
							float PRe=(float) ((float) (baseR*2)+(alturaR*2));
							lblar.setText(""+ARe);
							lblpe.setText(""+PRe);
							
							break;
							}
						}
						
						}else {

							JOptionPane.showMessageDialog(null, "La figura no existe");
							f.setNombref((String)cmbfig.getSelectedItem());
								
						}
					}catch (Exception e2) {


					}
				}
			
		});
		btnConsultar.setBounds(20, 445, 131, 23);
		contentPane.add(btnConsultar);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		btnLimpiar.setForeground(new Color(196, 0, 103));
		btnLimpiar.setBackground(new Color(255, 255, 255));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras f=new Figuras();
				cmbfig.setSelectedIndex(0);
				
				lbldato1.setText("");
				dato1.setVisible(false);;
				dato1.setText("");
				lblpe.setText("");
				lblar.setText("");
				
				lbldato2.setText("");
				dato2.setVisible(false);
				dato2.setText("");
				
				lbldato3.setText("");
				dato3.setVisible(false);
				dato3.setText("");
				
				
				
				Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
				lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH)));
			}
		});
		btnLimpiar.setBounds(331, 445, 114, 23);
		contentPane.add(btnLimpiar);		
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras f=new Figuras();
				String op=(String)cmbfig.getSelectedItem();
				switch(op){
				case "CUADRADO":
				double lado=Double.parseDouble(dato1.getText());
				f.setNombref((String)cmbfig.getSelectedItem());
				f.setA(Double.parseDouble(dato1.getText()));
				f.setB(0);
				f.setC(0);
				double ACua=lado*lado;
				double PCua=lado*4;
				lblar.setVisible(true);
				lblpe.setVisible(true);
				lblar.setText(""+ACua);
				lblpe.setText(""+PCua);
				
				f.setArea(Double.parseDouble(lblar.getText()));
				f.setPerimetro(Double.parseDouble(lblpe.getText()));
				break;
				case "CÍRCULO":
					double radio=Double.parseDouble(dato1.getText());
					f.setNombref((String)cmbfig.getSelectedItem());
					f.setA(Double.parseDouble(dato1.getText()));
					f.setB(0);
					f.setC(0);
					float ACir=(float) (Math.PI*(radio*radio));
					float PCir=(float) (Math.PI*(radio*2));
					lblar.setVisible(true);
					lblpe.setVisible(true);
					lblar.setText(""+ACir);
					lblpe.setText(""+PCir);
					
					f.setArea(Double.parseDouble(lblar.getText()));
					f.setPerimetro(Double.parseDouble(lblpe.getText()));
					break;
				case "TRIÁNGULO EQUILÁTERO":
					double Lado=Double.parseDouble(dato1.getText());
					double base=(Lado/2);
					double a=Math.pow(Lado, 2);
					double b=Math.pow(base, 2);
					double res=a-b;
					double altura=Math.sqrt(res);
					float ATE=(float) (Lado*altura)/2;
					float PTE=(float) (Lado*3);
					lblar.setVisible(true);
					lblpe.setVisible(true);
					lblar.setText(""+ATE);
					lblpe.setText(""+PTE);
					f.setNombref((String)cmbfig.getSelectedItem());
					f.setA(Double.parseDouble(dato1.getText()));
					f.setB(0);
					f.setC(0);
					f.setArea(Double.parseDouble(lblar.getText()));
					f.setPerimetro(Double.parseDouble(lblpe.getText()));
					break;
				case "ROMBO":
					double DMA=Double.parseDouble(dato1.getText());
					double DME=Double.parseDouble(dato2.getText());
					if (DMA == DME){
						JOptionPane.showMessageDialog(null, "Valores incorrectos");
					}
					if (DMA < DME){
						JOptionPane.showMessageDialog(null, "Valores incorrectos");
					}
					else if (DMA > DME){
					double LADO=Math.sqrt(Math.pow(DMA, 2)+Math.pow(DME, 2));
					float AR=(float) (DMA*DME)/2;
					float PR=(float) (LADO*4)/2;
					lblar.setVisible(true);
					lblpe.setVisible(true);
					lblar.setText(""+AR);
					lblpe.setText(""+PR);
										
					f.setNombref((String)cmbfig.getSelectedItem());
					f.setA(Double.parseDouble(dato1.getText()));
					f.setB(Double.parseDouble(dato2.getText()));
					f.setC(0);
					f.setArea(Double.parseDouble(lblar.getText()));
					f.setPerimetro(Double.parseDouble(lblpe.getText()));
					}break;
				case "TRAPECIO":
					double BMA=Double.parseDouble(dato1.getText());
					double BME=Double.parseDouble(dato2.getText());
					double Altura=Double.parseDouble(dato3.getText());

					if (BMA == BME){
						JOptionPane.showMessageDialog(null, "Valores incorrectos");
					}
					if (BMA < BME){
						JOptionPane.showMessageDialog(null, "Valores incorrectos");
					}
					else if (BMA > BME){
					double Base=(BMA-BME)/2;
					double b2=Math.pow(Base, 2);
					double h2=Math.pow(Altura, 2);
					double lad=Math.sqrt(h2+b2);
					float AT=(float) ((BMA+BME)*Altura)/2;
					float PT=(float) ((float) (lad*2)+BMA+BME);
					lblar.setVisible(true);
					lblpe.setVisible(true);
					lblar.setText(""+AT);
					lblpe.setText(""+PT);
					
					f.setNombref((String)cmbfig.getSelectedItem());
					f.setA(Double.parseDouble(dato1.getText()));
					f.setB(Double.parseDouble(dato2.getText()));
					f.setC(Double.parseDouble(dato3.getText()));
					f.setArea(Double.parseDouble(lblar.getText()));
					f.setPerimetro(Double.parseDouble(lblpe.getText()));
					}break;
				case "PENTÁGONO":
					double LadO=Double.parseDouble(dato1.getText());
					double angulo =36;
					double tan=Math.toRadians(angulo);
					double apotema=(LadO/2)/Math.tan(tan);
					float Pp=(float) (LadO*5);
					float Ap=(float) (Pp*apotema)/2;
					lblar.setVisible(true);
					lblpe.setVisible(true);
					lblar.setText(""+Ap);
					lblpe.setText(""+Pp);
					f.setNombref((String)cmbfig.getSelectedItem());
					f.setA(Double.parseDouble(dato1.getText()));
					f.setB(0);
					f.setC(0);
					f.setArea(Double.parseDouble(lblar.getText()));
					f.setPerimetro(Double.parseDouble(lblpe.getText()));
					break;
				case "RECTÁNGULO":
					
					double baseR=Double.parseDouble(dato1.getText());
					double alturaR=Double.parseDouble(dato2.getText());
					if (baseR == alturaR){
						JOptionPane.showMessageDialog(null, "Valores incorrectos");
					}else if (baseR != alturaR){
						f.setNombref((String)cmbfig.getSelectedItem());
						f.setA(Double.parseDouble(dato1.getText()));
						f.setB(Double.parseDouble(dato2.getText()));
						f.setC(0);
					float ARe=(float) (baseR*alturaR);
					float PRe=(float) ((float) (baseR*2)+(alturaR*2));
					lblar.setVisible(true);
					lblpe.setVisible(true);
					lblar.setText(""+ARe);
					lblpe.setText(""+PRe);
				
					
					f.setArea(Double.parseDouble(lblar.getText()));
					f.setPerimetro(Double.parseDouble(lblpe.getText()));
					break;
					}
				}
				f.setIdf(Integer.parseInt(txtid.getText()));
				f.setNombref((String)cmbfig.getSelectedItem());
				f.setA(Double.parseDouble(dato1.getText()));
				f.setB(Double.parseDouble(dato2.getText()));
				f.setC(Double.parseDouble(dato3.getText()));
				f.setArea(Double.parseDouble(lblar.getText()));
				f.setPerimetro(Double.parseDouble(lblpe.getText()));
					try {
						
						
						

						if(f.actualizar()) {
							
							JOptionPane.showMessageDialog(null, "Figura actualizada");


						}else {
							JOptionPane.showMessageDialog(null, "Error");
							
								
						}
								}catch (Exception e2) {


					
				
								}
			}
		});
		btnActualizar.setForeground(new Color(196, 0, 103));
		btnActualizar.setBounds(169, 446, 140, 21);
		contentPane.add(btnActualizar);
		
		
		
		
		
	
		


	}
}