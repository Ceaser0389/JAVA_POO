package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of program");
	}
	public static void method1() {
		 System.out.println("***Method1 Started***");
		 
		 method2();
		 
		 
	    System.out.println("***Method2 End***");
	}
	
	public static void method2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    System.out.println("***Method2 Started***");
		try {
		 
		 String[] vect = sc.nextLine().split("  ");
			int position  = sc.nextInt();
			
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Error");
		}
		
	
		sc.close();
		 System.out.println("***Method2 End***");
	}

}
