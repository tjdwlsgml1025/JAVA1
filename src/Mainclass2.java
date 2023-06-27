
class Circle{
	double radius; //변수선언 > 게터세터 넣기
	final double PI = 3.14; //파이값을 위해 변수선언

	public double getRadius() {
		return radius;  //원의 넓이를 가져오는 함수
	}

	public void setRadius(double radius) { //외부값받아서 원의넓이를 변경하는 함수
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*PI;  //원의 넓이 곱하는 함수만듦
	}
	
}



class Mainclass2 {
	public static void main(String[]args) {
		int num = 0;
		
		Circle circle = new Circle();  // 객체생성
		// Circle circle;
		//circle = new Circle()
		// 위 두줄을 줄여서 저거임Circle은 참조형데이터타입임 (데이터타입=9가지종류8개+참조형)
		
		circle.setRadius(10); //함수호출?

		
		System.out.println(circle.getArea());
	}
}

//원:무수한 점의 모임