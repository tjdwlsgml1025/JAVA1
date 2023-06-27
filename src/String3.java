


public class String3 {

	public static void main(String[] args) {
		String st1 = "coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);
		System.out.println(st3); // .concat : st1을 기준으로 st1 + st2 >Concat
		
		String st4 = "Fresh".concat(st3); //문자열.concat(문자열함수) > 마찬가지로 리터럴다이렉트로 함수에 써먹어 이어줌
		System.out.println(st4); 

	}

}
