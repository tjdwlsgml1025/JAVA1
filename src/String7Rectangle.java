import java.util.Scanner;

class Rectangle3 {
   private double width, height; 

   public  Rectangle3() {} //생성자만들어줬으니까 게터세터 필요없어
   
   public  Rectangle3(double width, double height) {
      this.width = width;
      this.height = height;

   }

   public double getArea() {
      return width * height;
   }

}
public class String7Rectangle {

   public static void main(String[] args) {
      
	  while(true) {   //반복하려면 일단 전체를 와일에 넣어
		  
      Scanner sc = new Scanner(System.in);
         Rectangle3 rectangle;
         
         System.out.print("가로:");
         double width = sc.nextDouble();
         
         System.out.print("세로:");
         double height = sc.nextDouble();
         
         rectangle = new Rectangle3(width, height);
         
         System.out.println("넓이는:" + rectangle.getArea());
      
         ///반복하게하는것
         
         System.out.println("계속? Yes or NO");
         String choice = sc.next(); //예스올노 입력값받기
         
        if(choice.equals(choice.compareToIgnoreCase("yes"))||choice.equals("y")) //둘중하나면 컨티뉴
				continue;
		else 
					break;
				   
	  	}
	  
	  System.out.println("종료되었슴");
      }
   }