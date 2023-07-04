package timer;

import java.util.Scanner;

public class Numbergame {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100 + 1);
		int num = 0;
		int count = 1;
		Scanner sc = null;

		while (true) {
			System.out.println("1~100 사이의 숫자를 맞춰보세요");

			try {
				sc = new Scanner(System.in);
				num = sc.nextInt();

				if (num > answer) {
					System.out.println("DOWN");
				} else if (num < answer) {
					System.out.println("UP");
				} else if (num == answer) {
					System.out.println("정답입니다. " + count + "회만에 맞추셨어요");
					break;
				}
				count++;
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
			}
		}

		sc.close();
	}

}
