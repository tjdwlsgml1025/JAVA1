package Thread; //멀티 쓰레드 =번갈아가며 실행하기

class MyThread1 extends Thread { //쓰레드 상속받기
	@Override
	public void run() {  //음악재생
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}

	} // run() = 쓰레드가 또 다른 프로그램이니까 run은 메인이나 마찬가지
}

class MyThread1 implements Runnable{ //인터페이스Runnable를 구현하는 자식을 만드는방법도 있음(구현부는 위와 동일)
	for (int i = 0; i < 300; i++) {
		System.out.print(new String("-"));
	}

}
} 

class MyThread2 extends Thread {
	@Override
	public void run() { //영상재생
		System.out.println(getName()); //부모클래스에 있는 해당쓰레드이름을 얻을 수 이씀=디폴트
		
		for (int i = 0; i < 300; i++) {
			System.out.print(new String ("|"));
		}

	}// run()
}

public class Thread1 {
	public static void main(String args[]) {
		
		String name = Thread.currentThread().getName();
		System.out.println(name); 
		
		MyThread1 th1 = new MyThread1(); // 멀티쓰레드
		MyThread2 th2 = new MyThread2();
		
		th1.start(); //run을 바로 실행시키면 안됨,start로 호출함 > JVM이 Os에게 요청하는것
		th2.start(); //os가 쓰레드 기준으로 컨텍스트스위칭=돌려줌
		
		Runnable runnable = new MyThread1(); 인터페이스부분을 호출하는 방법
		Thread th3 = new Thread(runnable); 쓰레드생성해야함
		th3.start();
	}

	/**
	 * for(int i=0; i<300; i++) { //싱글쓰레드 System.out.println("-"); } for(int i=0;
	 * i<300; i++) { System.out.println("|"); }
	 **/
}
