package list;

import java.util.HashSet;


public class Set4_hashCode_lotto {

	public static void main(String[] args) {
	
		  HashSet<Integer>lotto = new HashSet<Integer>();
		  while(lotto.size()!= 6) {
			  int num=(int)Math.random()*45 +1;	
			  lotto.add(num);
			  
		  }
		  
		System.out.println(lotto);


}
}
