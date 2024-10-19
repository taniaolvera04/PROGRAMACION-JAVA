    public class BancoInversion {
	public static void main(String[] args) {
		double acumulado;
		double inversion;
		double interes=0.10;
		double[][]banco=new double[5][5];
		for (int i=0; i<5; i++) {
			banco[i][0]=10000;
			acumulado=10000;
			System.out.println();
			for(int j=1; j<5; j++) {
				acumulado=(acumulado*interes)+acumulado;
				banco[i][j]=acumulado;
				System.out.print((double)Math.round(banco[i][j])*100d/100d);
				System.out.print(" ");
		}
			interes=interes+0.01;
	}
 }
}
