package IoStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class IOStream1 {
    public static void main(String[] args) throws IOException { //output = 값 넣기
        
    
       OutputStream out = new FileOutputStream("data.dat"); //"파일명"
        out.write(7);//4byte의 2진수로 7이 저장돼있다
        out.close();//더이상 이 스트림은 쓰지 않겠다
        
        
        InputStream in = new FileInputStream("data.dat"); //input = read하는 것
        int dat = in.read();
        in.close();

        System.out.println(dat);   
    }
}