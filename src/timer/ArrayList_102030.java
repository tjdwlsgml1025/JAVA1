package timer;
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

public class ArrayList_102030 {

	public static void main(String[] args) {
		
		List<Circle>list = new ArrayList<>();
		
		list.add(new Circle(10));
		list.add(new Circle(20));
		list.add(new Circle(30));
		
		double sum = 0;
		for(Circle circle : list) {
			sum += circle.getArea();
		}
		System.out.println(sum);
	}

}
