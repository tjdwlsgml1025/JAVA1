// -javac HelloWorld.java
// jave Helloworld = 
// 함수 () 소괄호로 판단 소괄호 앞에는 함수명
// 함수 -> 만드는 법 + 써먹는법
package Hamsu;
public class Hamsu4 {
    
   public static int add(int num1, int num2) {
      int result = num1 + num2;
      return result; // 리턴값 있어야 에러 안나
   }
   public static int sub(int num1, int num2) {
      return num1 - num2;
   }
   public static int mul(int num1, int num2) {
      return num1 * num2;
   }S   
   public static char gradChar(double avg) {   //수우미라는 글씨가 오니까 char로 데이터타입맞춰줘, 평균은 소수니가더블로
	   char ch = '가';  
	   
	   if (avg>=90) {
		   ch='수';
	   }
	   else if (avg>=80) {
		   ch='우';
	   }
	   else {
		   ch='미';
	   }	   
	   return ch;  //값이 ch로 나온다고! 꼭 말해줘~            
	   }
	   
   public static void main(String[] args) {
      System.out.println(add(3, 5));
      System.out.println(sub(3, 5)); //-2
      System.out.println(mul(3, 5));
      
      System.out.println(gradChar(90.8));
      System.out.println(gradChar(80.0));
      System.out.println(gradChar(50.0));
      
 

      
      /*
       * hiCar(); showFunction();
       * 
       * showAge(18, 170); //value = 값 = 변수 값 showAge(17, 180);
       * 
       * int height = 190;
       * 
       * showAge(18, height);
       * 
       * showStar1();
       */
      
   }
   
}