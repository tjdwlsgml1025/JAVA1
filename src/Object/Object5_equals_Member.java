package Object;

class Member extends Object{
	private String color;
	
	public Member(String color) {
		this.color=color;
	}

	@Override //애너테이션오버라이드: 부모에 해당 함수 있어야한다 체크해주는 기능
	public boolean	equals(Object obj) {  //부모의 함수 호출, 바디만 바꿀꺼야
		Member member = (Member)obj;		
		
		 if(color.equals(member.color)) //Member컬러 VS member에있는 컬러 비교
		  return true;
		 
		 return false;	 			
 }
	
}
public class Object5_equals_Member {

    public static void main(String[] args) {
        Member obj1 = new Member("Black");
        Member obj2 = new Member("Black");
        Member obj3 = new Member("White");

        System.out.println(obj1.equals(obj2)); // obj1과 obj2비교 > true 출력
        System.out.println(obj1.equals(obj3)); // obj2과 obj3비교 >false 출력
    }
}
