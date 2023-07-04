package Exception;

import java.util.Scanner;

public class Exception1 {

	
//에러처리=예외처리
//2가지 방법
//1.try catch finally 2. throws
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			//System.out.println(3/0); //말도안되는 연산해도 죽이지않고 종료입니다가 나옴
			
			int num = sc.nextInt();
			System.out.println(num);
			
		} catch(Exception e) {	
			System.out.println("캐취안입니다,에러발생"); //에러가 나면 캐취로 간다,여기에 에러나면 해야할 것 넣기
		}finally{
			System.out.println("파이널입니다무조건타요"); //파이널은 무조건 탐
		}
		System.out.println("종료입니다"); //종료도 무조건 탐

	}

}
