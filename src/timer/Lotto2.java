package timer;

public class Lotto2 {

	public static void main(String[] args) {
		int[] arrLotto = new int[6];
		
		for(int i=0; i<arrLotto.length;i++) {
			arrLotto[i] = (int)(Math.random()*45+1); //랜덤번호뽑기
			
			for(int j=0; j<i; j++) {
				if(arrLotto[i] ==arrLotto[j]) { //중복제거하기
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arrLotto.length; i++) {
			System.out.println(arrLotto[i]); //쌓아서 출력
		}
		
	}

}
