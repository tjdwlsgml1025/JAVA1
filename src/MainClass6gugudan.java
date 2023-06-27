class Grade {
	int kor, eng, math; //인스턴트 변수

	void setGrade(int kor, int eng, int math) { //인스턴스 메서드(변수를활용)
		this.kor = kor;
		this.eng = eng;
		this.math = math; //변수와 메서드를 구분하기 위해 사용,위에 정의한 변수랑 연결짓는역할
	}

	double getAvg() { // 평균 구하기
		return (kor + eng + math) / 3.0;
	}

	char getGrade() {
		char ch = '가';
		double avg = getAvg(); //만들어둔 함수 호출 //클래스범위에없으니까 호출 필수
		
		if(avg >=90) {
			ch='수';
		}
		else if (avg >=80) {
			ch='우';
		}
		else if (avg >=70) {
			ch='미';
		}
		else if (avg >=60) {
			ch='양';
		}
		
		return ch;
	}
}

public class MainClass6gugudan {
	public static void main(String[] args) {
		Grade kim = new Grade(); //1. 킴이라는 객체 생성
		
		kim.setGrade(80, 90, 70);  //2. 킴의 변수?입력, 즉 세팅!!
		
		System.out.println(kim.getAvg());  //3. 킴의 평균 프린트 겟하기!
		System.out.println(kim.getGrade());
		
		
		///박씨의 경우는?
		Grade park = new Grade(); 
		
		park.setGrade(50, 60, 80);   
		
		System.out.println(park.getAvg());  
		System.out.println(park.getGrade());
		
		

	}
}
