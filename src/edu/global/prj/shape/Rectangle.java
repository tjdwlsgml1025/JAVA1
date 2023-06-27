package edu.global.prj.shape;

public class Rectangle extends Shape { //상속받음
	private double width, height;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	@Override //오버라이딩함
	public double getArea() { //Shape파일과 오버라이딩
		return width*height;
	}
		
}
