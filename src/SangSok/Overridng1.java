package SangSok;


class Cake{  //부모클래스
	public void yummy() {
		System.out.println("Yummy Cake");
		
	}
}

class CheeseCake extends Cake { //자식클래스
	public void yummy() {  //같은 이름으로 오버라이딩=부모의 속성 재정의
		System.out.println("Yummy cheese Cake");
		
	}
}

//매서드 오버라이딩 = 상속관계에서 똑같은 함수 이름(이름, 리턴타입, 파라미터 종류와 갯수 무조건 다 같아야함)
public class Overridng1 {

	public static void main(String[] args) {
	Cake c1 = new CheeseCake(); //재정의 된 값으로 부모가 출력됨
	CheeseCake c2 = new CheeseCake();
	
	c1.yummy();
	c2.yummy();
		
	}

}
