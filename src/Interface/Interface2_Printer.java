package Interface;

//어렵게하는법
//삼성에서 만들어둔 클래스
class SamsungPrinter{
	public void printSamsung(String doc) {
		System.out.println(doc+"프린트 되었습니다");
	}
}

class LGPrinter{
	public void printLG(String doc) {
		System.out.println(doc+"프린트 되었습니다");
	}
}

//쉽게 하는 방법
//마이크로소프트 회사가 인터페이스를 만듦  (강제)함수이름을 통일해줌
interface Printable{
	abstract public void print(String doc);   //표준을 만들어서 강제시킴
}
//삼성개발자가 만듦
class Samprinter implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println("삼성 프린트" +doc);
	}
}

//엘지개발자가 만듦
class LGprinter implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println("LG 프린트"+doc);
	}
}


//내가 짠 메모장
public class Interface2_Printer {

	public static void main(String[] args) {
		SamsungPrinter samsung = new SamsungPrinter();
		samsung.printSamsung("안녕하세요");
		
		LGPrinter lg = new LGPrinter(); //제조사 별로 객체생성하고 이런게 너무 힘들어!! > 인터페이스이용하면됨
		lg.printLG("LG입니다");
		
/////		
		Printable print = new Samprinter();  //다형성 적용
		print.print("프린트합니다");
	}

}
