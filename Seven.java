
class Member {
    String name;
    int age;
    int number;
    String address;
    int salary;

    void printSalary() {
        System.out.println("Salary is : " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, int number, String address, int salary, String specialization) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, int number, String address, int salary, String department) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
}

public class Seven {
    public static void main(String[] args) {
        Employee em = new Employee("bhushan", 50, 754613245, "mumbai", 20, "teacher");
        System.out.println("Employee Salary");
        em.printSalary();
        System.out.println("Manager Salary");
        Manager m = new Manager("bhushan", 50, 754613245, "mumbai", 200, "ai-ds");
        m.printSalary();

    }
}
