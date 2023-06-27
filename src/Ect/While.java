package Ect;

public class While {

	public static void main(String[] args) {
		int num = 1;

		while (num <= 100) {
			System.out.println("Hello World!" + num);
			num++; //num값이 1씩 증가하니까 조건식이 거짓이 될 때 멈춘다.
		}

	}

}
