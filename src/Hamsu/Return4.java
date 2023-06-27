package Hamsu;

public class Return4 {

	public static double getTriangleArea(double width, double height) {
		
		return width*height*0.5;
		//설정이 더블이니까 나누기2도 소수로 /2.0도가능
			
	}
		
	public static void main(String[] args) {
	
		double area = getTriangleArea(40,20); //삼각형구하기밑변*높이 / 2
		System.out.println(area); //400.0
		
		
}
	
}
