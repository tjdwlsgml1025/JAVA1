package timer;

	class Grade{
		int kor, eng, math;
		
		void setGrade(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		double getAvg() {
			return(kor + eng + math) /3.0;
		}
		
		char getGrade() {
			char ch = '가';
			double avg = getAvg(); //클래스범위에없으니까 호출 필수
			
			if(avg>=90) {
				ch ='수';
			}
			
			else if(avg>=80) {
				ch='우';
			}
			else if(avg>=70) {
				ch='미';
			}
			
			return ch;
	
		}	
		
	}

public class GradePractice {

	public static void main(String[] args) {
	Grade kim = new Grade();
	
	kim.setGrade(80,90,70);
	
	System.out.println(kim.getAvg());
	System.out.println(kim.getGrade());
		
		
	}

}


