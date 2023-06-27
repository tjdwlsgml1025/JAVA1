package timer;

public class Rectangle extends Shape {

	private double width, height;

	public void Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return width*height;
	}

}
