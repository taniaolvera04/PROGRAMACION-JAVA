import java.util.Scanner;
public class Recuperacion {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int cal;
	  System.out.println("Introduce calificación");
	  cal=sc.nextInt();
	  if (cal>5 && cal<=10) {
		  System.out.println("Aprobado");
		  if(cal<5) {
			  System.out.println("Reprobado");
		  }
	  }
	  else {
	  do {
		  System.out.println("Ingresa calificación correcta");
		  cal=sc.nextInt();
		  if (cal>5 && cal<=10) {
			  System.out.println("Aprobado");
		  }
	  }while(cal<5||cal>10);
	}
  }

}
