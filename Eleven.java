
interface Shape
{
    double area();
    double perimeter();

}
class Rectangle implements Shape
{   double x,y;
    Rectangle(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public double area()
    {
        return x*y;
    }
    public double perimeter()
    {
        return 2*(x+y);
    }
}

class Circle implements Shape
{
    double r;
    Circle(double r)
    {
        this.r=r;
    }
    public double area()
    {
        return 3.14*r*r;
    }
    public double perimeter()
    {
        return 2*3.14*r;
    }

}

public class Eleven 
{
    public static void main(String args[])
    {
        System.out.println("hello");
        Rectangle rect = new Rectangle(10, 15);
        System.out.println("Area of rectangle " + rect.area());
        System.out.println("Perimeter of rectangle " + rect.perimeter());
        Circle circ = new Circle(15);
        System.out.println("Area of Circle " + circ.area());
        System.out.println("Perimeter of Circle " + circ.perimeter());
    }
}