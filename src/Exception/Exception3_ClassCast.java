package Exception;

public class Exception3_ClassCast {
class Board{}
class PBoard extends Board{}
	
	
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1 ; //OK
		
		System.out.println("....");
		
		Board ebd1 = new Board(); //객체생성이 잘못돼서! 부모=자식이 아니니까
		PBoard ebd2 = (PBoard)ebd1 ; //Exception
	}

}
