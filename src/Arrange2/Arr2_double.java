package Arrange2;

public class Arr2_double {

	public static void main(String[] args) {
		int [][] arr = {
				 {11},
				 {22,33},
				 {44,55,66} //다이렉트로 행마다 값 넣어주기
		 };
		
		//배열의 구조대로 내용 출력 =암기필순
		for(int i =0; i <arr.length; i++) { //arr.length=3 : 행의 길이를 뜻함 
			for(int j = 0; j <arr[i].length; j++) { //arr[i].length를 잘 확인할것! 1행은 하나만 출력하니까 
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
