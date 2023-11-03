import java.io.IOException;
import java.util.Scanner;

class Employee {
    String name, address;
    int year;

    Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void printdata() {
        System.out.println(name + "\t" + year + "\t" + address);
    }
}

public class One {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employees : ");
        int num = sc.nextInt();
        Employee[] arr = new Employee[num];

        for (int i = 0; i < num; i++) {
            try {
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Enter year : ");
                int year = sc.nextInt();
                if (year < 1990 || year > 2023) {
                    throw new Exception("Invalid year of joining");
                }
                System.out.println("Enter address : ");
                String address = sc.next();
                arr[i] = new Employee(name, year, address);
            } catch (Exception e) {
                System.out.println("Invalid Input \nEnter again");
                sc.nextLine();
                i--;

            }

        }
        System.out.println("Name\tYear\tAddress");
        for (int i = 0; i < num; i++) {
            arr[i].printdata();
        }
        sc.close();

    }

}
