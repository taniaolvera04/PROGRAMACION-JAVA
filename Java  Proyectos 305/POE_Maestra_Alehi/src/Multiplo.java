import java.util.Scanner;
public class Multiplo {
	private int n;
	
	public boolean mul(int n) {	
		return n%5==0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n, reg=1;
		while(reg==1) {
			Multiplo mt=new Multiplo();
			System.out.println("Ingresa un número entero");
			n=s.nextInt();
			if(mt.mul(n)) {
				System.out.println("Número " + n +" es múltiplo de 5");
			}else {
				System.out.println("Número " + n + " no es múltiplo de 5");
			}
		System.out.println("¿Deseas regresar? (1.Si/2.No)");	
		reg=s.nextInt();
		} 
}
}