package Vista;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicProgressBarUI;

import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Barra extends JFrame {

private JPanel contentPane;
final int MAXIMUM = 100;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Barra frame = new Barra();
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
Timer t;
ActionListener ac;
int x=0;
private JLabel lblNewLabel;
private JLabel lblp;

public Barra() {


setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 644, 393);
contentPane = new JPanel();
contentPane.setBackground(new Color(255, 255, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setLocationRelativeTo(null);
setContentPane(contentPane);
contentPane.setLayout(null);

lblp = new JLabel("");
lblp.setBounds(294, 306, 51, 14);
contentPane.add(lblp);

JProgressBar progressBar = new JProgressBar();
progressBar.addChangeListener(new ChangeListener() {
public void stateChanged(ChangeEvent e) {
lblp.setText(""+progressBar.getValue()+"%");
}
});
progressBar.setStringPainted(true);
progressBar.setBorderPainted(false);
progressBar.setBorder(new LineBorder(new Color(0, 0, 0)));
progressBar.setBounds(97, 240, 425, 55);
contentPane.add(progressBar);

progressBar.setUI(new BasicProgressBarUI() {

@Override
protected void paintDeterminate(Graphics g, JComponent jc) {
Graphics2D g2d = (Graphics2D)g;

g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

int ancho=progressBar.getWidth();
int alto=progressBar.getHeight();

int espacionAncho = ancho -20;
int espacionAlto = alto -20;

double porcentajeProgress = progressBar.getPercentComplete();

espacionAncho = (int) (espacionAncho*porcentajeProgress);

Point2D inicio = new Point2D.Double(6,6);
Point2D fin = new Point2D.Double(6,6+espacionAlto);

float[] posicionGradiante = {0.0f,0.25f ,1.0f};
Color[] colores = {Color.gray, Color.BLUE, Color.magenta};


LinearGradientPaint gradiante = new LinearGradientPaint(inicio, fin, posicionGradiante,colores);
g2d.setPaint(gradiante);

RoundRectangle2D dibujarProgress = new RoundRectangle2D.Double(10,10,espacionAncho,espacionAlto,espacionAlto+10,espacionAlto);
g2d.fill(dibujarProgress);

RoundRectangle2D borde = new RoundRectangle2D.Double(5,5,ancho-5,alto-5,espacionAlto+10,espacionAlto);
Stroke grosor = new BasicStroke(5.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
g2d.setStroke(grosor);
g2d.draw(borde);

}



});

lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon(Barra.class.getResource("/img/kitty.gif")));
lblNewLabel.setBounds(204, 11, 235, 208);
contentPane.add(lblNewLabel);


//-----------------------------------------
ac=new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
x=x+1;
progressBar.setValue(x);

if(x==100) {
	MenuD m=new MenuD();
	m.setVisible(true);
dispose();
}
}
};

t= new Timer(7, ac);
t.start();


}
}

