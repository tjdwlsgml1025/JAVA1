import java.util.Scanner;

public class String6Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어");
		int num1 = sc.nextInt();
		
		System.out.print("수학");
		int num2 = sc.nextInt();
		
		System.out.print("영어");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println(sum);
	}

}


//입력값 받아서 계산하는 Scanner클래스!!
//밑에 키보드입력을 해줘야함