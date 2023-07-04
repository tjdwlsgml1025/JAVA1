import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;

public class Exception4_Bufferdwriter { //throws위치:함수바디앞
	
	public static void excetTest()throws IOException{ //쓰로우함=호출하는놈에영향줌 
											//언체크드이쎕션 쓰로우스하면 밑에트라이캐치안해도 오류안남
		
	}
	
	
    public static void main(String[] args) throws Exception { 
    					 //함수에에러가나면 호출한 함수에게 던진다=내가예외처리하지않겠다
    	
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;      
        writer = Files.newBufferedWriter(file);
        
        excepTest(); //에러뜨는 이유는? : checkedException이니까 트라이체크를 해야함
    }
}
