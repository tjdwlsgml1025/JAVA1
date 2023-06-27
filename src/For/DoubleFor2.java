package For;
public class DoubleFor2 {
	
    public static void main(String[] args) {
    	
        for (int i = 2; i < 10; i++) {
        	if( i%2 !=0)
        		continue; //홀수를 컨티뉴로 하는게 깔끔해> 컨티뉴는 위에있는 증ㄱ마ㅜㄴ으로 감
        	for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            	}		
                System.out.println(); 
        }
        
     
    }
}

//짝수단만 나오게 하기 구구단에서
    