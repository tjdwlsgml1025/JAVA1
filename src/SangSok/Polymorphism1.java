package SangSok;



class AA{
	public void aa{
		System.out.println("aa함수입니다");
	}
}

class B extends AA{
	public void bb{
		System.out.println("bb함수입니다");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		
		AA aa= new AA();
		System.out.println(aa);
		
		BB bb = newBB();
		System.out.println(aa);
		
		AA aa = new BB(); //다형성, 부모타입에 자식객체생성할 수 있다
		aa.aa(); //가능!
		aa.bb(); // 에러남 왜냐면 데이터타입이 AA부모니까 부모거만 접근할 수 있어서
		
		BB bb = new AA(); //자식=부모는 안된다!메모리 그렸을 때 오른쪽에 bb함수가 없어서
		
		
	}

}
