package IoStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IoStream2_copy { //복사의 원리 코드, 1K바이트 기반 파일 복사 프로그램(짱빠룸)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("대상파일:");	
		String src = sc.nextLine();
		
		System.out.println("사본이름:");
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
			
			byte buf[] = new byte[1024];
			int len;
			int count =1;
			
			while(true) {
				len= in.read(buf); //배열 buf로 데이터를 읽어들이고
				if(len == -1)  //더이상 읽어들일 데이터가 없다면 -1반환
					break;
				out.write(buf, 0, len); //0:배열의0번째부터시작하겠다 = buf[0] / len바이트만큼 데이터를 저장한다 buf[buf.length()-1]
				System.out.println("횟수:" + count++);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

}
