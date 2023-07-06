package IoStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Text_Stream1 {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data1.txt")){  //문자출력 스트림 생성
			out.write('A'); //문자 A저장 = 아스키코드로,2바이트
			out.write('한');
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
