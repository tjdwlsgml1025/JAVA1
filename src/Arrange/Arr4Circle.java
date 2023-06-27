package Arrange;
import java.util.Scanner;

class Circle2{
	private double radius; 

	public Circle2() {}
	
	public Circle2(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius; 
	}

	public void setRadius(double radius) { 
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;  
	}
	
}


public class Arr4Circle {

	public static void main(String[] args) {
		Circle2[] arrCircle = new Circle2[2];
		
		arrCircle[0] = new Circle2(10.0);
		arrCircle[1] = new Circle2(5.0);
		
		double area = 0;
		
		for (int i = 0; i < arrCircle.length; i++) { 
			area = area + arrCircle[i].getArea();
		}
		System.out.println(area);
		
		
		
		
	
	}
	

}
