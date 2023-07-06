package Thread;

class Account{
	int balance = 1000;
	
	public synchronized void withdraw(int money) { //동기화 붙여주면 중복되는 오류 없어짐=하나가끝날때까지다른거실행X
		if(balance >= money) {
			try {Thread.sleep(1000); //t1이 여기서 멈춰있는데 t2가 출금시도해서 둘이 중복되기 때문에 마이너스계좌가 되는 오류가생김
			} catch (InterruptedException e) {		
				e.printStackTrace();
			}
			balance = balance - money;
		}
	}
}

class RunnableAccount implements Runnable{
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance > 0) {
			//100,200,300 중의 하나 값을 임으로 선택해서 출굼
			int money = (int)(Math.random()*3+1)*100; //3개랜덤뽑기하면 123 나오니까 100곱해주기
			acc.withdraw(money);
			System.out.println("balance:" + acc.balance);
		}
		
	}
}

public class Thread4_Synchronized {
	public static void main(String[] args) {
		Runnable r = new RunnableAccount();
		
		Thread t1 = new Thread(r,"첫번째");
		//Thread t2 = new Thread(r,"두번째"); //쓰레드 이름 설정 
		
		t1.start();
		//t2.start();

	}

}
