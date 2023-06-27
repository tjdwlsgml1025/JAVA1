
//static의 위치 잘 확인할 것!

public class Static3 {
	
	static class Accumulator{
		private static int sum = 0; //sum값이 0이라고 선언해주기
		
		public static void add(int i) {
			sum = sum+i;    //sum에 대한 add함수 만들기
		}
		
		public static void showResult() {
			System.out.println(sum); //sum프린트하는 쇼리절트함수 만들기
		}
	}
	
	
	public static void main(String[] args) {
		Accumulator add = new Accumulator();
			
		for (int i = 0; i <= 10; i++)
	         Accumulator.add(i); // 전달되는 값을 모두 누적

	      Accumulator.showResult(); // 최종 누적 결과를 출력
	}

}


//sum = 55 출력값