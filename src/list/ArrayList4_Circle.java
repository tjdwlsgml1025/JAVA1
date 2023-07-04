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

public class ArrayList4_Circle {
    public static void main(String[] args) {
      
    	List<Circle> list = new ArrayList<>(); // Circle 객체를 저장할 리스트 생성
    	
        list.add(new Circle(10));
        list.add(new Circle(20));
        list.add(new Circle(30));

        double sum = 0;
        for (Circle circle : list) {
            sum += circle.getArea();
        }    
        System.out.println("원의 면적의 합: " + sum);
    }
}
