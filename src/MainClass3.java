
///클래스와 객체(인스턴스)의 차이:
class Rectangle {
	double width, height;
	
	void setWidthHeight(double width, double height) { //줄여서 한줄로 쓴거임!
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width*height;
	}
}

public class MainClass3 {   //실행은 이거로!!
	public static void main(String[] args) {
		
	Rectangle rec = new Rectangle();  //rec:올라간 메모리를담은 객체 + new:Rectangle.class를메모리에올리는것
	rec.setWidthHeight(10, 5);
	
	System.out.println(rec); //객체를 때려넣으면 rec의첫번째주소호출됨=해시코드가나옴
	System.out.println(rec.getArea());
	
	//객체여러개 생성가능
	Rectangle rec2 = new Rectangle(); 
	rec.setWidthHeight(10, 10);
	
	System.out.println(rec.getArea());
	
		
	}
}