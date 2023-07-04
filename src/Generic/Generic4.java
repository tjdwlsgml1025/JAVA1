package Generic;
class Box2<T extends Number>{ //내부타입을 제한하는 것, Number를 상속하는 T
	private T ob;
	
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
public class Generic4 {

	public static void main(String[] args) {
		Box2<Integer>iBox = new Box2<>(); //Box2의 변수들을 다 Integer로 바꿔주는거 , 뒤에있는 <Integer>는생략가능
		Box2<Double> dBox = new Box2<>();
		
		iBox.set(24);
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
		
		
		
	}

}
