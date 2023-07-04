package list;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

public class Map2_Key {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>(); //트리맵이니까 키값이 정렬됨
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		//키만 담고있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		//전체 key출력(for-each문기반)
		for(Integer n : ks)
			System.out.println(n.toString()+'\t');
		System.out.println();
		
		//전체value출력(for-each문기반)
		for(Integer n : ks)
			System.out.println(map.get(n).toString()+'\t');
		System.out.println();
		
		//전체 value출력(반복자기반)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.println(map.get(itr.next())+'\t');
		System.out.println();
		
	}

}
