import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Pestañas {
    static JFrame marco = new JFrame();
    static JTabbedPane pestaña = new JTabbedPane();
    static JPanel panel1 = new JPanel();
    static JButton saludo = new JButton("Pulsame");
    static JLabel etiqueta = new JLabel("Adios");
   
    public static void main(String[] dar10){
        marco.setTitle("Pestañas en Java");
        marco.setSize(350,200);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(new BorderLayout() );
       
        saludo.addActionListener(new Pulsar() );
        panel1.add(saludo);
        pestaña.addTab("Pestaña 1", panel1);
       
        pestaña.add("Pestaña2", etiqueta);
        marco.getContentPane().add(pestaña,BorderLayout.CENTER);
               
        marco.setVisible(true);
    }
    public static class Pulsar implements ActionListener{
         String[] arreglo = {"Bien!  =)", "Maso", "Mal  =("};
        public void actionPerformed (ActionEvent e){
              JOptionPane.showOptionDialog(null, "¿Cómo estás?",
                "¡Hola!", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,
                arreglo , null);
        }
    }
}