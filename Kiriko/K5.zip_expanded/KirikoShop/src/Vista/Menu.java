package Vista;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import desplazable.Desface;


public class Menu extends JFrame {

	private JPanel panel1;
	private JPanel MenuPlegable;
	int ancho, alto;
	private JLabel logo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {  
				try {
					Menu frame = new Menu();
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
	Desface desplace;
	private JLabel lbldt;
	private JPanel panel;
	public Menu() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				panel1.setSize(new Dimension(panel1.getWidth(), getWidth()));
				panel1.setSize(new Dimension(panel1.getHeight(), getHeight()));
				MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), getWidth()));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuD.class.getResource("/img/1697592790252.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 683);
		panel1 = new JPanel();
		panel1.setBackground(new Color(0, 0, 0));
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(panel1);
		panel1.setLayout(null);
		 desplace = new Desface();
		
		MenuPlegable = new JPanel();
		MenuPlegable.setBackground(new Color(45, 45, 45));
		MenuPlegable.setBounds(0, 0, 237, 644);
		panel1.add(MenuPlegable);
		MenuPlegable.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(58, 58, 58));
		panel.setBounds(262, 140, 512, 436);
		panel1.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel da = new JLabel("");
		da.setHorizontalAlignment(SwingConstants.CENTER);
		da.setForeground(Color.WHITE);
		da.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 23));
		da.setBorder(null);
		da.setBounds(170, 362, 332, 134);
		panel.add(da);
		
		
		

		
		
		JLabel menu = new JLabel("");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        if (MenuPlegable.getX() == 0) {
		            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 10);
		        } else if (MenuPlegable.getX() == -170) {
		            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 10);
		        } 
			}
		});
		menu.setHorizontalAlignment(SwingConstants.RIGHT);
		menu.setIcon(new ImageIcon(MenuD.class.getResource("/img/bame.png")));
		menu.setBounds(162, 0, 58, 40);
		MenuPlegable.add(menu);
		
		JLabel home = new JLabel("HOME  ");
		home.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		home.setHorizontalTextPosition(SwingConstants.LEADING);
		home.setIcon(new ImageIcon(MenuD.class.getResource("/img/home.png")));
		home.setForeground(new Color(255, 255, 255));
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		home.setHorizontalAlignment(SwingConstants.RIGHT);
		home.setBounds(10, 58, 210, 48);
		MenuPlegable.add(home);
		
		JLabel merch = new JLabel("MERCANCÍA DISPONIBLE   ");
		merch.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		merch.setHorizontalTextPosition(SwingConstants.LEADING);
		merch.setForeground(new Color(255, 255, 255));
		merch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProductoU p=new ProductoU();
				p.setVisible(true);
				dispose();
			}
		});
		merch.setIcon(new ImageIcon(MenuD.class.getResource("/img/me.png")));
		merch.setHorizontalAlignment(SwingConstants.LEFT);
		merch.setBounds(10, 127, 238, 60);
		MenuPlegable.add(merch);
		
		JLabel ventas = new JLabel("CONSULTAR VENTAS");
		ventas.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		ventas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V v=new V();
				v.setVisible(true);
				dispose();;
			}
		});
		ventas.setIcon(new ImageIcon(MenuD.class.getResource("/img/v.png")));
		ventas.setHorizontalTextPosition(SwingConstants.LEADING);
		ventas.setHorizontalAlignment(SwingConstants.RIGHT);
		ventas.setForeground(new Color(255, 255, 255));
		ventas.setBounds(3, 216, 217, 48);
		MenuPlegable.add(ventas);
		
		JLabel registrar = new JLabel("REGISTRAR VENTAS  ");
		registrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		registrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentasU v=new VentasU();
				v.setVisible(true);
				dispose();
			}
		});
		registrar.setIcon(new ImageIcon(MenuD.class.getResource("/img/rventas.png")));
		registrar.setHorizontalTextPosition(SwingConstants.LEADING);
		registrar.setHorizontalAlignment(SwingConstants.RIGHT);
		registrar.setForeground(new Color(255, 255, 255));
		registrar.setBounds(3, 304, 217, 48);
		MenuPlegable.add(registrar);
		
		JLabel proveedores = new JLabel("PROVEEDORES ");
		proveedores.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		proveedores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProvU mp=new ProvU();
				mp.setVisible(true);
				dispose();
			}
		});
	proveedores.setIcon(new ImageIcon(MenuD.class.getResource("/img/prov.png")));
		proveedores.setHorizontalTextPosition(SwingConstants.LEADING);
		proveedores.setHorizontalAlignment(SwingConstants.RIGHT);
		proveedores.setForeground(new Color(255, 255, 255));
		proveedores.setBounds(10, 388, 217, 48);
		MenuPlegable.add(proveedores);
		
		JLabel cerrarsesion = new JLabel("CERRAR SESIÓN  ");
		cerrarsesion.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		cerrarsesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login window=new Login();
				window.PL.setVisible(true);
				dispose();
			}
		});
		cerrarsesion.setIcon(new ImageIcon(MenuD.class.getResource("/img/cerrar.png")));
		cerrarsesion.setHorizontalTextPosition(SwingConstants.LEADING);
		cerrarsesion.setHorizontalAlignment(SwingConstants.RIGHT);
		cerrarsesion.setForeground(new Color(255, 255, 255));
		cerrarsesion.setBounds(10, 556, 217, 48);
		MenuPlegable.add(cerrarsesion);
		
		JLabel correos = new JLabel("ENVIAR CORREOS ");
		correos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Correo c=new Correo();
				c.setVisible(true);
				dispose();
			}
		});
		correos.setIcon(new ImageIcon(MenuD.class.getResource("/img/correos.png")));
		correos.setHorizontalTextPosition(SwingConstants.LEADING);
		correos.setHorizontalAlignment(SwingConstants.RIGHT);
		correos.setForeground(Color.WHITE);
		correos.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		correos.setBounds(10, 469, 217, 48);
		MenuPlegable.add(correos);
		
		JLabel usu = new JLabel("");
		usu.setBounds(707, 33, 76, 76);
		panel1.add(usu);
		ancho=usu.getWidth();
		alto=usu.getHeight();
		Image foto3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/usu.jpg"));
		usu.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		
		JLabel pa = new JLabel("PAPELERÍA KIRIKOSHOP");
		pa.setBorder(null);
		pa.setHorizontalAlignment(SwingConstants.CENTER);
		pa.setForeground(new Color(255, 255, 255));
		pa.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		pa.setBounds(411, 44, 261, 44);
		panel1.add(pa);
		
		JLabel creditos = new JLabel("©2023 Creado y diseñado por Blueberry Corporation.");
		creditos.setBackground(new Color(60, 60, 60));
		creditos.setHorizontalAlignment(SwingConstants.CENTER);
		creditos.setForeground(new Color(63, 63, 63));
		creditos.setFont(new Font("Dialog", Font.BOLD, 12));
		creditos.setBounds(383, 587, 305, 31);
		panel1.add(creditos);
		
		
	}
}
