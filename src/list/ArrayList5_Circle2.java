package list;

import java.util.ArrayList;
import java.util.List;

class Circle {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

public class ArrayList5_Circle2 {
    public static void main(String[] args) {
      
    	List<Circle> list = new ArrayList<>(); // Circle 객체를 저장할 리스트 생성
    	
    	for(double i=0; i<=10; i++)	{
        list.add(new Circle(i));
    	}

        double sum = 0;
        for (Circle circle : list) {
            sum += circle.getArea();
            System.out.println(sum);
        }    
       
    }
}
