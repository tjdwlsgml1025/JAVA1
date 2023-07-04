package timer;
import java.util.ArrayList;
import java.util.List;

public class Arraylist_1_10 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i =1; i<=10; i++) {
			numList.add(i);
		}
		
		int sum=0;
		for(Integer num:numList) {
			sum+=num;
			System.out.println(sum);
		}
	}

}
