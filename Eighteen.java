class Shape {

    double getArea() {
        return 0;
    }

    double getPerimeter() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    double getArea() {
        return radius * 3.14 * radius;
    }
}

public class Eighteen {

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area : " + c.getArea());
        System.out.println("Perimeter : " + c.getPerimeter());
    }

}
