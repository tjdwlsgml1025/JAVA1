package list;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList6_iterator { //iterator : 리모컨과 같음

	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<>(); //이 배열은 다int밖에 없음,integer로 지정해줬으니까
		
		list.add(10); //저장과정에서 오토박싱 진행
		list.add(20);
		list.add(30);
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) { //iterator리모콘생성, hasNext커서준비
			n = itr.next(); //오토 언박싱진행 // 커서가 리스트를보고 integer맞으면true니까클릭, 다음칸
			System.out.println(n+ "\n");
		}
		System.out.println();
	}

}
