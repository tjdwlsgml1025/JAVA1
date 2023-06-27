package timer;

import java.util.Scanner;

class Grade {
	private int kor, eng, math;
	private String name;

	Grade(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void show() {
		System.out.println(name + "님의 평균은 " + getAvg() + "이고, 성적은 " + getGrade() + "입니다.");
	}

	public double getAvg() {
		return (kor + eng + math) / 3.0;
	}

	public char getGrade() {
		char ch = '가';
		double avg = getAvg();

		if (avg >= 90) {
			ch = '수';
		} else if (avg >= 80) {
			ch = '우';
		} else if (avg >= 70) {
			ch = '미';
		} else if (avg >= 60) {
			ch = '양';
		}

		return ch;
	}
}

public class Scanner_Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Grade grade = null;
		int kor, eng, math;
		String name;

		while (true) {
			System.out.println("이름을 입력하세요:");
			name = sc.next();

			System.out.print("국어 점수: ");
			kor = sc.nextInt();

			System.out.print("영어 점수: ");
			eng = sc.nextInt();

			System.out.print("수학 점수: ");
			math = sc.nextInt();

			grade = new Grade(name, kor, eng, math);
			grade.show();

			System.out.println("계속하시겠습니까? (Y/N)");
			String choice = sc.next();

			if (choice.equalsIgnoreCase("Y")) {
				continue;
			} else {
				break;
			}
		}

		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
