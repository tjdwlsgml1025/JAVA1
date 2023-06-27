package Arrange;

public class Arr2lotto {
	public static void main(String[] args) {
		int[] arrLotto = new int [6]; //방6개 생성함
		
		for(int i=0; i<arrLotto.length; i++) {  //for문으로 쉽게 배열 선언
			arrLotto[i] = (int)(Math.random()*45+1); // 6개방안에 1~45숫자가 랜덤으로 들어감(배열선언됨)
			
			for(int j=0; j<i; j++) {//앞방이랑 중복안되게 더블체크(그래서 =없이함,본인방은 빼고 바로앞까지만해야니까, -1은 <로 표현하면 돼!)
				//j=0이니까 첫번째 방을 가르킴
				if(arrLotto[i] == arrLotto[j]) {
					i--; //방을 뒤로 뺌(방금중복됐으니까그값은없던걸로쳐야니까! 그래서 후위연산자--로감)
					break;
				}
			}
		}
		
		for(int i=0; i< arrLotto.length; i++) { //프린트할때도 또 방을 랜덤으로 뽑아야니까 
			System.out.println(arrLotto[i]);
		}
		
		
	}
		 
}


