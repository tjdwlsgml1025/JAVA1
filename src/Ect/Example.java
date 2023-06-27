package Ect;

public class Example {

	public static void main(String[] args) {
				
		int num1 = 6;
		int num2 = 10;
		int num3 = 1;
		
		int max = num1;

		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		
		System.out.println("최대값 : " + max);

	}

}
