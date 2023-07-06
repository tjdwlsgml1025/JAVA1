package timer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OEStream {

	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다";
		String es ="Life is long if you know how to use int";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
			bw.write(ks,0,ks.length());
			bw.newLine();
			bw.write(es,0,es.length());		
		}catch(IOException e){
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))){
			String str;
			while(true) {
				str=br.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
