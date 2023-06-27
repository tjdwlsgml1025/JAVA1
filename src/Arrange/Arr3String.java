package Arrange;

public class Arr3String {

	public static void main(String[] args) {
		String[] arrStr = new String[2]; //스트링 방 두개 생성
		arrStr[0] = "String 1";
		arrStr[1] = "String 2";

		System.out.println(arrStr[0].length()); // 0번째 방의 문자열 길이 출력 //length는 함수니까 ()필수
		System.out.println(arrStr[1].length()); // 1번째 방의 문자열 길이 출력

		int sum = 0;
		for (int i = 0; i < arrStr.length; i++) { //for문돌아가니까 0번방찾아가서세고, 1번방찾아가서 셈
			sum = sum + arrStr[i].length();
		}
		
		System.out.println("두 문자열의 길이 합계: " + sum);
	}

}