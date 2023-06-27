package timer;


	class Gugudan{
		void printGugu(int num) {
			for (int i = 2; i<=num; i++) {
				for(int j =1; j<10; j++) {
					System.out.println(i + "X" + j + "=" + (i*j));
				}
				System.out.println();
			}
		}
	}

public class MainClassgugudanPractice {
	public static void main(String[]args) {

	Gugudan gugudan = new Gugudan();
	
	gugudan.printGugu(10);
	}

}
