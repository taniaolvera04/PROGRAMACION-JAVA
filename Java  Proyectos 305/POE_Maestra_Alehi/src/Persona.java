import java.util.Scanner;
public class Persona {
  //  int edad;
    public int esMayor(int edad){
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }if(edad<18){
            System.out.println("Eres menor de edad");
        }
        return edad;
    }
    public static void main(String [] args) {
     Scanner sc;
     String nombre;
     int edad;
        sc=new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre=sc.nextLine();
        System.out.println("Ingresa tu edad");
        edad=sc.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        
        Persona persona1;
        persona1=new Persona();
        persona1.esMayor(edad);
    }
}