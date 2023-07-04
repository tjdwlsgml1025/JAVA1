package Interface;
//인터페이스 자손이 구현하라. 
/*class Printable1{
	public void print(String doc) { } //구현부body가 필수 { } 
}*/
//인터페이스 안에 올 수 있는 것은 함수구현(X)->추상메서드와 상수만 올 수 있다
interface Printable{ //인터페이스명, 구현부필요없음 { }X //여기가 부모야!
	abstract public void print(String doc); //함수선언=함수 정의 =abstract추상메서드 //오버라이드당함
	
}

interface Movable{
	abstract public void move(); 
}

class Printer implements Printable, Movable{ //implements(구현하다) + 인터페이스명 //인터페이스를 구현하는 부분, 자식임

	@Override
	public void print(String doc) { //오버라이드함
		System.out.println(doc);
	} 
	
	@Override
	public void move() { //다중상속됨
		System.out.println("움직입니다");
	} 

}


public class Interface1 {

	public static void main(String[] args) {
		Printer printer = new Printer(); //인터페이스명 + 변수명 = new 자식명 //인터페이스도 다형성이 적용됨
		//자식이구현
		printer.print("안녕하세요");
		printer.move();
	}

}
