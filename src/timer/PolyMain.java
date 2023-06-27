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
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }
}

public class PolyMain {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(10, 20) };

        double area = 0;

        for (Shape s : shapes) {
            area = area + s.getArea();
        }

        System.out.println(area);
    }
}
