import java.util.Scanner;
public class Operaciones {
    private int op, num2;
    private double num, p, m, d, s, r, rz,va,po, mul, div, sum, res, valor, fc;

    public double potencia(double num, double po){
        p=(Math.pow(num,po));
        return p;
    }
    public double multiplicacion(double num, double mul){
        m=(num*mul);
        return m;
    }
    
    public double division(double num, double div){
        d=(num/div);
        return d;
    }
    public double suma(double num, double sum){
        s=(num+sum);
        return s;
    }
    public double resta(double num, double res){
        r=(num-res);
        return r;
    }
    public double raiz(double num){
        rz=(Math.sqrt(num));
        return rz;
    }
    public double va(double num){
        valor=(Math.abs(num));
        return va;
    }
    public int factorial(int fc, int num2){
    		 fc=1;
    		 for (int i=num2;i>0;i--){
    		 fc=fc*i;
    		 }
    		 System.out.println("El factorial de " + num2 + " es: " + fc);
    		 return fc;
        }
    public static void main(String[]args){
    double num, po, mul, div, sum, res, valor = 0;
    int op;
    int fc = 0, num2;
        Scanner cp=new Scanner(System.in);
        System.out.println("Menú operaciones:\n"+"\n"+ "1.Potencia\n"+ "2.Multiplicación\n"+ "3.División\n"+ "4.Suma\n"
        + "5.Resta\n"+ "6.Raíz Cuadrada\n"+ "7.Valor Absoluto\n"+ "8.Factorial\n"+"\n"+"Elige el número de operación de tu elección");
        op=cp.nextInt();
        while(op<=0 || op>=9) {
        	System.out.println("Introduce un número de operación válido.");
        	 op=cp.nextInt();
        }
        if(op==1) {
        	System.out.println(" ");
        	System.out.println("Introduce valor de base");
        	num=cp.nextDouble();
        	System.out.println("Introduce base de exponente");
        	po=cp.nextDouble();
        	
        	Operaciones operacion1;
        	operacion1=new Operaciones();
        	operacion1.potencia(num, po);
        	System.out.println("Resultado de " + num + " elevado a "+ po + " es: "+ operacion1.p);
        	
        }
        if(op==2) {
        	System.out.println("Introduce valor de número a multiplicar");
        	num=cp.nextDouble();
        	System.out.println("Introduce valor de número que lo multiplica");
        	mul=cp.nextDouble();
        	
        	Operaciones operacion2;
        	operacion2=new Operaciones();
        	operacion2.multiplicacion(num, mul);
        	System.out.println("Resultado de multiplicación de "+ num + " por " +mul+ " es: "+ operacion2.m);
        	
        }
        if(op==3) {
        	System.out.println("Introduce valor de dividendo");
        	num=cp.nextDouble();
        	System.out.println("Introduce valor de divisor");
        	div=cp.nextDouble();
        	
        	while(div==0) {
        		System.out.println("No existe la división entre 0.");
        		System.out.println("Introduce el valor correcto del divisor");
	        	div=cp.nextDouble();
        	}
        	
        	Operaciones operacion3;
        	operacion3=new Operaciones();
        	operacion3.division(num, div);
        	System.out.println("Resultado de división de " + num + " entre " + div + " es: " + operacion3.d);
        }
        
        if(op==4) {
        	System.out.println("Introduce valor de número");
        	num=cp.nextDouble();
        	System.out.println("Introduce valor que se le sumará");
        	sum=cp.nextDouble();
        	
        	Operaciones operacion4;
        	operacion4=new Operaciones();
        	operacion4.suma(num, sum);
        	System.out.println("Resultado de suma de " + num + " y " + sum + " es: " + operacion4.s);
    }
        if(op==5) {
        	System.out.println("Introduce valor de número");
        	num=cp.nextDouble();
        	System.out.println("Introduce valor que se le restará");
        	res=cp.nextDouble();
        	
        	Operaciones operacion5;
        	operacion5=new Operaciones();
        	operacion5.resta(num, res);
        	System.out.println("Resultado de la resta de" + num + " y " + res + " es: " + operacion5.r);
}
        if(op==6) {
        	System.out.println("Introduce valor de número al que se le sacará raíz cuadrada");
        	num=cp.nextDouble();
        	
        	Operaciones operacion6;
        	operacion6=new Operaciones();
        	operacion6.raiz(num);
        	System.out.println("Resultado de raíz cuadrada de " + num + " es: " + operacion6.rz);
}
        if(op==7) {
        	System.out.println("Introduce número del cual quieras conocer su valor absoluto");
        	num=cp.nextDouble();
        	
        	Operaciones operacion7;
        	operacion7=new Operaciones();
        	operacion7.va(num);
        	System.out.println("El valor absoluto de "+ num + " es: " + operacion7.valor);
}
        if(op==8) {
        	System.out.println("Introduce número entero para sacar su factorial");
        	num2=cp.nextInt();
        	
        	Operaciones operacion8;
        	operacion8=new Operaciones();
        	operacion8.factorial(fc, num2);
        }
}
}