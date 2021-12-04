package application2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities2.Departament;
import entities2.HourContract;
import entities2.Worker;
import enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      // para maniular data 
      SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

      System.out.print("Enter departament's name: ");
      String departamentName = sc.nextLine();
      System.out.println("Enter worker data:");
      System.out.print("Name:");
      String workerName = sc.nextLine();
      System.out.println("Level:");
      String workerLevel = sc.nextLine();
      System.out.println("Base Salary:");
      double baseSalary = sc.nextDouble();
                                            //instancia d workerlevel que digitei
      Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),
    		baseSalary,new Departament(departamentName));
      
      
      System.out.println("How many contracts to this worker ?");
      int n =sc.nextInt();
      
      for (int i = 0; i <=n; i++) {
		System.out.println("Entre com contract #"+ i +" data:");
		System.out.print("Date (DD/MM/YYYY):");
		Date contractDate = sdf.parse(sc.next());
		System.out.println("Value per hour:");
		double valuePerHour = sc.nextDouble();
		System.out.println("Duration (hours):");
		int hours = sc.nextInt();
		HourContract contract = new HourContract(contractDate,valuePerHour,hours);
		worker.addContract(contract);
	}
      
       System.out.println();
       System.out.println("Enter month nd year  to calculate  income (MMM/YYYY)");
       String monthAndYear = sc.next();
       int month = Integer.parseInt(monthAndYear.substring(0,2));
       int year = Integer.parseInt(monthAndYear.substring(3));
       
       System.out.println("Name: " + worker.getName());
       System.out.println("Department" + worker.getDepartament().getName());
       System.out.println("Income for" + monthAndYear + ":" 
       +String.format("%.2f", worker.income(year, month)));
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      sc.close();
	}

}
