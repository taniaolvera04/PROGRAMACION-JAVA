package lug;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class LugaresT extends JFrame {



	static JTabbedPane pestañas;

	static JPanel panel1;

	static JPanel canada;

	static JMenuBar menuBar;

	static JMenu mnNewMenu;

	static JMenu mnMen;

	private JButton btnJapon;

	private JButton btnCanada;

	private JButton btnChina;

	private JButton btnCorea;

	private JPanel cn1;

	private JPanel cn2;

	private JPanel cn3;

	private JLabel lblcn1;

	private JLabel lblUbicacin;

	private JPanel corea;

	private JPanel co1;

	private JLabel lblco1;

	private JLabel lblco2;

	private JPanel co3;

	private JPanel japon;

	private JPanel co1_1;

	private JLabel lbljp1;

	private JLabel lbljp2;

	private JPanel co2_1;

	private JPanel china;

	private JPanel ch1;

	private JLabel lblch1;

	private JLabel lblch2;

	private JPanel ch2;
	private JLabel lblchapleauNaturePreserve;
	private JLabel img;

	

/**

* Launch the application.

*/

public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

LugaresT frame = new LugaresT();

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

int ancho, alto;
private JLabel lblcmoLlegarEn;
private JLabel lblvolarisIda;
private JLabel lblamericanAirlinesIda;
private JLabel lblIdaH;
private JLabel lblIdaHrs;
private JLabel lblHotelesRecomendados;
private JLabel lblapolloMoteldesde;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_2;
private JPanel cn3_2;
private JLabel lblcmoLlegarEn_2;
private JLabel lblvolarisIda_2;
private JLabel lblamericanAirlinesIda_2;
private JLabel lblIdaH_2;
private JLabel lblIdaHrs_2;
private JLabel lblHotelesRecomendados_2;
private JLabel lbllakeviewHoteldesde_2;
private JLabel lblapolloMoteldesde_2;
private JLabel img3;
private JLabel lblNewLabel_3;
private JLabel lblNewLabel_4;
private JLabel img4;
private JLabel lbllaGranMuralla;
private JLabel lbltemploDelCielo;
private JPanel cn3_3;
private JLabel lblcmoLlegarEn_3;
private JLabel lblvolarisIda_3;
private JLabel lblamericanAirlinesIda_3;
private JLabel lblIdaH_3;
private JLabel lblIdaHrs_3;
private JLabel lblHotelesRecomendados_3;
private JLabel lbllakeviewHoteldesde_3;
private JLabel lblapolloMoteldesde_3;

public LugaresT() {

getContentPane().setBackground(new Color(255, 255, 255));

setTitle("LUGARES TURÍSTICOS");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 862, 563);

getContentPane().setLayout(null);

getContentPane().setLayout(null);

getContentPane().setLayout(null);



JPanel panel = new JPanel();

panel.setBackground(new Color(255, 255, 255));

panel.setBounds(0, 0, 848, 79);

getContentPane().add(panel);

panel.setLayout(null);



JToolBar toolBar = new JToolBar();

toolBar.setBounds(0, 0, 848, 79);

toolBar.setBackground(new Color(251, 234, 255));

panel.add(toolBar);



 btnCanada = new JButton("CANADÁ");

 btnCanada.addActionListener((ActionListener) new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	pestañas.setSelectedComponent(canada);
}

 });

btnCanada.setIcon(new ImageIcon(LugaresT.class.getResource("/img/cnd.png")));

btnCanada.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

toolBar.add(btnCanada);



 btnCorea = new JButton(" COREA DEL SUR");

 btnCorea.addActionListener(new ActionListener() {

 public void actionPerformed(ActionEvent e) {

 pestañas.setSelectedComponent(corea);

 }

 });

btnCorea.setIcon(new ImageIcon(LugaresT.class.getResource("/img/ko.png")));

btnCorea.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

toolBar.add(btnCorea);



btnJapon = new JButton("JAPÓN");

