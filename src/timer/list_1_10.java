package timer;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class list_1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		System.out.println("입력하시오");
		
		while(true) {
			
			try{
				int num = sc.nextInt();
			
			
			if (num == -1)
				break;
			
			list.add(num);	
		} catch(Exception e) {
			System.out.println("잘못된 입력입니다");
			continue;
		
	}
	
	int max= 0;
	for(int num : list) {
		if(num>max)
			max= num;

	}
	System.out.println("가장 큰수는" + max);
    
    System.out.println(list);
}

}
}