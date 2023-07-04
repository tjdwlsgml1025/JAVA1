package list;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.Iterator;

public class Set_Practice1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();

		set.add("boy");
        set.add("Box");
        set.add("Robot");
        set.add("Box"); //중복되면 앞Box삭제함
        System.out.println("인스턴스 수: " + set.size());

        // 반복자를 이용한 전체 출력
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + '\t');
        }
        System.out.println();

        // for-each문을 이용한 전체 출력
        for (String s : set) {
            System.out.println(s + '\t');
        }
        System.out.println();
	}

}
