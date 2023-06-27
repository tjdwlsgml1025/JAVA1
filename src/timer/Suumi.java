package timer;

public class Suumi {

	public static char gradChar(double avg) {
		char ch ='가';
		
		if (avg >= 90) {
			ch='수';
		}
		else if (avg >= 80) {
			ch='우';
		}
		
		else if (avg >= 70) {
			ch='미';
		}
		return ch;
	}
		 public static void main(String[] args) {
			 System.out.println(gradChar(90.8));
			 System.out.println(gradChar(80.0));
			 System.out.println(gradChar(50.0));
		 }
	}

}
