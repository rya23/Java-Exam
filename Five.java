
class Rectangle {
    int length, breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    int area() {
        return length * breadth;
    }
}

public class Five {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(2);
        Rectangle rect3 = new Rectangle(2, 5);

        System.out.println(rect1.area());
        System.out.println(rect2.area());
        System.out.println(rect3.area());
    }
}
