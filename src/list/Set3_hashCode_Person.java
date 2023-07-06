package list;

import java.util.HashSet;
import java.util.Set;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
		@Override
	public int hashCode() {
		return age; //분류알고리즘은 반드시 int로 = 나이대로 분류하겠다
		}
		
		@Override
		   public boolean equals(Object obj) {		      
		      Person person = (Person) obj;      
		      if( (this.name.equals(person.name)) && (this.age == person.age))
		         return true;
		   		      
		      return false;
		   }
	
		
}


public class Set3_hashCode_Person {

    public static void main(String[] args) {
        HashSet<Person> hSet = new HashSet<Person>();

        hSet.add(new Person("LEE", 10));
        hSet.add(new Person("LEE", 10));
        hSet.add(new Person("PARK", 35));
        hSet.add(new Person("PARK", 35));

        System.out.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet);
    }
}
