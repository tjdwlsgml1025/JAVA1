package Object;

class AAA extends Object{
	
	@Override
	public String toString() { 
		return"이것도 메롱이다.";
	}
}
//equals 내가 정의 안했는데 되는이유:부모가 가지고 잇어
public class Obect3_equals {

	public static void main(String[] args) {
		
		String str1 = new String("메롱");
		String str2 = new String("메롱"); //둘은 주소가 다름
	
		
		boolean bt = str1.equals(str2); //두개비교
		System.out.println(bt);  //이건  true=overriding해놨으니까
				

//////
		AAA aaa = new AAA();
		
		AAA bbb = new AAA();
		boolean b = aaa.equals(bbb); //본인주소equals(비교대상주소) 다르니까 false
		
		System.out.println(b);
		
	}

}
