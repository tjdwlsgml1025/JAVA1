package Generic;




//지네릭 문법 = 데이터 타입을 파라미터화 시킴
class DBox<L,R>{ //몇개라도 정의할수있음
	private L left; //왼쪽수납공간
	private R right; //오른쪽수납공간 
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + "&" + right; //객체+문자열이 섞여 있기 때문에 타입정의 안해줘도 문자열로 출력함
	}
}


public class Generic3 {

	public static void main(String[] args) {
	DBox<String, Integer> box = new DBox<String, Integer>(); //데이터타입 정수,문자열을 객체로넣어줌(뤠퍼클래스)
	DBox<Apple, Orange> box2 = new DBox<>(); //데이터타입 세팅 안함 객체넣음
	
	
	box.set("Apple",25);
	box2.set(new Apple(),new Orange()); 
	
	
	System.out.println(box);
	System.out.println(box2);
	
	
	
	
	
	}

}