btnJapon.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {

	pestañas.setSelectedComponent(japon);

	}

});

btnJapon.setIcon(new ImageIcon(LugaresT.class.getResource("/img/jap.png")));

btnJapon.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

toolBar.add(btnJapon);



 btnChina = new JButton("CHINA");

 btnChina.addActionListener(new ActionListener() {

 public void actionPerformed(ActionEvent e) {

 pestañas.setSelectedComponent(china);

 }

 });

btnChina.setIcon(new ImageIcon(LugaresT.class.getResource("/img/ch.png")));

btnChina.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

toolBar.add(btnChina);



panel1 = new JPanel();

panel1.setBackground(new Color(236, 247, 255));

panel1.setBounds(0, 75, 848, 422);

getContentPane().add(panel1);

panel1.setLayout(null);



 pestañas = new JTabbedPane(JTabbedPane.BOTTOM);

pestañas.setBounds(10, 11, 828, 400);

pestañas.setFont(new Font("Segoe UI", Font.BOLD, 13));

panel1.add(pestañas);





canada = new JPanel();

canada.setBackground(new Color(243, 206, 255));

pestañas.addTab("CANADÁ", null, canada, null);

canada.setLayout(null);

cn1 = new JPanel();

cn1.setBorder(new LineBorder(new Color(255, 72, 72), 2, true));

cn1.setBackground(new Color(255, 119, 122));

cn1.setBounds(47, 11, 723, 54);

canada.add(cn1);

cn1.setLayout(null);

lblcn1 = new JLabel("LUGAR: ONTARIO\r\n");

lblcn1.setForeground(new Color(255, 255, 255));

lblcn1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lblcn1.setBounds(50, 11, 202, 32);

cn1.add(lblcn1);

lblUbicacin = new JLabel("UBICACIÓN: NORTEAMÉRICA");

lblUbicacin.setForeground(Color.WHITE);

lblUbicacin.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lblUbicacin.setBounds(394, 11, 235, 32);

cn1.add(lblUbicacin);

cn2 = new JPanel();

cn2.setBorder(new LineBorder(new Color(255, 72, 72), 2, true));

cn2.setBackground(new Color(255, 119, 122));

cn2.setBounds(72, 87, 302, 259);

canada.add(cn2);

cn2.setLayout(null);







img = new JLabel("");
img.setBounds(54, 10, 204, 153);
ancho=img.getWidth();
alto=img.getHeight();
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cn.jpg"));
img.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
cn2.add(img);






JLabel lblNewLabel = new JLabel("—Cataratas del Niágara, St Catharines\r\n");
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setForeground(new Color(255, 255, 255));
lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblNewLabel.setBounds(10, 168, 282, 47);
cn2.add(lblNewLabel);
lblchapleauNaturePreserve = new JLabel("—Chapleau Nature Preserve (auroras boreales)");
lblchapleauNaturePreserve.setHorizontalAlignment(SwingConstants.CENTER);
lblchapleauNaturePreserve.setForeground(Color.WHITE);
lblchapleauNaturePreserve.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblchapleauNaturePreserve.setBounds(10, 201, 282, 47);
cn2.add(lblchapleauNaturePreserve);

cn3 = new JPanel();

cn3.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));

cn3.setBackground(new Color(249, 232, 255));

cn3.setBounds(435, 87, 320, 259);

canada.add(cn3);

