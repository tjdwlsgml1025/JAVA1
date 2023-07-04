package list;

import java.util.HashSet;
import java.util.Set;

class Num {
    private int num;

    public Num(int n) {
        num = n;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() { //3으로 나눌 때 나머지값으로 분류
    	System.out.println("해시코드호출");
        return num % 3;
    }

    @Override
    public boolean equals(Object obj) {  //분류된 인스턴스들을 비교, 같으면 true
       System.out.println("이퀄즈호출");
    	if (num == ((Num) obj).num)
            return true;
        else
            return false;
    }
}

public class Set2_Hashcode {
    public static void main(String[] args) {
        Set<Num> set = new HashSet<>();

        set.add(new Num(3)); //해시코드 오버라이딩을 안했을 경우, 오브젝트의 해시코드를 가져옴 근데 부모해시코드는 구현부가 없어. 그래서 다다른해시코드가 나오니까 중복이안돼 다다른해시코드      
        set.add(new Num(3)); //3이 중복이니까 한번만 넣고,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        set.add(new Num(2));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        set.add(new Num(10));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

        System.out.println(set.size());
    }
}
