package Wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(29); //wrapper class 객체 생성
		
		Integer iObj=10; //오토박싱 : 인스턴스가 와야할 위치에 기본 자료형 값이 오면 오토박싱진행
		iObj++; //11나옴
		System.out.println(iObj.intValue());
		
		
		int num = iObj; //언박싱:기본 자료형 값이 와야할 위치에 인스턴스가 오면 언박싱 진행
		
				
		System.out.println(Integer.MAX_VALUE); //int의 맥스값21억
		System.out.println(Integer.MIN_VALUE);// int의 최솟값
		
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		
		Double num2 = new Double(3.14);//더블 
		
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
	}

}
