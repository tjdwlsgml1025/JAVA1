package timer;

import java.io.BufferedReader;
import java.net.URL;

public class URLConnect {

	public static void main(String[] args) {
		new URLConEx();
	}
	public static class URLConEx{
		public URLConEx() {
			String code =null;
			System.out.println("웹 주소를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			String address = scanner.next();
			
			try {
				URL url = new URL(address);
				URLConnection con = url.openConnection();
				BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream));
				FileWriter fw = new FileWriter("file.html");
				
				while((code = webData.readLine()))
			}
		}
	}
	
	
	
	
}
