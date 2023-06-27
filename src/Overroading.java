
//함수오버로딩 = 같은 함수 이름을 쓸 수 있다.(파라미터의 데이터 타입 또는 갯수를 달리 해서)
class A{
	public void a() {
		System.out.println("함수a");
	}
	
	public void a(int a) {				//파라미터가 다르면 중복함수명가능=오버로딩
		System.out.println("함수a"+a); 
	}
	
	public void a(int a, int b) {
		System.out.println("함수a"+ (a+b)); //마찬가지
	}
	
	public void a(double a) {
		System.out.println("함수a double"+ a);
	}

}

public class Overroading {

	public static void main(String[] args) {
	
		A a = new A();
		a.a(); //생성자는 이름 중복 가능
		a.a(7); //두번째 함수 호출
		a.a(7,7);
		a.a(3.1); 
	}

}
