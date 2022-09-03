package com.ust;

public class Employee {
int empId=567;
String empName="Saiprasath";
float salary=570000.00f;
int age=21;
String dept="Developemnt";

void salary() {
	System.out.println("Salary:"+salary);
}
void salary(int a) {
	if(age>50)
		System.out.println("Eligible for insurance");
	else
		System.out.println("Not Eligible for insurance");
	
	}
}
class Engineer extends Employee{
	void salary() {
		System.out.println("Name: "+empName);
	}
	public static void main(String agrs[]) {
		Engineer e =new Engineer();
		e.salary();
		e.salary(e.age);
		Employee em = new Employee();
		em.salary();
	}
}