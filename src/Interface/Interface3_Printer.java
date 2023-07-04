package Interface;

//MS에서 제공하는 인터페이스
interface Printable{
	public void print(String doc);
}

class SprinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);	
	}	
}

class LprinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}


public class Interface3_Printer {

	public static void main(String[] args) {
		
		String myDoc = "This is  a report about.";
				
		//삼성프린터로 출력
		Printable prn = new SprinterDriver(); //다형성 >부모는 자식이다
		prn.print(myDoc);
		System.out.println();
		
		//LG프린터로 출력
		prn = new LprinterDriver();
		prn.print(myDoc);
		
		
	}

}
