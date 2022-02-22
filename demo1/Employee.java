package demo1;

public class Employee {
	String name;
	int age;
	double salary;
	String location;
	
	public Employee(String name,int age,double salary, String location){
		this.name=name;
		this.age=age;
		this.location=location;
		this.salary=salary;
	}
	

public double  raiseSalary() {
	return this.salary*2.5;
	}
	

}
