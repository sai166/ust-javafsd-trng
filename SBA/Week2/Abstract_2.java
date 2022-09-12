package Sba;

import com.ust.Employee;

 abstract class Abstract_1{
	
	abstract void CalculateSalary(double s);
	abstract void fetchDepartment(String d);
	
}

class Engineer extends Employee{
	
	public void  calculateSalry(double s) {
		
		int bonus=3000;
		double total=s+bonus;
		System.out.println("your salry is: "+total);
		 {
	}
	
}
	
	public void fetchDepartment(String d) {
		
		
		System.out.println("your department is : "+d);
		
	}
}
class Doctor extends Employee{
	
	public void calculateSalary(double s1) {
		
		int bonus=3000;
		double total=s1+bonus;
		System.out.println("Your salary is:"+total);
	}
	
	
	public void fetchDepartment(String d) {
		System.out.println("your department is:"+d);
		
		
	}
}


public class Abstract_2
{
	
	public static void main(String[] args) {
		Engineer engg=new Engineer();
		engg.calculateSalry(28000);
		engg.fetchDepartment("Civil Engineering");
		
		Doctor doc=new Doctor();
		doc.calculateSalary(23000);
		doc.fetchDepartment("computer science ");
		
		
	}
	
}