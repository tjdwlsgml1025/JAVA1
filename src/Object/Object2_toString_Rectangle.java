package Object;

import edu.global.prj.shape.Shape;

public class Rectangle  { 
	private double width, height;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
//클래스 틀림~~~~~~~
	
	public int getHeight() {
		return width;
	}
	
	public double getArea() {
		return width*height;
	}	
}

@Override //object에 있는 것을 오버라이딩해서 주소값이 아닌 내가 정한 값이 나오게 재정의
public String toString() {
	return"가로"+width+"세로"+height;
}


public class Object2_toString_Rectangle {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		System.out.println(r); //오버라이딩 된 자식거가 나옴
	}

}
