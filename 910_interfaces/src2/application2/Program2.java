package application2;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program2 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	
	AbstractShape s1 = new Circle(Color.BLACK, 2.0);
	AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
	
	
	System.out.println("Circle color: " + s1.getColor());
	System.out.println("Circle area: " + String.format("%.3f", s1.area()));
	
	System.out.println("Rectangle color: " + s2.getColor());
	System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	
	
	
	
	
	
	
	
	
	sc.close();

	}

}
