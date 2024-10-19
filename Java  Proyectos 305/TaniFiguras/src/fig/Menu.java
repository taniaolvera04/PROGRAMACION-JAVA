package fig;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

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
	public Menu() {
		setTitle("MENÚ DE OPCIONES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 98);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("FIGURAS");
		mnNewMenu.setForeground(new Color(230, 0, 196));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cuadrado");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C c=new C();
				c.setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmCrculo = new JMenuItem("Círculo");
		mntmCrculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ci ci=new Ci();
				ci.setVisible(true);
				dispose();
			}
		});
		mntmCrculo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmCrculo);
		
		JMenuItem mntmRectngulo = new JMenuItem("Rectángulo");
		mntmRectngulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				R r=new R();
				r.setVisible(true);
				dispose();
			}
		});
		mntmRectngulo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmRectngulo);
		
		JMenuItem mntmRombo = new JMenuItem("Rombo");
		mntmRombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ro ro=new Ro();
				ro.setVisible(true);
				dispose();
			}
		});
		mntmRombo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmRombo);
		
		JMenuItem mntmTrapecio = new JMenuItem("Trapecio");
		mntmTrapecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				To to=new To();
				to.setVisible(true);
				dispose();
			}
		});
		mntmTrapecio.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmTrapecio);
		
		JMenuItem mntmPentgono = new JMenuItem("Pentágono");
		mntmPentgono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P p=new P();
				p.setVisible(true);
				dispose();
			}
		});
		mntmPentgono.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmPentgono);
		
		JMenuItem mntmTringuloEquiltero = new JMenuItem("Triángulo Equilátero");
		mntmTringuloEquiltero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tr t=new Tr();
				t.setVisible(true);
				dispose();
			}
		});
		mntmTringuloEquiltero.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnNewMenu.add(mntmTringuloEquiltero);
		
		JMenu mnConsultar = new JMenu("CONSULTAR");
		mnConsultar.setForeground(new Color(230, 0, 196));
		mnConsultar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		menuBar.add(mnConsultar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Botones bo=new Botones();
				bo.setVisible(true);
				dispose();
			}
		});
		mntmConsultar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnConsultar.add(mntmConsultar);
		
		JMenu mnModificar = new JMenu("MODIFICAR");
		mnModificar.setForeground(new Color(230, 0, 196));
		mnModificar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		menuBar.add(mnModificar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mntmModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Botones bo=new Botones();
				bo.setVisible(true);
				dispose();
			}
		});
		mntmModificar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnModificar.add(mntmModificar);
		
		JMenu mnEliminar = new JMenu("ELIMINAR");
		mnEliminar.setForeground(new Color(230, 0, 196));
		mnEliminar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		menuBar.add(mnEliminar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras f=new Figuras();
				try {
					int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID a eliminar "));
					f.setIdf(id);
					if(f.eliminar()) {
					JOptionPane.showMessageDialog(null, "Figura eliminada");
					}else {
					JOptionPane.showMessageDialog(null, "La figura no existe");		
					}
			}catch (Exception e2) {

			}
			}
		});
		mntmEliminar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnEliminar.add(mntmEliminar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 230, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
