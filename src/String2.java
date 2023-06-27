//문자열:문자들의 배열
public class String2 {

	public static void main(String[] args) {
		String str1 = "Simple String"; //리터럴로 객체 생성
		String str2 = "Simple String"; 
		
		String str3 = new String("Simple String"); //new키워드로 객체 생성
		String str4 = new String("Simple String");
		
		str1 = str1 + str2; //1,2두개 더한값이 출력됨 문자열끼리 더하면 문자열이니까
		
		if(str1 ==str2) 
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		//다른 언어에서는 == (자바 스크립트, 파이썬)자바에서는 if(str1.equals(str3))=동일하게맞춰줌
		if(str3 == str4)
			System.out.println("str2과 str3는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조"); //new하면 각각 주소값을 가진 방이 생성되니
		
	
	}

}
