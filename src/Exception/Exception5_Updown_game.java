package Exception;

import java.util.Scanner;

public class Exception5_Updown_game {

	public static void main(String[] args) {
		Scanner sc = null;
		int answer = (int) (Math.random() * 100 + 1); // 필요한 변수먼저 선언
		int num = 0;
		int count = 1;

		while (true) {
			System.out.print("1~100 사이에 숫자를 맞춰보세요: ");
			try {
				sc = new Scanner(System.in);
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue; //잘못된거니까 처음으로 돌아가도록(카운트도 보호할 수 있게 여기에 작성함)
			}			
			if (answer < num) {
				System.out.println("Down");

			} else if (answer > num) {
				System.out.println("Up");

			} else if (num == answer) {
				System.out.println("정답입니다 " + count + "회만에 맞췄어요");
				break;
			}	count++; // 한판 돌았으니 카운트 올라가야함
		}

	}
}
