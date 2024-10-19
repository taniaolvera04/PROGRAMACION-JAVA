
public class PromNum {
	public static void main(String[] args) {
		double[]numbers=new double[100];
		double add=0;
		double div=0;
		for (int i=0; i<numbers.length; i++) {
		add=add+i;
		div=(add/100)+1;
	}
		System.out.println(div);
	}

}
