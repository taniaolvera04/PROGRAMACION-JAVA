
public class Arreglo1 {
	public static void main(String[] args) {
		String[]paises=new String[8];
		paises[0]="España";
		paises[1]="México";
		paises[2]="Argentina";
		paises[3]="Chile";
		paises[4]="Japón";
		paises[5]="Corea";
		paises[6]="China";
		paises[7]="Tailandia";
		for(int i=0; i<paises.length; i++) {
			System.out.println("País " + (i+1) + paises[i]);
		}
	}
}
