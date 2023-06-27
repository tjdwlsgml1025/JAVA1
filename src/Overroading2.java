//여권을 가진 사람과 가지지 않은 사람에 대한 출력 생성자 오버로딩예시	
class Person{
		private int regiNum; //주민번호
		private int passNum;// 여권번호
		
		public Person(int rnum, int pnum) {   //생성자1번
			regiNum = rnum;
			passNum = pnum; // 인스턴스 변수랑 이름 다르니까 굳이 this안붙임
		}
		Person(int rnum){   //생성자 2번 : 여권번호가 0인경우도 있으니까/파라미터개수다르니까 함수명 중복가능
			regiNum = rnum;
			passNum=0;
		}
		void showPersonalInfo() {
			 System.out.println("주민등록 번호: " + regiNum);
			 
		        if(passNum != 0)
		            System.out.println("여권 번호: " + passNum + '\n');
		        else
		            System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}


public class Overroading2 {

	public static void main(String[] args) {
	Person jung = new Person ( 335577, 112233);
	Person hong = new Person(775544);
	
	jung.showPersonalInfo();
	hong.showPersonalInfo();
		
	}

}
