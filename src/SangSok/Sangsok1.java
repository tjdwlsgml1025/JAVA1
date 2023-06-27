package SangSok;
//기존에 있던것=선배가만든것=건들면안된다
class A{ //부모됨
	int a = 10;
	public void aa() {
		System.out.println(a);
	}
}

//reuse 재사용 하기 위해 상속이 나왔음 
class B extends A {   //상속됨, A의 자식이 되겠다, 확장한다 
	int b = 20;
	
	//기본적으로 부모의 함수 및 변수의 접근 방법은 super
	
	public B(int a, int b) { //부모 파라미터 생성해주고
	super.a=a; //부모멤버변수a에 파라미터a값할당(부모클래스의멤버변수에 값을 할당)
	super(a);  //부모멤버변수접근방법=슈퍼생성자,부모클래스의생성자를 호출하여 인스턴스값초기화
	this.a=a;//보통 이걸로 접근해도되긴해
	this.b=b;//본인생성자홏출
	}
	
	public void bb() {
		System.out.println(b);
	}
}


public class Sangsok1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		
		B b = new B();
		System.out.println(b.a); //부모 변수를 뽑을 수 있어 , B가 A를 상속해서 포함하고 있으니까! 
		
		b.aa(); //부모의 메소드 호출도 가능
		System.out.println(b.b); //본인 것도 호출 가능
	}

}
