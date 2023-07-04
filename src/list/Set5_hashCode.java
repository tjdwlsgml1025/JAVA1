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
    public boolean equals(Object obj) {
        if (num == ((Num) obj).num)
            return true;
        else
            return false;
    }
}
public class Set5_hashCode {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for (Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
    }
}
