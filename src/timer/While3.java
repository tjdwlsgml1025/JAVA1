package timer;

public class While3 {

	public static void main(String[] args) {
		int kor , eng, math;
		int total;
		double avg;
		char grade = '가';
		
		kor = 90;
		eng = 70;
		math = 80;
		
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		if (avg >= 90) {
			grade = '수';
		 
		}else if (avg >= 80) {
			grade = '우';
		
		}else {
			 grade = '미';
		}
				
	    System.out.println("총점:" + total);
		System.out.println(" 평균: " + avg);
		System.out.println("성적:" +grade);
		
	

	}

}
