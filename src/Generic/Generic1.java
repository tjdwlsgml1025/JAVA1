package Generic;
class Apple {
 
}

class Orange {

}

class Box<T>{ //T/타입 매개변수
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

//지네릭=파일을 컴파일 시점에서 미리 정하고 들어감
public class Generic1 {

	public static void main(String[] args) {
		Box<Apple> aBox= new Box<Apple>(); //Apple이 T에 올라감 메모리에T가올라감
		Box<Orange> oBox = new Box<Orange>();
		
	
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
	}

}
