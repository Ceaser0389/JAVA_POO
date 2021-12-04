package condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	
	int num1;
	
	System.out.println("Entre com um numero inteiro: ");
	num1 =sc.nextInt();
	
	
	if(num1 > 0) {
		System.out.println("o numero é positivo:" + num1);
	}else {
		System.out.println("o numero é negativo:" + num1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();

	}

}
