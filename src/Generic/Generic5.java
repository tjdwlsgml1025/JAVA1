package Generic;
class BoxFactory{ //제너릭이 클래스가 아닌 메서드 안에 있는것
	public static <T>Box<T> makebox(T o){ 
		Box<T>box = new Box<T>();
		box.set(o);
		return box;
	}
}



public class Generic5 {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.<String>makebox("Sweet"); //위의 T를 다 String으로 바군다생각해
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.<Double>makebox(6.43); //위의 T를 다 Double으로 바군다생각해
														//뒤에 Double은 생략가능
		System.out.println(dBox.get());
		
		
	}

}
