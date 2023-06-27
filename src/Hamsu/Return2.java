package Hamsu;

public class Return2 {

	
	public static double getCircleArea(int radius) {
		final double PI = 3.14; //파이값 설정 파이널=상수로 만들어줌(파이값이고정돼야니까변하면x)
		
		return radius * radius * PI; //원의 공식		
	}
	
	public static void main(String[] args) {
		double area = getCircleArea(10);
		System.out.println(area); //314.0이나와야해
		
	}

}

//사각형 넓이 구하기
//원의 공식 반지름*반지름*3.14 파이r제곱