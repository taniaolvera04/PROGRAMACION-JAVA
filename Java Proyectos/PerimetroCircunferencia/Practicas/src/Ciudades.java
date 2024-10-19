import javax.swing.JOptionPane;
public class Ciudades {
	public static void main(String[] args) {
		String c1, c2, c3, c4, c5;
		String[]ciudades=new String[5];
		c1=JOptionPane.showInputDialog("Introduce ciudad 1");
		ciudades[0]=c1;
		c2=JOptionPane.showInputDialog("Introduce ciudad 2");
		ciudades[1]=c2;
		c3=JOptionPane.showInputDialog("Introduce ciudad 3");
		ciudades[2]=c3;
		c4=JOptionPane.showInputDialog("Introduce ciudad 4");
		ciudades[3]=c4;
		c5=JOptionPane.showInputDialog("Introduce ciudad 5");
		ciudades[4]=c5;
		for(int i=0; i<ciudades.length; i++) {
			System.out.println("Ciudad " + "=" + (i+1) + ciudades[i]);
		}
		
	}

}
