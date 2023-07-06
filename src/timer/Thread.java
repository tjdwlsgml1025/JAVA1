package timer;

import javax.swing.JOptionPane;


class Print3 extends Thread{
	String input = JOptionPane.showInputDialog("아무거나입력");
			System.out.println("입력하신 값은"+input+"입니다");	
}
class Print4 extends Thread{	
	@Override
	public void run() {
			for(int i=10; i>0; i--) { //10에서 하나씩 줄여가며 
				System.out.println(i);
				
				try{ 
					Thread.sleep(1000); //1초동안 이만큼 지연delay된다 / 1초마다 하나씩 뿌려줌
					} catch(Exception e) {}
			}
}
public class Thread {

	public static void main(String[] args) {
		Print3 th1 = new Print3();
		Print4 th2 = new Print4();
		
		th1.start();
		th2.start();
		
	}

	public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

			
	}

}
