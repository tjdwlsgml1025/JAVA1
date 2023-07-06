package timer;

class Shape {
	public double getArea() {
		return 0;
	}
}
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
class Rectangle extends Shape {
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}
}

public class TEST1 {
	public static void main(String[] args) {
		Shape[] shape = { new Circle(10), new Rectangle(10, 20) }; //
		double area = 0;
		for (Shape s : shape) {
			area = area + s.getArea();
		}
		System.out.println(area);

	}

}
