import java.util.Scanner;

class Rectangle{

    int length, breadth;
    Rectangle(int length,int breadth)

    {
        this.length=length;
        this.breadth=breadth;
    }
    int returnArea()
    {
        return length*breadth;
    }
}



public class Two {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int length= sc.nextInt();
        System.out.println("Enter Breadth : ");
        int breadth = sc.nextInt();
        Rectangle rect = new Rectangle(length, breadth);
        System.out.println(rect.returnArea());
        sc.close();
    }
    
}
