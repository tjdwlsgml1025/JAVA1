package Hamsu;

public class Hamsu5 {

   public static void showStar(int num) {
      for (int i = 0; i < num; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      showStar(5);
   }
}