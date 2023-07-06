package IoStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoStream3_buffer { //복사의 원리 코드, 1K바이트 기반 파일 복사 프로그램(짱빠룸)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("대상파일:");	
		String src = sc.nextLine();
		
		System.out.println("사본이름:");
		String dst = sc.nextLine();
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))){

			int data;

			while(true) {
				data= in.read(); 
				if(data == -1)  
					break;
				out.write(data); 
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

}
