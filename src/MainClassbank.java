
class BankAccount {
	int balance = 0; // 예금 잔액

	BankAccount() {
		System.out.println("생성자시작");
	} // 디폴트 생성자 함수(컴파일러가 안넣어도 자동생성해주니까 안써도돼)
	
	BankAccount(int balance){ 
		this.balance = balance;
		System.out.println("생성자시작2");
	} //개발자가 생성자함수 만들어버리면 디폴트생성자가 사라짐!!
	

	public int deposit(int amount) { 
		balance += amount; // 원래값에 더하니까 ref1+ref2
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;

	}
}

public class MainClassbank {
	public static void main(String[] args) {

	
	  BankAccount ref1 = new BankAccount(); BankAccount ref2 = ref1; //
	  
	  ref1.deposit(3000);// 주소값에 3000저장 ref2.deposit(2000);// 주소값에 2000추가 저장 = 5000
	  
	  ref1.withdraw(400); // 5000-400-300 ref2.withdraw(300);// 5000-400-300 하나의
	//  메모리를 같이쓰니까 중복돼서 같이 계산해야함!!
	  
	  ref1.checkMyBalance(); // 4300 (5000-700) ref2.checkMyBalance();
	 

	// check메서드
	public static void check(BankAccount acc) { // Bankaccount acc = ref
		acc.checkMyBalance();
	}
	
	
	
	

	// main메서드
	public static void main(String[] args) {

		String name = "홍길동";// new안해도되는 인스턴스가 생기는 참조형데이터 ""쓰면됨

		BankAccount ref;
		ref = new BankAccount(); // new뒤는 생성자함수임(클래스랑이름이같은함수임)

		// 위 두줄 줄인게 인거 BankAccount ref = new BankAccount();

		ref.deposit(3000);
		ref.withdraw(300);

		check(ref);
	}

}