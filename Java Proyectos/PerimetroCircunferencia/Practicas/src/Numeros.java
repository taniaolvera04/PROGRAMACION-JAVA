
public class Numeros {

	public static void main(String[] args) {
		int[]numeros= new int[150];
		for (int i=0; i<150; i++) {
			numeros[i]=(int)(Math.random()*100+1);
			System.out.println(numeros[i]);
		}
	}

}
