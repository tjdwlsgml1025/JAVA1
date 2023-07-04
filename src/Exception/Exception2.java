package Exception;

import java.util.Scanner;  
import java.util.InputMismatchException;


public class Exception2 { //트라이 캐치 활용 = 1. 안죽게할려고 2. 예외처리

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {

			System.out.println("a/b...a?");
			int n1 = kb.nextInt();

			System.out.println("a/b...b?");
			int n2 = kb.nextInt();

			System.out.println(n1 / n2);

		} catch (ArithmeticException e) { // 예외객체 -수학적 미스
			e.printStackTrace(); //스택메모리구조에 있는 함수가 호출된 순서대로 찍어라
		
		} catch (InputMismatchException e) { //예외객체 - 다른 데이터타입넣었을때(문자열
			e.printStackTrace();
		}	
		//둘이상의 예외처리 구성 | or니까 이것도 가능
	//}catch(ArithmeticException|InputMismatchExceptio e){
		// e.printStackTrace();
		ㅇ
		System.out.println("Good bye~~!");
	}
}
