import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Proyecto extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
Proyecto frame = new Proyecto();
	frame.setVisible(true);
	} catch (Exception e) {
e.printStackTrace();
	}
	}
	});
	}
	int ancho;
	int alto;
private JTextField txtnombre;
	private JTextField txtresult;
	public Proyecto() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 594);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(239, 198, 244));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	JLabel lblNombre = new JLabel("Nombre");
	lblNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	lblNombre.setBounds(29, 53, 57, 14);
	contentPane.add(lblNombre);	
	txtnombre = new JTextField();
	txtnombre.setForeground(new Color(66, 66, 132));
	txtnombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
	txtnombre.setBounds(112, 52, 139, 20);
contentPane.add(txtnombre);
txtnombre.setColumns(10);
JLabel lblEstacionamiento = new JLabel("Estacionamiento");
	lblEstacionamiento.setForeground(new Color(106, 22, 116));
	lblEstacionamiento.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 13));
	lblEstacionamiento.setBounds(163, 11, 111, 14);
	contentPane.add(lblEstacionamiento);
JLabel lblHe = new JLabel("Hora entrada");
	lblHe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	lblHe.setBounds(29, 102, 111, 14);
	contentPane.add(lblHe);
JLabel lblHs = new JLabel("Hora salida");
	lblHs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	lblHs.setBounds(250, 102, 77, 14);
	contentPane.add(lblHs);
JSpinner spEntrada = new JSpinner();
    spEntrada.setToolTipText("");
	spEntrada.setForeground(new Color(0, 0, 0));
	spEntrada.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
	spEntrada.setModel(new SpinnerNumberModel(7, 7, 18, 1));
	spEntrada.setBounds(139, 100, 49, 20);
	contentPane.add(spEntrada);
	JSpinner spSalida = new JSpinner();
	spSalida.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
	spSalida.setForeground(new Color(0, 0, 0));
	spSalida.setModel(new SpinnerNumberModel(8, 8, 19, 1));
	spSalida.setBounds(354, 100, 49, 20);
	contentPane.add(spSalida);
JLabel lblAuto = new JLabel("Autolavado ");
	lblAuto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	lblAuto.setBounds(112, 161, 77, 14);
	contentPane.add(lblAuto);
JComboBox cmbOpciones = new JComboBox();
	cmbOpciones.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
	cmbOpciones.setModel(new DefaultComboBoxModel(new String[] {"Lavado", "Encerado", "Lavado interior"}));
	cmbOpciones.setBounds(217, 158, 110, 22);
	contentPane.add(cmbOpciones);
	JLabel lblimage = new JLabel("");
	lblimage.setHorizontalAlignment(SwingConstants.CENTER);
	lblimage.setBounds(66, 214, 298, 193);
	contentPane.add(lblimage);
	alto=lblimage.getHeight();
	ancho=lblimage.getWidth();
	
	JButton btncalcular = new JButton("Calcular");
	btncalcular.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	int precio;
	String nombre=txtnombre.getText();
	int he=(Integer)spEntrada.getValue();
	int hs=(Integer)spSalida.getValue();
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==8) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==8) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}break;
	case 2:
	if(he==7 && hs==8) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==9) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==9) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==9) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==10) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
    break;
	case 1:
	if(he==7 && hs==10) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==10) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==11) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==11) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==11) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}	
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==12) {
	precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==12) {
	precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 2:
	if(he==7 && hs==12) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==13) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 1:
	if(he==7 && hs==13) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==13) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==14) {
	precio=(25*7)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==14) {
	precio=(25*7)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==14) {
	precio=(25*7)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==15) {
	precio=(25*8)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==15) {
	precio=(25*8)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==15) {
	precio=(25*8)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==16) {
	precio=(25*9)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
	break;
	case 1:
	if(he==7 && hs==16) {
	precio=(25*9)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==16) {
	precio=(25*9)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==17) {
	precio=(25*10)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==17) {
	precio=(25*10)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==17) {
	precio=(25*10)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==7 && hs==18) {
precio=(25*11)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 1:
	if(he==7 && hs==18) {
	precio=(25*11)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==18) {
	precio=(25*11)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
if(he==7 && hs==19) {
	precio=(25*12)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==7 && hs==19) {
	precio=(25*12)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==7 && hs==19) {
	precio=(25*12)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==9) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==9) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
if(he==8 && hs==9) {
precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==10) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
if(he==8 && hs==10) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==10) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==11) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==11) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==11) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}	
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==12) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==12) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==12) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==13) {
	precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==13) {
precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==13) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==14) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==14) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==14) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==15) {
	precio=(25*7)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==15) {
	precio=(25*7)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==15) {
	precio=(25*7)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==16) {
	precio=(25*8)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==16) {
	precio=(25*8)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==16) {
	precio=(25*8)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==17) {
	precio=(25*9)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==17) {
	precio=(25*9)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==17) {
	precio=(25*9)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==8 && hs==18) {
	precio=(25*10)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==18) {
precio=(25*10)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==18) {
	precio=(25*10)+780;
	txtresult.setText(""+precio);
Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
case 0:
if(he==8 && hs==19) {
	precio=(25*11)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==8 && hs==19) {
	precio=(25*11)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==8 && hs==19) {
	precio=(25*11)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==10) {
	precio=35+70;
txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 1:
if(he==9 && hs==10) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==10) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==11) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==11) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 2:
	if(he==9 && hs==11) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}	
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==12) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==12) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 2:
	if(he==9 && hs==12) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
