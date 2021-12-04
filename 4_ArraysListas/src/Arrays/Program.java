package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int n = sc.nextInt();

	int [][]mat = new int[n][n];
	
	for (int i = 0; i<n; i++) {
	  for(int j=0; j<n; j++) {
		  mat[i][j] =sc.nextInt();
	  }
	}
	
	System.out.println("Main Diagonal");
	for (int i = 0; i < n; i++) {
		System.out.println(mat[i][i] + " ");
	}
	System.out.println();
	
	int count = 0;
	for(int i=n; i<mat.length ; i++) {
		for(int j=n ; j<mat[i].length ; j++) {
			if (mat[i][j] <0) {
				count++;
			}
		}
	}
	
	System.out.println("Negative Numbers: " + count);
	
	
	
	sc.close();	
	}

}
