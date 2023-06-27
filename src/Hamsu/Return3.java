package Hamsu;

public class Return3 {

	public static double getRectangleArea(double width, double height) { 
		//더블 인트 둘다가능 근데 더블로맞춰주면좋아	
		return width*height;
		
	}		
		public static void main(String[] args) {
		
			double area = getRectangleArea(10,20); 
			//사각형구하기 가로곱하기세로 아리아값설정해줬으니까, 아리아도 데이터타입 꼭 설정할 것
			System.out.println(area); //200.0
			
			
	}

}
