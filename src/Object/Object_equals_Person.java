package Object;
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
		@Override
    public boolean equals(Object obj) {	
		Person person = (Person)obj;
		
		if((this.name.equals(person.name))&& this.age== person.age) 
			//정수타임은 equals 안써도 됨(스트링만) == : 주소값비교 // this본인거랑 obj부모거 비교함
			return true;	
		return false;
    }	
}

public class Object_equals_Person {

	public static void main(String[] args) {
		Person kim = new Person ("홍길동",35);
		Person park = new Person ("홍길동",35);
		Person heo = new Person ("홍길동",34);
		
		if(kim.equals(park))
			System.out.println("같은 사람입니다."); //이름 같으니까 같은 사람이게
		else
			System.out.println("다른 사람입니다.");		
		if(kim.equals(heo))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다."); //나이가 다르니까 다른사람나오게
	}

}
