package Star;

public class Star6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
				
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//역피라미드띄어쓰기 별찍기 
//공백부분 코딩+별코딩 
