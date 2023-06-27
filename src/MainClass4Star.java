 class StarPrint{
	 
	 void printTriangle(int num) {
				for(int i=1; i<=num; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
			}			 
	 }
	 
	 void printReverseTriangle(int num) {
		 for(int i=0; i<num; i++) {
				for(int j=i; j<=num; j++) {
					System.out.print("*");
				}
				System.out.println();
			}		 
	 }	  
 }
public class MainClass4Star {

	public static void main(String[] args) {
		StarPrint strPrint = new StarPrint();
		
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3);
	}

}
