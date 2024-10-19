import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AngulosF extends JFrame {

	private JPanel contentPane;
	private JTextField ang;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AngulosF frame = new AngulosF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int ancho;
	int alto;

	/**
	 * Create the frame.
	 */
	public AngulosF() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ ELEKTRA\\Downloads\\Fresitas.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 230, 242));
		panel.setBounds(0, 0, 527, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNomPro = new JLabel("\"Tipos de Ángulos\"");
		lblNomPro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomPro.setForeground(new Color(208, 68, 68));
		lblNomPro.setFont(new Font("Rolling Love", Font.PLAIN, 20));
		lblNomPro.setBounds(192, 11, 153, 14);
		panel.add(lblNomPro);
		
		JLabel lblGrados = new JLabel("Grados");
		lblGrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrados.setForeground(new Color(255, 138, 138));
		lblGrados.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 15));
		lblGrados.setBounds(32, 64, 153, 14);
		panel.add(lblGrados);
		
		
		
		
		
		JLabel lblimg = new JLabel("");
		lblimg.setBounds(53, 97, 256, 135);
		panel.add(lblimg);
		ancho=lblimg.getWidth();
		alto=lblimg.getHeight();
		
		
		
		
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 13));
		spinner.setForeground(new Color(255, 128, 128));
		spinner.setBounds(157, 59, 65, 27);
		panel.add(spinner);
		
		ang = new JTextField();
		ang.setHorizontalAlignment(SwingConstants.CENTER);
		ang.setForeground(new Color(255, 128, 128));
		ang.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		ang.setBounds(161, 250, 184, 27);
		panel.add(ang);
		ang.setColumns(10);
		
		
		
		
		
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int angulo=(Integer)spinner.getValue();
				
				
				if(angulo>0 && angulo<90) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Angulo_agudo.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					ang.setText("Ángulo Agudo");
				}
				
				if(angulo==90) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Angulo_recto.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					ang.setText("Ángulo Recto");
				}
				
				if(angulo>90 && angulo<180) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Angulo_obtuso.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					ang.setText("Ángulo Obtuso");
				}
				
				if(angulo==180) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Angulo_llano.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					ang.setText("Ángulo Llano");
				}
				
				if(angulo>180 && angulo<360) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Angulo_concavo.png"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					ang.setText("Ángulo Concavo");
				}
				
				if(angulo==360) {
					Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Angulo_completo.jpg"));
					lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
					ang.setText("Ángulo Completo");
				}
				
			}
			
			
			
			
			
		});
		btnEvaluar.setBackground(new Color(255, 255, 255));
		btnEvaluar.setForeground(new Color(255, 128, 128));
		btnEvaluar.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 15));
		btnEvaluar.setBounds(351, 88, 116, 27);
		panel.add(btnEvaluar);
		
		
		
		
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
				lblimg.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
				ang.setText("");
				spinner.setValue(0);
			}
			
			
			
			
			
		});
		btnLimpiar.setForeground(new Color(255, 128, 128));
		btnLimpiar.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 15));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(351, 154, 116, 27);
		panel.add(btnLimpiar);
		
	}
}
