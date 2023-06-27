package Hamsu;

public class Hamsu2 {

	public static void showFunction() {
		System.out.println("함수1");
		System.out.println("함수2");
	}
	
	public static void hiCar() {
		System.out.println("안녕하세여, 함수입니다");

	}
	
	public static void showStar1() {
		for(int i=0; i<5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
		
		

	}
	
	public static void main(String[] args) {
		showFunction(); 
		hiCar();
		showStar1();
		//함수호출은 괄호이용해서! 
	}


}
