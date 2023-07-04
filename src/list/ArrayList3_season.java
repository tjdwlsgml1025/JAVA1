package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3_season { //사계절의 문제수 합

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //리스트 객체 생성

		list.add("spring");
		list.add("summer");
		list.add("fall");
		list.add("witer"); //리스트에 추가하기 	
		
		//첫번째방법//get으로 돌리는 방법
		int sum=0; 	
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			sum += str.length();
			System.out.println(sum);
		}
		
		//두번째방법  //foreach부문으로돌리기
		/*	int total = 0;
		for(String str : list) { //forEach문: 순환하여 반복하는 작업  //형식:( 데이터타입+변수명 : 리스트명 )
			total+=str.length(); //list의 요소들을 하나씩 가져와 str변수에할당하여 반복작업수행
		}	
		System.out.println(total);*/
		
	}

}
