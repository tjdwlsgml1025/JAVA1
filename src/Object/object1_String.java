package Object;


class AAA{
	
	@Override
	public String toString() { 
		return"이것도 메롱이다.";
	}
}
public class object1_String {

	public static void main(String[] args) {
		
		String str = new String("메롱"); //String객체생성
		System.out.println(str);
		
		
		AAA aaa = new AAA(); //null이 아니면 부모(Object)에 있는 toString호출, 자식이 오버라이딩했으니까 자식거나옴
		System.out.println(aaa); //스트링 재정의 안했으면 주솟값이 나왔을거임
		
		//println을 object 클래스에 오버라이딩 해둠(object가 최고 부모니까)
		//println(object X)참조형임.
		//=다형성 적용돼서 aaa값이 나오는거임
	}

}
