 class Gugudan{
	 void printGugu(int num) { //메서드 반드시 설정할 것@
	
	 for (int i = 2; i <=num; i++) {
       	
           for (int j = 1; j < 10; j++) {
               System.out.println(i + "x" + j + "=" + (i * j));
           }
           System.out.println();      
       }
	 }
 }	

public class MainClass6grade {
	public static void main(String[]args) {

		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터10단까지출력
		gugudan.printGugu(20); //1단부터20단까지출력
}
}
