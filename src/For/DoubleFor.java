package For;
public class DoubleFor {
	
    public static void main(String[] args) {
    	
        for (int i = 2; i < 10; i++) {
        	
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println(); //j=10이라 거짓이 되면 이쪽으로 오기 대문에 개행시킴, 
            // 하지만 내부에서만 효력이 있으니 메모리에서 사라지고 i=2일때로 돌아가서 참이니까 내부for문이 다시 반복
        }
        
     
    }
}