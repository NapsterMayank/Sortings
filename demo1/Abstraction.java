package demo1;

abstract class CalculateArea{
	
	abstract double Area();
}

class Square extends CalculateArea{
	
	double length;
	
	Square(double length)
	{
		this.length= length;
	}
	double Area() {
		
		return length*length;
	}
	void Print() {
		System.out.println(Area());
	}
	
}
 class Rectangle extends CalculateArea{
	
	double length; 
	
	double breadth;
	
	public Rectangle(double length, double breadth)
	{
	
		this.length=length;
	    this.breadth=breadth;
	}
	double Area() {
		
		return length*breadth;
		
	}
public void Print() {
		System.out.println(Area());
	}
}