
class Account {
    int no;
    double balance;

    Account(int no, double balance) {
        this.no = no;
        this.balance = balance;
    }

    void deposit(int num) {
        if (num > 0) {
            balance = balance + num;
        }
    }

}

class Saving extends Account {
    double interestrate;

    Saving(int no, double balance, double interestrate) {
        super(no, balance);
        this.interestrate = interestrate;
    }

    void addInterest() {
        double interest = balance * interestrate / 100;
        balance = balance + interest;
        System.out.println("Saving balance : " + balance);
    }

}

class Current extends Account {
    double interestrate;

    Current(int no, double balance, double interestrate) {
        super(no, balance);
        this.interestrate = interestrate;
    }

    void addInterest() {
        double interest = balance * interestrate / 50;
        balance = balance + interest;
        System.out.println("Current balance : " + balance);
    }

}

public class Three {
    public static void main(String[] args) {

        Saving s = new Saving(123, 100, 8);
        Current c = new Current(145, 150, 7);

        System.out.println(s.balance);
        s.deposit(1000);
        System.out.println(s.balance);
        s.addInterest();
        System.out.print("Current Account : ");
        System.out.println(c.balance);
        c.deposit(1000);
        System.out.println(c.balance);
        c.addInterest();


                // while (true) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("1. Deposit 2. Withdraw 3. CheckBalance 4.Exit");
        // int no = sc.nextInt();
        // switch (no) {
        // case 1: {
        // System.out.println("Enter amount to deposit : ");
        // int num = sc.nextInt();
        // ac.deposit(num);

        // break;
        // }
        // case 2: {
        // System.out.println("Enter amount to Withdraw : ");
        // int num = sc.nextInt();
        // ac.withdraw(num);
        // break;
        // }
        // case 3: {
        // System.out.println("Balance is " + ac.balance);
        // break;
        // }
        // case 4: {
        // return;
        // }
        // }
        // }

    }

}