cn3.setLayout(null);
lblcmoLlegarEn = new JLabel("¿Cómo llegar? En avión, desde CDMX a través de:\r\n");
lblcmoLlegarEn.setHorizontalAlignment(SwingConstants.CENTER);
lblcmoLlegarEn.setForeground(new Color(0, 0, 0));
lblcmoLlegarEn.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblcmoLlegarEn.setBounds(10, 10, 310, 33);
cn3.add(lblcmoLlegarEn);
lblvolarisIda = new JLabel("VOLARIS\r\n");
lblvolarisIda.setHorizontalAlignment(SwingConstants.CENTER);
lblvolarisIda.setForeground(new Color(200, 0, 90));
lblvolarisIda.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblvolarisIda.setBounds(10, 39, 310, 33);
cn3.add(lblvolarisIda);
lblamericanAirlinesIda = new JLabel("AMERICAN AIRLINES\r\n");
lblamericanAirlinesIda.setHorizontalAlignment(SwingConstants.CENTER);
lblamericanAirlinesIda.setForeground(new Color(200, 0, 90));
lblamericanAirlinesIda.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblamericanAirlinesIda.setBounds(10, 82, 310, 55);
cn3.add(lblamericanAirlinesIda);
lblIdaH = new JLabel("Ida  (7 h 40 min) Regreso (6 h 51 min)  Costo:  $11,133\r\n");
lblIdaH.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaH.setForeground(Color.BLACK);
lblIdaH.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaH.setBounds(0, 110, 320, 55);
cn3.add(lblIdaH);
lblIdaHrs = new JLabel("Ida  (7 hrs) Regreso (6 hrs)  Costo:  $8,049\r\n");
lblIdaHrs.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaHrs.setForeground(Color.BLACK);
lblIdaHrs.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaHrs.setBounds(10, 67, 310, 33);
cn3.add(lblIdaHrs);
lblHotelesRecomendados = new JLabel("HOTELES RECOMENDADOS");
lblHotelesRecomendados.setHorizontalAlignment(SwingConstants.CENTER);
lblHotelesRecomendados.setForeground(Color.BLACK);
lblHotelesRecomendados.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
lblHotelesRecomendados.setBounds(10, 148, 310, 33);
cn3.add(lblHotelesRecomendados);
JLabel lbllakeviewHoteldesde = new JLabel("—Lakeview Hotel (Desde $1,498 por noche)\r\n\r\n");
lbllakeviewHoteldesde.setHorizontalAlignment(SwingConstants.CENTER);
lbllakeviewHoteldesde.setForeground(new Color(200, 0, 90));
lbllakeviewHoteldesde.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lbllakeviewHoteldesde.setBounds(0, 176, 320, 33);
cn3.add(lbllakeviewHoteldesde);
lblapolloMoteldesde = new JLabel("—Apollo Motel (Desde $1,368)\r\n");
lblapolloMoteldesde.setHorizontalAlignment(SwingConstants.CENTER);
lblapolloMoteldesde.setForeground(new Color(200, 0, 90));
lblapolloMoteldesde.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblapolloMoteldesde.setBounds(0, 215, 320, 33);
cn3.add(lblapolloMoteldesde);





corea = new JPanel();

corea.setLayout(null);

corea.setBackground(new Color(243, 206, 255));

pestañas.addTab("COREA DEL SUR", null, corea, null);

co1 = new JPanel();

co1.setBorder(new LineBorder(new Color(65, 55, 253), 2, true));

co1.setLayout(null);

co1.setBackground(new Color(111, 114, 255));

co1.setBounds(47, 11, 723, 54);

corea.add(co1);

lblco1 = new JLabel("LUGAR: SEÚL");

lblco1.setForeground(Color.WHITE);

lblco1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lblco1.setBounds(51, 11, 119, 32);

co1.add(lblco1);

lblco2 = new JLabel("UBICACIÓN: ASIA");

lblco2.setForeground(Color.WHITE);

lblco2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lblco2.setBounds(376, 11, 150, 32);
co1.add(lblco2);
co3 = new JPanel();
co3.setBorder(new LineBorder(new Color(255, 72, 72), 2, true));
co3.setLayout(null);
co3.setBackground(new Color(255, 119, 122));
co3.setBounds(79, 87, 302, 259);
corea.add(co3);



JLabel img2 = new JLabel("");
img2.setBounds(43, 11, 204, 153);
ancho=img2.getWidth();
alto=img2.getHeight();
Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/co.jpg"));
img2.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
co3.add(img2);



