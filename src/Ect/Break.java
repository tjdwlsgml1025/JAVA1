package Ect;

public class Break {

	public static void main(String[] args) {
		// 1부터 100까지 수 중에 11의 배수이자 7의 배수인 첫번째 숫자
		
		for (int i=1; i<=1000; i++) {
			if((i%7 == 0)&&(i%11 ==0)) { //&&연산자 써서 두개의 조건넣기 7의 배수와 11의 배수
				System.out.println(i);
				break;} //첫번째수만 나올 수 있게 브레이크써서 for문을 빠져나와 if조건식안에 들어가면 안되니까 중괄호함쳐			
		}
		
		
		
		

	}

}
