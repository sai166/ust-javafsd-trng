package Sba;

import com.ust.Employee;

interface  Abstractt {
	public void CalculateSalary(double s);
	public void fetcDepartment(String d);

}
abstract class Engineerr  implements  Abstractt{
	
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



abstract class Doctors implements Abstractt{
	
	public void calculateSalary(double s1) {
		
		int bonus=3000;
		double total=s1+bonus;
		System.out.println("Your salary is:"+total);
	}
	
	
	public void fetchDepartment(String d) {
		System.out.println("your department is:"+d);
		
		
	}
}


public class Abstract3
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
	