lblNewLabel_1 = new JLabel("—Gyeongbokgung-Palace\r\n\r\n");
lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1.setForeground(Color.WHITE);
lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_1.setBounds(10, 172, 282, 47);
co3.add(lblNewLabel_1);
lblNewLabel_2 = new JLabel("—Río Han");
lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_2.setForeground(Color.WHITE);
lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_2.setBounds(10, 201, 282, 47);
co3.add(lblNewLabel_2);
JPanel cn3_1 = new JPanel();
cn3_1.setLayout(null);
cn3_1.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
cn3_1.setBackground(new Color(249, 232, 255));
cn3_1.setBounds(430, 87, 320, 259);
corea.add(cn3_1);
JLabel lblcmoLlegarEn_1 = new JLabel("¿Cómo llegar? En avión, con escala desde:\r\n");
lblcmoLlegarEn_1.setHorizontalAlignment(SwingConstants.CENTER);
lblcmoLlegarEn_1.setForeground(Color.BLACK);
lblcmoLlegarEn_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblcmoLlegarEn_1.setBounds(10, 10, 310, 33);
cn3_1.add(lblcmoLlegarEn_1);
JLabel lblvolarisIda_1 = new JLabel("AEROMÉXICO");
lblvolarisIda_1.setHorizontalAlignment(SwingConstants.CENTER);
lblvolarisIda_1.setForeground(new Color(200, 0, 90));
lblvolarisIda_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblvolarisIda_1.setBounds(10, 39, 310, 33);
cn3_1.add(lblvolarisIda_1);
JLabel lblamericanAirlinesIda_1 = new JLabel("TURKISH AIRLINES");
lblamericanAirlinesIda_1.setHorizontalAlignment(SwingConstants.CENTER);
lblamericanAirlinesIda_1.setForeground(new Color(200, 0, 90));
lblamericanAirlinesIda_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblamericanAirlinesIda_1.setBounds(10, 82, 310, 55);
cn3_1.add(lblamericanAirlinesIda_1);
JLabel lblIdaH_1 = new JLabel("Viaje Redondo (15 h 50 min) Costo: $25,083");
lblIdaH_1.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaH_1.setForeground(Color.BLACK);
lblIdaH_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaH_1.setBounds(0, 110, 320, 55);
cn3_1.add(lblIdaH_1);
JLabel lblIdaHrs_1 = new JLabel("Viaje Redondo (15 h 10 min)  Costo:  $21,993\r\n");
lblIdaHrs_1.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaHrs_1.setForeground(Color.BLACK);
lblIdaHrs_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaHrs_1.setBounds(10, 67, 310, 33);
cn3_1.add(lblIdaHrs_1);
JLabel lblHotelesRecomendados_1 = new JLabel("HOTELES RECOMENDADOS");
lblHotelesRecomendados_1.setHorizontalAlignment(SwingConstants.CENTER);
lblHotelesRecomendados_1.setForeground(Color.BLACK);
lblHotelesRecomendados_1.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
lblHotelesRecomendados_1.setBounds(10, 148, 310, 33);
cn3_1.add(lblHotelesRecomendados_1);
JLabel lbllakeviewHoteldesde_1 = new JLabel("—Mangrove Dongdaemun (Desde $666 por noche)\r\n\r\n");
lbllakeviewHoteldesde_1.setHorizontalAlignment(SwingConstants.CENTER);
lbllakeviewHoteldesde_1.setForeground(new Color(200, 0, 90));
lbllakeviewHoteldesde_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lbllakeviewHoteldesde_1.setBounds(0, 176, 320, 33);
cn3_1.add(lbllakeviewHoteldesde_1);
JLabel lblapolloMoteldesde_1 = new JLabel("—318 Stay (Desde $1,185 por noche)\r\n");
lblapolloMoteldesde_1.setHorizontalAlignment(SwingConstants.CENTER);
lblapolloMoteldesde_1.setForeground(new Color(200, 0, 90));
lblapolloMoteldesde_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblapolloMoteldesde_1.setBounds(0, 215, 320, 33);
cn3_1.add(lblapolloMoteldesde_1);





