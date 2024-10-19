import java.util.Scanner;
public class Semana {
private int dia;
public int nombre(int dia) {
	
	switch(dia) {
	case 1:
		if(dia==1) {
			System.out.println("Día 1 es Lunes");
		}
		break;
	case 2:
		if(dia==2) {
			System.out.println("Día 2 es Martes");
		}
		break;
	case 3:
		if(dia==3) {
			System.out.println("Día 3 es Miércoles");
		}
		break;
	case 4:
		if(dia==4) {
			System.out.println("Día 4 es Jueves");
		}
		break;
	case 5:
		if(dia==5) {
			System.out.println("Día 5 es Viernes");
		}
		break;
	case 6:
		if(dia==6) {
			System.out.println("Día 6 es Sábado");
		}
		break;
	case 7:
		if(dia==7) {
			System.out.println("Día 7 es Domingo");
		}
		break;
	}
	return dia;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia, reg=1;
		while(reg==1) {
			System.out.println("Ingresa número de día (1-7)");
			dia=sc.nextInt();
			while(dia<=0 || dia>=8) {
				System.out.println("Ingresa número correcto de día(1-7)");
				dia=sc.nextInt();
			}
			Semana sem=new Semana();
			sem.nombre(dia);
			System.out.println("¿Deseas regresar? (1.Si/2.No)");
			reg=sc.nextInt();
		}
	}

}
