import java.util.Scanner;
public class Hour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hr, mn;
		System.out.println("Introduce hora (1 a 12)");
		hr=sc.nextInt();
		System.out.println("Introduce minutos (0 a 59)");
		mn=sc.nextInt();
		while(hr<0 || hr>12 && mn<0 || mn>59) {
			System.out.println("Introduce hora correcta (1 a 12)");
			hr=sc.nextInt();
			System.out.println("Introduce minutos correctos (0 a 59)");
			mn=sc.nextInt();
		}
		System.out.print("It's ");
		 if(mn==30) {
			  System.out.println(" half past");
		}
		  if(hr>=1 && mn<=30) {
			  switch(hr) {
				case 1:
				System.out.print(" one");
						break;
				case 2:
				System.out.print(" two");
				break;
				case 3:
				System.out.print(" three");
				break;
				case 4:
				System.out.print(" four");
				break;
				case 5:
				System.out.print(" five");
				break;
				case 6:
				System.out.print(" six");
				break;
				case 7:
				System.out.print(" seven");
				break;
				case 8:
				System.out.print(" eight");
				break;
				case 9:
				System.out.print(" nine");
				break;
				case 10:
				System.out.print(" ten");
				break;
				case 11:
				 System.out.print( " eleven");
				 break;
				case 12:
					System.out.println(" twelve");
					break;
			}
			
	switch(mn) {
	case 0:
		System.out.println(" o'clock");
		break;
	case 1:
		System.out.println(" one");
		break;
	case 2:
		System.out.println(" two" );
		break;
	case 3:
		System.out.println(" three");
		break;
	case 4:
		System.out.println(" four");
		break;
	case 5:
		System.out.println(" five");
		break;
	case 6:
		System.out.println(" six" );
		break;
	case 7:
		System.out.println( " seven");
		break;
	case 8:
		System.out.println(" eight");
		break;
	case 9:
		System.out.println(" nine");
		break;
	case 10:
		System.out.println(" ten");
		break;
	case 11:
		System.out.println(" eleven");
		break;
	case 12:
		System.out.println(" twelve");
		break;
	case 13:
		System.out.println( " thirteen " );
		break;
	case 14:
		System.out.println( " fourteen " );
		break;
	case 15:
       	 System.out.println("a quarter past");	
		 break;
	case 16:
		System.out.println( " sixteen " );
		break;
	case 17:
		System.out.println( " seventeen " );
		break;
	case 18:
		System.out.println( " eighteen " );
		break;
	case 19:
		System.out.println( " nineteen " );
		break;
	case 20:
		System.out.println( " twenty " );
		break;
	case 21:
		System.out.println( " twenty one");
		break;
	case 22:
		System.out.println( " twenty two");
		break;
	case 23:
		System.out.println( " twenty three");
		break;
	case 24:
		System.out.println( " twenty four");
		break;
	case 25:
		System.out.println( " twenty five");
		break;
	case 26:
		System.out.println( " twenty six");
		break;
	case 27:
		System.out.println( " twenty seven");
		break;
	case 28:
		System.out.println( " twenty eight");
		break;
	case 29:
		System.out.println( " twenty nine");
		break;
	}
	}
			  if(hr>=1 && mn>=31) {
			switch(mn) {
			case 31:
				System.out.print(" twenty nine to");
				break;
			case 32:
				System.out.print(" twenty eight to");
				break;
			case 33:
				System.out.print(" twenty seven to");
				break;
			case 34:
				System.out.print(" twenty six to");
				break;
			case 35:
				System.out.print(" twenty five to");
				break;
			case 36:
				System.out.print(" twenty four to");
				break;
			case 37:
				System.out.print(" twenty three to");
				break;
			case 38:
				System.out.print(" twenty two to");
				break;
			case 39:
				System.out.print(" twenty one to");
				break;
			case 40:
				System.out.print(" twenty to");
				break;
			case 41:
				System.out.print(" nineteen to" );
				break;
			case 42:
				System.out.print( " eighteen to" );
				break;
			case 43:
				System.out.print(" seventeen to");
				break;
			case 44:
				System.out.print(" sixteen to");
				break;
			case 45:
				System.out.println(" a quarter to");
				break;
			case 46:
				System.out.print( " fourteen to");
				break;
			case 47:
				System.out.print( " thirteen to");
				break;
			case 48:
				System.out.print( " twelve to" );
				break;
			case 49:
				System.out.print( "eleven to");
				break;
			case 50:
				System.out.print(" ten to");
				break;
			case 51:
				System.out.print(" nine to");
				break;
			case 52:
				System.out.print(" eight to");
				break;
			case 53:
				System.out.print(" seven to");
				break;
			case 54:
				System.out.print(" six to");
				break;
			case 55:
				System.out.print(" five to");
				break;
			case 56:
				System.out.print(" four to");
				break;
			case 57:
				System.out.print(" three to");
				break;
			case 58:
				System.out.print(" two to");
				break;
			case 59:
				System.out.print(" one to");
				break;	
			  }
			  
			switch(hr) {
			case 1:
			System.out.print(" two");
					break;
			case 2:
			System.out.print(" three");
			break;
			case 3:
			System.out.print(" four");
			break;
			case 4:
			System.out.print(" five");
			break;
			case 5:
			System.out.print(" six");
			break;
			case 6:
			System.out.print(" seven");
			break;
			case 7:
			System.out.print(" eight");
			break;
			case 8:
			System.out.print(" ninet");
			break;
			case 9:
			System.out.print(" ten");
			break;
			case 10:
			System.out.print(" eleven");
			break;
			case 11:
			 System.out.print( " twelve");
			 break;
			case 12:
				System.out.println(" one");
				break;
			}
			  }
			
}
}