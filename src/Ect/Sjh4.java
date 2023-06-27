package Ect;
public class Sjh4 {

   public static void main(String[] args) {
      int Kor = 90;
      int Eng = 70;
      int Meth = 45;
      
      int Sum = (Kor + Eng + Meth);
      double Ave = ((double)Sum / 3);
      
      System.out.println("총점 :" + Sum);
      System.out.println("평균 :" + Ave);
      
      if (Ave < 70) {
         System.out.println("성적 :" + " 미");
      }
   }

}