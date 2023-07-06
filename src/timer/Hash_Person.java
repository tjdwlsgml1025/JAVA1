package timer;

import java.util.HashSet;

import list.Person;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	   public boolean equals(Object obj) {		      
	      Person person = (Person) obj;      
	      if( (this.name.equals(person.name)) && (this.age == person.age))
	         return true;
	   		      
	      return false;
	   }
	@Override
    public String toString() {
			return name+" "+age + "세";
		}	
		 class Hash_Person {

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
