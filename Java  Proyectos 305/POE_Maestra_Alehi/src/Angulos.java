import java.util.Scanner;

public class Angulos{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angulo;
        System.out.println("Introduce ángulo");
        angulo=sc.nextInt();
        if (angulo>0 && angulo<90){
            System.out.println("Ángulo Agudo");
        }
        if (angulo==90){
        System.out.println("Ángulo Recto");
        }
        if (angulo>90 && angulo<180){
            System.out.println("Ángulo Obtuso");
        }
        if (angulo==180){
            System.out.println("Ángulo Llano");
        }
        if (angulo>180 && angulo<360){
            System.out.println("Ángulo Concavo");
        }
        if (angulo==360){
            System.out.println("Ángulo Completo");
        	}
        else {
        	while(angulo<0 || angulo>360) {
        		System.out.println("Introduce ángulo correcto");
                angulo=sc.nextInt();
                if (angulo>0 && angulo<90){
                    System.out.println("Ángulo Agudo");
                }
                if (angulo==90){
                System.out.println("Ángulo Recto");
                }
                if (angulo>90 && angulo<180){
                    System.out.println("Ángulo Obtuso");
                }
                if (angulo==180){
                    System.out.println("Ángulo Llano");
                }
                if (angulo>180 && angulo<360){
                    System.out.println("Ángulo Concavo");
                }
                if (angulo==360){
                    System.out.println("Ángulo Completo");
                }
        	}
        }
    }
}