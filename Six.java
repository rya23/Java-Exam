
class Area {

    int area(int length, int breadth) {
        return length * breadth;
    }

    int area(int side) {
        return side * side;
    }

}

public class Six {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.area(10, 15));
        System.out.println(a.area(15));
    }

}
