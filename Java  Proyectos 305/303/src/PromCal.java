import java.util.Scanner;
public class PromCal {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double c,  ac=0, prom;
		System.out.println("Introduce número de calificaciones");
		int n=in.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Introduce calificación");
			c=in.nextDouble();
			ac=ac+c;
		}
		prom=Math.round(ac/n*10d)/10d;
		System.out.println("Promedio de calificaciones es: " + prom);
	}

}
