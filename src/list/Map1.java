package list;

import java.util.HashMap;
import javax.print.DocFlavor.STRING;

public class Map1 {
	public static void main(String[]args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//key-Value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		//데이터 탐색
		System.out.println("23번:"+map.get(23));
		System.out.println("37번:"+map.get(37));
		System.out.println("45번:"+map.get(45));
		System.out.println();
		
		//데이터 삭제
		map.remove(37);
		
		//데이터 삭제확인
		System.out.println("37번:"+map.get(37));
	}

}
