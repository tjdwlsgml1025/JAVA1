package Star;

public class Star4 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//역 피라미드 별찍기
//j=5; j>=i; j-- 로 증감식으로 이용하는 방법도 잇음