package timer;

public class overriding_String_Circle {
    static class Circle {
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

        @Override
        public String toString() {
            return "원의 넓이는 " + getArea() + "이고 반지름은 " + radius + "인 원";
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle); // 출력: 원의 넓이는 314.1592653589793이고 반지름은 10인 원
    }
}