japon = new JPanel();

japon.setLayout(null);

japon.setBackground(new Color(243, 206, 255));

pestañas.addTab("JAPÓN", null, japon, null);

co1_1 = new JPanel();

co1_1.setLayout(null);

co1_1.setBorder(new LineBorder(new Color(255, 72, 72), 2, true));

co1_1.setBackground(new Color(255, 128, 128));

co1_1.setBounds(47, 11, 723, 54);

japon.add(co1_1);

lbljp1 = new JLabel("LUGAR: TOKYO");

lbljp1.setForeground(new Color(255, 255, 255));

lbljp1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lbljp1.setBounds(42, 11, 121, 32);

co1_1.add(lbljp1);

lbljp2 = new JLabel("UBICACIÓN: ASIA");

lbljp2.setForeground(new Color(255, 255, 255));

lbljp2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lbljp2.setBounds(373, 11, 181, 32);
co1_1.add(lbljp2);
co2_1 = new JPanel();
co2_1.setLayout(null);
co2_1.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
co2_1.setBackground(Color.WHITE);
co2_1.setBounds(72, 87, 302, 259);


japon.add(co2_1);
img3 = new JLabel("");
img3.setBounds(50, 14, 204, 153);
ancho=img3.getWidth();
alto=img3.getHeight();
Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ja.jpg"));
img3.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
co2_1.add(img3);



lblNewLabel_3 = new JLabel("—Templo Sensoji");
lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_3.setForeground(new Color(0, 0, 0));
lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_3.setBounds(10, 178, 282, 47);
co2_1.add(lblNewLabel_3);
lblNewLabel_4 = new JLabel("—Tokyo Tower");
lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4.setForeground(Color.BLACK);
lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_4.setBounds(10, 212, 282, 47);
co2_1.add(lblNewLabel_4);
cn3_2 = new JPanel();
cn3_2.setLayout(null);
cn3_2.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
cn3_2.setBackground(new Color(249, 232, 255));
cn3_2.setBounds(425, 87, 320, 259);
japon.add(cn3_2);
lblcmoLlegarEn_2 = new JLabel("¿Cómo llegar? En avión, con escala desde:\r\n");
lblcmoLlegarEn_2.setHorizontalAlignment(SwingConstants.CENTER);
lblcmoLlegarEn_2.setForeground(Color.BLACK);
lblcmoLlegarEn_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblcmoLlegarEn_2.setBounds(10, 10, 310, 33);
cn3_2.add(lblcmoLlegarEn_2);
lblvolarisIda_2 = new JLabel("UNITED AIRLINES");
lblvolarisIda_2.setHorizontalAlignment(SwingConstants.CENTER);
lblvolarisIda_2.setForeground(new Color(200, 0, 90));
lblvolarisIda_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblvolarisIda_2.setBounds(10, 39, 310, 33);
cn3_2.add(lblvolarisIda_2);
lblamericanAirlinesIda_2 = new JLabel("TURKISH AIRLINES");
lblamericanAirlinesIda_2.setHorizontalAlignment(SwingConstants.CENTER);
lblamericanAirlinesIda_2.setForeground(new Color(200, 0, 90));
lblamericanAirlinesIda_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblamericanAirlinesIda_2.setBounds(10, 82, 310, 55);
cn3_2.add(lblamericanAirlinesIda_2);
lblIdaH_2 = new JLabel("Viaje Redondo (1 dia 13 h) Costo: $27,094");
lblIdaH_2.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaH_2.setForeground(Color.BLACK);
lblIdaH_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaH_2.setBounds(0, 110, 320, 55);
cn3_2.add(lblIdaH_2);
lblIdaHrs_2 = new JLabel("Viaje Redondo (19 h 15 min)  Costo:  $25,050\r\n");
lblIdaHrs_2.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaHrs_2.setForeground(Color.BLACK);
lblIdaHrs_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaHrs_2.setBounds(10, 67, 310, 33);
cn3_2.add(lblIdaHrs_2);
lblHotelesRecomendados_2 = new JLabel("HOTELES RECOMENDADOS");
lblHotelesRecomendados_2.setHorizontalAlignment(SwingConstants.CENTER);
lblHotelesRecomendados_2.setForeground(Color.BLACK);
lblHotelesRecomendados_2.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
lblHotelesRecomendados_2.setBounds(10, 148, 310, 33);
cn3_2.add(lblHotelesRecomendados_2);
lbllakeviewHoteldesde_2 = new JLabel("—Section L Tsukiji (Desde $2,347 por noche)\r\n\r\n");
lbllakeviewHoteldesde_2.setHorizontalAlignment(SwingConstants.CENTER);
lbllakeviewHoteldesde_2.setForeground(new Color(200, 0, 90));
lbllakeviewHoteldesde_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lbllakeviewHoteldesde_2.setBounds(0, 176, 320, 33);
cn3_2.add(lbllakeviewHoteldesde_2);
lblapolloMoteldesde_2 = new JLabel("—TOKYO EAST SIDE HOTEL KAIE (Desde $1,698 por noche)\r\n");
lblapolloMoteldesde_2.setHorizontalAlignment(SwingConstants.CENTER);
lblapolloMoteldesde_2.setForeground(new Color(200, 0, 90));
lblapolloMoteldesde_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 11));
lblapolloMoteldesde_2.setBounds(0, 215, 320, 33);
cn3_2.add(lblapolloMoteldesde_2);

