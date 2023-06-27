class Accumulator{
	private static int sum = 0;
	
	public static void add(int i) {
		sum=sum+i;
	}
	
	public static void showResult(){
		System.out.println(sum);
	}

}



public class StaticPractuice {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++)
		    Accumulator.add(i);
		
		Accumulator.showResult();

	}

}


