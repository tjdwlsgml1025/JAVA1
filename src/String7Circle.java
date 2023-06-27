import java.util.Scanner;

class Circle{
	private double radius; 

	public Circle() {}
	public Circle() {(double radius)
		this.radius
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


public class String7Circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너의 정해진 틀이니 그냥 암기
	
		
		
		System.out.print("반지름의 넓이:"); //개행하면안돼~
		double radius = sc.nextDouble(); //입력값 받을 부분, 데이터타입 주의!
		
		Circle circle = new Circle();  //써클클래스의 객체생성
		circle.setRadius(radius); //써클 값 설정해주기
		
	
		
		System.out.println(circle.getArea());
	}
	

}
