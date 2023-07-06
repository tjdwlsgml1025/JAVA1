package IoStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Text_Stream2_Alphabet {

	public static void main(String[] args) {
		try(Reader in = new FileReader("data2.txt")){ 
			int ch;
			
		while(true) {
			ch=in.read(); // 문자를 하나씩 읽는다
			if(ch==-1) //더이상 읽을 문자가 없다면
				break;
			System.out.println((char)ch); //문자를 하나씩 출력한다
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
