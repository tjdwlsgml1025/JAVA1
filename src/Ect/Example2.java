package Ect;

public class Example2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		int max;

		max = (a < b) ? b : a;
		max = (b < c) ? c : b;

		System.out.println(max);

	}
}
