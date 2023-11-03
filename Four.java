import java.util.Scanner;

class Sports {
    void putScore() {
        System.out.println("Enter Score: ");
        Scanner sc = new Scanner(System.in);
        float score = sc.nextFloat();
        sc.close();
        System.out.println("Score is : " + score);
    }
}

class Marks extends Sports {
    void putMarks() {
        System.out.println("Enter Marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();
        System.out.println("Marks are : " + marks);
    }
}

class Student extends Marks {

    void putNo() {
        System.out.println("Enter Roll no: ");
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        sc.close();
        System.out.println("RollNo is : " + rollno);

    }
}

public class Four {
    public static void main(String[] args) {
        Student s = new Student();
        s.putNo();
        s.putMarks();
        s.putScore();
        
    }

}
