import java.util.Scanner;

class Grade {
	private int kor, eng, math;
	private String name;

	Grade(String name, int kor, int eng, int math) { // 생성자 만들면 게터세터 필요없음!! 이거 잘확인해
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void show() {
		System.out.println(name + "님의 평균은" + getAvg() + "성적은" + getGrade() + "입니다.");
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

public class String8Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		Grade grade = null;
		int kor, eng, math;
		String name;
		
		
		//////////////////// 사용할 변수선언 쭉~ 해주기 그럼 밑에서 또 안해줘도 됨
		
		while(true) {
		System.out.print("이름:");
		
		name = sc.next(); // next.데이터타입 주의할것

		System.out.print("국어점수:");
		kor = sc.nextInt();

		System.out.print("영어점수:");
		eng = sc.nextInt();

		System.out.print("수학점수:");
		math = sc.nextInt();

		grade = new Grade(name, kor, eng, math); //객체생성,Grade내용물 빼서 grade안에 이것들 넣는다고
		
		grade.show(); //만들어둔 쇼 인포 가져와
		
		System.out.println("계속?Yes/No");
		String choice = sc.next(); //예스올노 입력값받기
        
		if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) 
		    continue;
		else 
		    break;
		}
		System.out.println("종료되었슴");

	}

}
