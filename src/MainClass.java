
class Student{
	int age;
	char gender;  //멤버변수 age, gender
	
	

	public void setGender(char gender) {  
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}

	public void setAge(int age) {  //set함수=데이터받아서age에 세팅하는거
		this.age=age; //함수안에 함수생성
		
		//this의미=클래스안에 있는 age라는 듯+그옆에 그냥 age=파라미터내의 age라는뜻
	}
	
	public int getAge(int age) {  //get함수 
		return.age=age; // 리턴하는 함수=데이터 가져오는거
		
	
	
} //클래스 생성


public class MainClass {

	public static void main(String[] args) {

		Student 백지효 = new Student(); //객체(인스턴스=디폴트값은 0이다) new외울것!!!
		
		백지효.setAge(40);
		백지효.setGender('M'); 
		
		int age = 백지효.getAge();
		System.out.println(age);
		
		char gender = 백지효.getGender();
		System.out.println(gender);
		
		
		
		백지효.age = 23; //다이렉트로 age값 넣는 법
		System.out.println(백지효.age ); //출력하는 법

	
		
		
///////////////
		
 		
//		Rectangle rec = new Rectangle(); //다른클래스파일불러옴?
//		
//		rec.width =3;
//		rec.height =5;
//		
//		System.out.println(rec.width);
//		System.out.println(rec.height);*/
		
	}

}

/*
 * 클래스 Student:
 * 
 * Student 클래스는 학생의 정보를 나타내기 위한 클래스입니다. 멤버 변수로 age와 gender가 선언되어 있습니다. getAge()
 * 메서드는 age 값을 반환합니다. getGender() 메서드는 gender 값을 반환합니다. setAge() 메서드는 전달받은 값을
 * age에 설정합니다. setGender() 메서드는 전달받은 값을 gender에 설정합니다. 클래스 MainClass:
 * 
 * MainClass는 프로그램의 시작점인 main 메서드를 포함하는 클래스입니다. main 메서드에서는 다음 작업을 수행합니다:
 * Student 클래스를 이용하여 백지효 객체를 생성합니다. 백지효 객체의 setAge() 메서드를 사용하여 나이를 설정합니다. 백지효
 * 객체의 setGender() 메서드를 사용하여 성별을 설정합니다. 백지효 객체의 getAge() 메서드를 호출하여 나이를 가져와
 * 출력합니다. 백지효 객체의 getGender() 메서드를 호출하여 성별을 가져와 출력합니다. 백지효 객체의 age 변수에 직접 값을
 * 할당하고 출력합니다.
 */
