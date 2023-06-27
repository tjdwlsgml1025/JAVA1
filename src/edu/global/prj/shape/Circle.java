package edu.global.prj.shape;

public class Circle extends Shape { //상속받음
	private double radius;
	
	public Circle(double rad){ //생성자앞에 퍼블릭필수
		radius = rad;
	}
	
	@Override
	public double getArea() { //Shape파일과 오버라이딩
		return radius*radius*Math.PI;
	}
		
}