if(he==9 && hs==13) {
precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
	break;
	case 1:
	if(he==9 && hs==13) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==13) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
case 0:
	if(he==9 && hs==14) {
	precio=(25*5)+70;
txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==14) {
	precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==14) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==15) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==15) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==15) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==16) {
precio=(25*7)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==16) {
	precio=(25*7)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==16) {
	precio=(25*7)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==17) {
	precio=(25*8)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==17) {
	precio=(25*8)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==17) {
	precio=(25*8)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==18) {
	precio=(25*9)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==18) {
	precio=(25*9)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==18) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==9 && hs==19) {
	precio=(25*10)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==9 && hs==19) {
precio=(25*10)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==9 && hs==19) {
	precio=(25*10)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
if(he==10 && hs==11) {
precio=35+70;
txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==11) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==11) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}	
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==12) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 1:
if(he==10 && hs==12) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==12) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==13) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==13) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==13) {
	precio=(25*3)+780;
txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==14) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==14) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 2:
	if(he==10 && hs==14) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==15) {
precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==15) {
	precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==15) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==16) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
	break;
	case 1:
if(he==10 && hs==16) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==16) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==17) {
	precio=(25*7)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==17) {
	precio=(25*7)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==17) {
	precio=(25*7)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==18) {
	precio=(25*8)+70;
txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==18) {
	precio=(25*8)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==10 && hs==18) {
precio=(25*8)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==10 && hs==19) {
	precio=(25*9)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==10 && hs==19) {
	precio=(25*9)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
case 2:
if(he==10 && hs==19) {
	precio=(25*9)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==12) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==12) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 2:
	if(he==11 && hs==12) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
if(he==11 && hs==13) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==13) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==11 && hs==13) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==14) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==14) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 2:
	if(he==11 && hs==14) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==15) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==15) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==11 && hs==15) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==16) {
	precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==16) {
	precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==11 && hs==16) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==17) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==17) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==11 && hs==17) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==18) {
	precio=(25*7)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 1:
	if(he==11 && hs==18) {
	precio=(25*7)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==11 && hs==18) {
	precio=(25*7)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==11 && hs==19) {
	precio=(25*8)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==11 && hs==19) {
	precio=(25*8)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==11 && hs==19) {
	precio=(25*8)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==13) {
precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==12 && hs==13) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
		if(he==12 && hs==13) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==14) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==12 && hs==14) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==12 && hs==14) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==15) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==12 && hs==15) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==12 && hs==15) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==16) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
case 1:
	if(he==12 && hs==16) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
if(he==12 && hs==16) {
precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==17) {
	precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 1:
	if(he==12 && hs==17) {
	precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==12 && hs==17) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==18) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==12 && hs==18) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
if(he==12 && hs==18) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}	
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==12 && hs==19) {
	precio=(25*7)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==12 && hs==19) {
	precio=(25*7)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==12 && hs==19) {
	precio=(25*7)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==13 && hs==14) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==13 && hs==14) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==13 && hs==14) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==13 && hs==15) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==13 && hs==15) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==13 && hs==15) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==13 && hs==16) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
