package Arrange;


class Rectangle3 {
	   private double width, height; 

	   public  Rectangle3() {} 
	   
	   public  Rectangle3(double width, double height) {
	      this.width = width;
	      this.height = height;

	   }

	   public double getArea() {
	      return width * height;
	   }

	}


public class Arr5Rectangle {

	public static void main(String[] args) {
		
		Rectangle3[] arrrectangle = new Rectangle3[2];
		
		arrrectangle[0] = new Rectangle3(40,50);
		arrrectangle[1] = new Rectangle3(20,50);
		
		double  area = 0;
		for (int i = 0; i < arrrectangle.length; i++) { 
			area = area + arrrectangle[i].getArea();
		}
		System.out.println(area);
		

	}

}
