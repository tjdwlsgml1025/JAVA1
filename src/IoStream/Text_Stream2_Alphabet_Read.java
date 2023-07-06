package IoStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Text_Stream2_Alphabet_Read {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data2.txt")){ 
			for(char ch = 'A'; ch<='Z'; ch++) {
				out.write(ch); 
			}	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
