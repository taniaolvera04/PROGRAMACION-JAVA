import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcalculadora = new JLabel("Calculadora");
		lblcalculadora.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		lblcalculadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblcalculadora.setBounds(176, 11, 77, 14);
		contentPane.add(lblcalculadora);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(37, 54, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
