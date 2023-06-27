package timer;
	class GetSum{
		int num;
		
		void setNum(int num1) {
			num = num1; //숫자를 넣기 위해 메서드 하나 만듦 
		}
		
		int sum() {
			int sum = 0;
			for(int i =1; i <= num; i++) {
				sum = sum+i;
			}
			return sum; //넣은 숫자만큼 더하게 예를들면 100까지 더하는 메서드를만듦
		}
	}




public class GetsumPractice {

	public static void main(String[] args) {
		
		GetSum getsum = new GetSum();  //합값을 메모리에 올림
        int num; 
        num = 100; //100을 넣어줌

        getsum.setNum(num);  //겟섬안에 셋넘함수를 넣어줌
        num = getsum.sum();  //넘은 합계라고 설정해줌 ( 위 넘이랑은 상관없음 클래스끝났으니까)
        System.out.println(num);
        

        getsum.setNum(1000);
        num = getsum.sum(); 
        System.out.println(num);
	}

}
