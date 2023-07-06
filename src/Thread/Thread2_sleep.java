package Thread;

import javax.swing.JOptionPane;

//출력1번
	class Print1 extends Thread{
		String input = JOptionPane.showInputDialog("아무거나 입력하세요"); //입력값이 String으로 들어가게
		System.out.println("입력하신 값은"+input+"입니다");
		
	}
	
	//출력 2번
class Print2 extends Thread{	
	@Override
	public void run() {
			for(int i=10; i>0; i--) { //10에서 하나씩 줄여가며 
				System.out.println(i);
				
				try{ 
					Thread.sleep(1000); //1초동안 이만큼 지연delay된다 / 1초마다 하나씩 뿌려줌
					} catch(Exception e) {}
			}
}

public class Thread2_sleep {
	public static void main(String[] args) {
		
		Print1 th1 = new Print1();
		Print2 th2 = new Print2();
		
		th1.start();
		th2.start();
		
		
		
	}
}


