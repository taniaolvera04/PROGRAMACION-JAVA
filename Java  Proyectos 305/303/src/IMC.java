import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class IMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtIMC;
	private JTextField txtStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setTitle("Calculadora de IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso (KG)");
		lblPeso.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setBounds(29, 21, 78, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura(M)");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		lblAltura.setBounds(29, 60, 78, 14);
		contentPane.add(lblAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(127, 19, 95, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(127, 58, 95, 20);
		contentPane.add(txtAltura);
		
		txtIMC = new JTextField();
		txtIMC.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtIMC.setHorizontalAlignment(SwingConstants.CENTER);
		txtIMC.setBounds(29, 143, 193, 29);
		contentPane.add(txtIMC);
		txtIMC.setVisible(false);
		
		txtStatus = new JTextField();
		txtStatus.setHorizontalAlignment(SwingConstants.CENTER);
		txtStatus.setFont(new Font("BIZ UDGothic", Font.BOLD, 13));
		txtStatus.setBounds(29, 199, 193, 29);
		contentPane.add(txtStatus);
		txtStatus.setVisible(false);
		
		JLabel lblimg = new JLabel("");
		lblimg.setHorizontalAlignment(SwingConstants.TRAILING);
		lblimg.setBounds(267, 47, 177, 161);
		contentPane.add(lblimg);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double p= Double.parseDouble(txtPeso.getText());
				double a=Double.parseDouble(txtAltura.getText());
				double imc=p/(a*a);
				DecimalFormat df=new DecimalFormat("#.00");
				txtIMC.setText("IMC: "+df.format(imc));
				txtIMC.setVisible(true);
				txtStatus.setVisible(true);
				
				if(imc<18.5) {
					txtStatus.setText("BAJO PESO");
					txtIMC.setBackground(new Color(128, 255, 255));
					txtStatus.setBackground(new Color(0, 223, 223));
				}else if(imc>=18.5 && imc<25) {
					txtStatus.setText("PESO NORMAL");
					txtIMC.setBackground(new Color(128, 255, 128));
					txtStatus.setBackground(new Color(0, 255, 64));
				}else if(imc>=25 && imc<30) {
					txtStatus.setText("SOBREPESO");
					txtIMC.setBackground(new Color(255, 255, 128));
					txtStatus.setBackground(new Color(255, 255, 0));
					
				}else if(imc>=30 && imc<35) {
					txtStatus.setText("OBESIDAD 1");
					txtIMC.setBackground(new Color(255, 188, 121));
					txtStatus.setBackground(new Color(255, 151, 47));
					
				}else if(imc>=35 && imc<40) {
					txtStatus.setText("OBESIDAD 2");
					txtIMC.setBackground(new Color(255, 145, 91));
					txtStatus.setBackground(new Color(255, 98, 21));
					
				}else {
					txtStatus.setText("OBESIDAD 3");
					txtIMC.setBackground(new Color(255, 128, 128));
					txtStatus.setBackground(new Color(255, 55, 55));
					
				}
			}
		});
		btnCalcular.setFont(new Font("BIZ UDGothic", Font.BOLD, 12));
		btnCalcular.setBounds(31, 107, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso.setText("");
				txtAltura.setText("");
				txtIMC.setText("");
				txtStatus.setText("");
				txtIMC.setBackground(new Color(255, 255, 255));
				txtStatus.setBackground(new Color(255, 255, 255));
				txtIMC.setVisible(false);
				txtStatus.setVisible(false);
			}
		});
		btnBorrar.setFont(new Font("BIZ UDGothic", Font.BOLD, 12));
		btnBorrar.setBounds(133, 108, 89, 23);
		contentPane.add(btnBorrar);
	}
}
