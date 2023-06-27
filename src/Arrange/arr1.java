package Arrange;

public class arr1 {

	public static void main(String[] args) {
		
		int num = 5;
		
		//선언 방법 = 메모리할당
		int [] arrNum = new int [5];  //배열 선언 > 데이터타입:인트배열 //int가 5개라는 뜻 4byte의 방이 5개
		double [] arrDou = new double[5]; // 데이터타입:더블배열
		long[] arrlong = new long [7];
		
		String[] arrStr = new String[5];
//		Circle2[] arrCircle = new Circle2[5]; //내가 만든 것도 배열 선언 가능	
		//배열은 무조건 연속적으로 잡혀야함
		
		System.out.println(arrNum.length); // 5 length는 방의 개수임, 함수가아니라 변수임
		System.out.println(arrlong.length); //7
		
		arrNum[0] = 5; // 0번째방에 5를 넣는다  인덱스는 0부터 시작해
		arrNum[1] = 4;
		arrNum[2] = 3; //인덱스에 값을 넣는거 write
		arrNum[3] = 7;
		arrNum[4] = 8;
		
		System.out.println(arrNum[2]); //값을 출력할땐 인덱스값을 쓴다 > 값을 출력하는것: read라고 함
	
		for (int i=0; i< arrNum.length; i++) //인덱스는 0이니까 0부터 선언도니 방길이까지! 공식이니까 암기
			System.out.println(arrNum[i]);  //배열 전부 뽑는것! 배열은 for문이랑 같이 씀
		
	
		//로또하는 법-랜덤숫자뽑기 //랜덤은 소숫점이니까 int로형변환 해줘야함
		System.out.println((int)(Math.random()* 10+1)); //랜덤으로 1부터 10까지
		System.out.println((int)(Math.random()* 45+1)); //랜덤으로 1부터 45까지
		
		//(int)(Math.random() * 범위 + 시작값)
		
		
		
	}

}
