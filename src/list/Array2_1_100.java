package list;
import java.util.ArrayList;
import java.util.List;

//1부터 10까지 리스트활용합구하기(누적도미)
public class Array2_1_100 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) { // 리스트에 값넣기 1부터10까지
			numList.add(i);
		}

		int sum = 0;
		for (Integer num : numList) { // 출력하기
			sum = sum + num;
			System.out.println(sum);
		}

	}
}