china = new JPanel();

china.setLayout(null);

china.setBackground(new Color(243, 206, 255));

pestañas.addTab("CHINA", null, china, null);

ch1 = new JPanel();

ch1.setLayout(null);

ch1.setBorder(new LineBorder(new Color(255, 209, 72), 2, true));

ch1.setBackground(new Color(255, 233, 164));

ch1.setBounds(47, 11, 723, 54);

china.add(ch1);

lblch1 = new JLabel("LUGAR: BEIJING");

lblch1.setBackground(new Color(0, 0, 0));

lblch1.setForeground(new Color(0, 0, 0));

lblch1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lblch1.setBounds(42, 11, 125, 32);

ch1.add(lblch1);

lblch2 = new JLabel("UBICACIÓN: ASIA");

lblch2.setForeground(new Color(0, 0, 0));

lblch2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));

lblch2.setBounds(394, 11, 163, 32);

ch1.add(lblch2);

ch2 = new JPanel();

ch2.setLayout(null);

ch2.setBorder(new LineBorder(new Color(255, 72, 72), 2, true));

ch2.setBackground(new Color(255, 119, 122));

ch2.setBounds(72, 87, 302, 259);

china.add(ch2);



img4 = new JLabel("");
img4.setBounds(51, 11, 204, 153);
ancho=img4.getWidth();
alto=img4.getHeight();
Image foto4=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/c.jpg"));
img4.setIcon(new ImageIcon(foto4.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
ch2.add(img4);



lbllaGranMuralla = new JLabel("—La Gran Muralla China\r\n");
lbllaGranMuralla.setHorizontalAlignment(SwingConstants.CENTER);
lbllaGranMuralla.setForeground(Color.WHITE);
lbllaGranMuralla.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lbllaGranMuralla.setBounds(10, 175, 282, 47);
ch2.add(lbllaGranMuralla);
lbltemploDelCielo = new JLabel("—Templo del Cielo");
lbltemploDelCielo.setHorizontalAlignment(SwingConstants.CENTER);
lbltemploDelCielo.setForeground(Color.WHITE);
lbltemploDelCielo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lbltemploDelCielo.setBounds(10, 212, 282, 47);
ch2.add(lbltemploDelCielo);
cn3_3 = new JPanel();
cn3_3.setLayout(null);
cn3_3.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
cn3_3.setBackground(new Color(249, 232, 255));
cn3_3.setBounds(432, 87, 320, 259);
china.add(cn3_3);
lblcmoLlegarEn_3 = new JLabel("¿Cómo llegar? En avión, desde CDMX a través de:\r\n");
lblcmoLlegarEn_3.setHorizontalAlignment(SwingConstants.CENTER);
lblcmoLlegarEn_3.setForeground(Color.BLACK);
lblcmoLlegarEn_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblcmoLlegarEn_3.setBounds(10, 10, 310, 33);
cn3_3.add(lblcmoLlegarEn_3);
lblvolarisIda_3 = new JLabel("AEROMÉXICO");
lblvolarisIda_3.setHorizontalAlignment(SwingConstants.CENTER);
lblvolarisIda_3.setForeground(new Color(200, 0, 90));
lblvolarisIda_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblvolarisIda_3.setBounds(10, 39, 310, 33);
cn3_3.add(lblvolarisIda_3);
lblamericanAirlinesIda_3 = new JLabel("LUFTHANSA");
lblamericanAirlinesIda_3.setHorizontalAlignment(SwingConstants.CENTER);
lblamericanAirlinesIda_3.setForeground(new Color(200, 0, 90));
lblamericanAirlinesIda_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblamericanAirlinesIda_3.setBounds(10, 82, 310, 55);
cn3_3.add(lblamericanAirlinesIda_3);
lblIdaH_3 = new JLabel("Viaje Redondo (28 h 15 min) Costo:  $35,606\r\n");
lblIdaH_3.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaH_3.setForeground(Color.BLACK);
lblIdaH_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaH_3.setBounds(0, 110, 320, 55);
cn3_3.add(lblIdaH_3);
lblIdaHrs_3 = new JLabel("Viaje Redondo (10 h)  Costo:  $36,299\r\n");
lblIdaHrs_3.setHorizontalAlignment(SwingConstants.CENTER);
lblIdaHrs_3.setForeground(Color.BLACK);
lblIdaHrs_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblIdaHrs_3.setBounds(10, 67, 310, 33);
cn3_3.add(lblIdaHrs_3);
lblHotelesRecomendados_3 = new JLabel("HOTELES RECOMENDADOS");
lblHotelesRecomendados_3.setHorizontalAlignment(SwingConstants.CENTER);
lblHotelesRecomendados_3.setForeground(Color.BLACK);
lblHotelesRecomendados_3.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
lblHotelesRecomendados_3.setBounds(10, 148, 310, 33);
cn3_3.add(lblHotelesRecomendados_3);
lbllakeviewHoteldesde_3 = new JLabel("—Beijing Shangchao Hotel (Desde $1,074 por noche)\r\n\r\n");
lbllakeviewHoteldesde_3.setHorizontalAlignment(SwingConstants.CENTER);
lbllakeviewHoteldesde_3.setForeground(new Color(200, 0, 90));
lbllakeviewHoteldesde_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lbllakeviewHoteldesde_3.setBounds(0, 176, 320, 33);
cn3_3.add(lbllakeviewHoteldesde_3);
lblapolloMoteldesde_3 = new JLabel("—Beijing Hyde Courtyard Hotel (Desde $1,266 por noche)\r\n");
lblapolloMoteldesde_3.setHorizontalAlignment(SwingConstants.CENTER);
lblapolloMoteldesde_3.setForeground(new Color(200, 0, 90));
lblapolloMoteldesde_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
lblapolloMoteldesde_3.setBounds(0, 215, 320, 33);
cn3_3.add(lblapolloMoteldesde_3);



 menuBar = new JMenuBar();

setJMenuBar(menuBar);



 mnNewMenu = new JMenu("Menú 1");

mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

menuBar.add(mnNewMenu);



mnMen = new JMenu("Menú 2");

mnMen.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

menuBar.add(mnMen);

}
}