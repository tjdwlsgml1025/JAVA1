package SangSok;

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number=num;
	}
	public void answer() {
		System.out.println("Hi~ form"+number);
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in"+androidVer);
	}
}
//polymorphism = 다형성

public class Sangsok4_Polymorphism {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-4323-4543", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-9999-8877","Nougat"); //클래스명과생성자명이다름=다형성 부모=자식
		
		ph1.answer();
		System.out.println();
		
		ph2.answer();
		//ph2.playApp();컴파일 에러나는 이유:폴리몰티즘, 자식거가 메모리에 안올라가서 호출못해
