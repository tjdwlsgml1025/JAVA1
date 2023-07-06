package Thread;
import javax.swing.JOptionPane;

class CountDownThread extends Thread {	
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}

class PrintThread extends Thread {
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("아무거나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다");
	}
}

public class Thread3_multy { 
	public static void main(String[] args) {
		
		CountDownThread countDownThread = new CountDownThread();
		PrintThread printThread = new PrintThread();
		
		countDownThread.start();
		printThread.start();
	}
}
