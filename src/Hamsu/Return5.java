package Hamsu;

public class Return5 {

	public static int getAscCode(char ch) {   //char ch:괄호안에 65는 숫자65가 아니라 문자65라고 알려줌
		return(int)ch; 		
		//문자를 정수로 바꾸는 거니까 int>ch로 리턴값만 해주면 됨
	}
		
	public static void main(String[] args) {
		int code = getAscCode('A');
		System.out.println(code); //65
		
		code = getAscCode('a');  //위 code에 이미 int값설정했으니까 또 설정하면 에러남, 이미 변수명이 있으니까ㅁ?머라는겨>밑참고
		System.out.println(code); //97  
		
//		
//// 코드에서 code 변수는 main 메서드 내에서 두 번 사용되고 있습니다.
//처음에 int code = getAscCode('A');와 같이 선언 및 초기화되고 있습니다. 이는 'A'의 ASCII 코드 값을 저장하기 위한 변수입니다.
//code에 이 경우에는 변수를 다시 선언할 필요가 없으며, 이미 선언된 변수를 그대로 사용하여 값을 변경하면 됩니다.
//		
}

}
