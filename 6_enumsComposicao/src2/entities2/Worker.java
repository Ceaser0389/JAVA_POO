package entities2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level; // enum
	private Double  baseSalary;
	
	private Departament departament; //composicao
	
	private List<HourContract> contracts = new ArrayList<>();
	// quando vc tiver uma composição tem muitos ... vc não inclui no construtor,vc deve iniciar a sua lista vazia com o new 
	
	
	public Worker() {}

	
	///não gero o construtor com a lista contracts
	public Worker(String name, WorkerLevel level,
		Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Departament getDepartament() {
		return departament;
	}


	public void setDepartament(Departament departament) {
		this.departament = departament;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}



	//faz associacao entre trabalhador e contrato
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	
	public double income(int year,int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
		cal.setTime(c.getDate());
		int  c_year =cal.get(Calendar.YEAR);
		int  c_month = 1+ cal.get(Calendar.MONTH);
		if (year == c_year && month == c_month) {
			sum += c.totalValue();
		}
		
		}
		return sum;
	}
	
	
	
	
	
}
