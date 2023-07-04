package Object;

class Circle{
	private double radius; 

	public Circle() {}
	public Circle(double radius){
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
	
@Override
	public String toString() { 
		return "원의 넓이는"+getArea()+"이고 반지름은"+radius+"인원";
		}



@Override
	public boolean equals(Object obj) { //이부분은 고정(오브젝트의 오버라이딩이니까) 암기 / obj는 부모!
		Circle circle = (Circle)obj; //자식=부모 원래 안됨 / 되는 케이스= (자식)부모로 형변환/데이터타입을 자식으로 
									//부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함
		
	if(this.radius == circle.radius)
		return true;
	
	return false;
}

}
public class Object4_equals_Circle {

	public static void main(String[] args) {

		Circle circle = new Circle(10); //반지름에10넣은객체생성
		
		System.out.println(circle);  //toString오버라이딩 안해주면 기본값인 주소가 출력됨
	}
}
//원의 넓이는 314.1592이고 반지름은 10인 원