if(he==13 && hs==16) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==13 && hs==16) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==13 && hs==17) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==13 && hs==17) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==13 && hs==17) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==13 && hs==18) {
	precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==13 && hs==18) {
precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==13 && hs==18) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==13 && hs==19) {
	precio=(25*6)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
	break;
	case 1:
	if(he==13 && hs==19) {
	precio=(25*6)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==13 && hs==19) {
	precio=(25*6)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==14 && hs==15) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==14 && hs==15) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==14 && hs==15) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==14 && hs==16) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==14 && hs==16) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==14 && hs==16) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==14 && hs==17) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==14 && hs==17) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==14 && hs==17) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==14 && hs==18) {
	precio=(25*4)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==14 && hs==18) {
precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==14 && hs==18) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==14 && hs==19) {
	precio=(25*5)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==14 && hs==19) {
	precio=(25*5)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==14 && hs==19) {
	precio=(25*5)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
case 0:
	if(he==15&& hs==16) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==15 && hs==16) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==15 && hs==16) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==15 && hs==17) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==15 && hs==17) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==15 && hs==17) {
	precio=(25*2)+780;
txtresult.setText(""+precio);
Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==15 && hs==18) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==15 && hs==18) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==15 && hs==18) {
	precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==15 && hs==19) {
	precio=(25*4)+70;
txtresult.setText(""+precio);
Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==15 && hs==19) {
	precio=(25*4)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==15 && hs==19) {
	precio=(25*4)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==16 && hs==17) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    }
	break;
	case 1:
	if(he==16 && hs==17) {
	precio=35+350;
	txtresult.setText(""+precio);
Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==16 && hs==17) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}	
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==16 && hs==18) {
	precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==16 && hs==18) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==16 && hs==18) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
if(he==16 && hs==19) {
	precio=(25*3)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==16 && hs==19) {
	precio=(25*3)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==16 && hs==19) {
precio=(25*3)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==17 && hs==18) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
break;
	case 1:
	if(he==17 && hs==18) {
	precio=35+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==17 && hs==18) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
    case 0:
	if(he==17 && hs==19) {
    precio=(25*2)+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==17 && hs==19) {
	precio=(25*2)+350;
	txtresult.setText(""+precio);
	Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==17 && hs==19) {
	precio=(25*2)+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    }
	break;
	}
	switch(cmbOpciones.getSelectedIndex()) {
	case 0:
	if(he==18 && hs==19) {
	precio=35+70;
	txtresult.setText(""+precio);
	Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/autolavado.jpeg"));
	lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 1:
	if(he==18 && hs==19) {
	precio=35+350;
	txtresult.setText(""+precio);
    Image foto2=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/encerado.jpg"));
	lblimage.setIcon(new ImageIcon(foto2.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	case 2:
	if(he==18 && hs==19) {
	precio=35+780;
	txtresult.setText(""+precio);
	Image foto3=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/lavado interior.jpg"));
	lblimage.setIcon(new ImageIcon(foto3.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}
	break;
	}
	}
	});
	btncalcular.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	btncalcular.setBounds(99, 461, 89, 23);
	contentPane.add(btncalcular);
	JButton btnlimpiar = new JButton("Limpiar");
	btnlimpiar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Image foto=Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
			lblimage.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			txtresult.setText("");
			txtnombre.setText("");
			spEntrada.setValue(7);
			spSalida.setValue(8);	
			cmbOpciones.setSelectedItem("Lavado");
		}
	});
	btnlimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	btnlimpiar.setBounds(247, 461, 89, 23);
	contentPane.add(btnlimpiar);
	txtresult = new JTextField();
	txtresult.setForeground(new Color(182, 107, 214));
	txtresult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
	txtresult.setBounds(163, 508, 150, 20);
	contentPane.add(txtresult);
	txtresult.setColumns(10);
	JLabel lblTotal = new JLabel("Total a pagar");
	lblTotal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	lblTotal.setBounds(69, 510, 85, 14);
	contentPane.add(lblTotal);
	JLabel lblPesos = new JLabel("pesos");
	lblPesos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
	lblPesos.setBounds(336, 510, 77, 14);
	contentPane.add(lblPesos);
	}
}