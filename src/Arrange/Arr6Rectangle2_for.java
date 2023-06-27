package Arrange;

import java.util.Scanner;

class Rectangle4 {
	   private double width, height; 

	   public  Rectangle4() {} 
	   
	   public  Rectangle4(double width, double height) {
	      this.width = width;
	      this.height = height;

	   }

	   public double getArea() {
	      return width * height;
	   }

	}


public class Arr6Rectangle2_for {

	public static void main(String[] args) {
		
	      Rectangle4[] arrRec = new Rectangle4[2];
	      
	      
	      
	      for(int i=0; i < arrRec.length;i++) {
	         int width, height;
	         Scanner sc = new Scanner(System.in);
	         width = sc.nextInt();
	         height = sc.nextInt();         
	      
	         arrRec[i] = new Rectangle4(width,height);
	      }
	      

	      
	      double areaRec =0;
	      for(int i=0; i < arrRec.length;i++) {
	         areaRec = areaRec + arrRec[i].getArea();         
	      }
	      System.out.println(areaRec);
	    }

	
}
