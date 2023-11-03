
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    synchronized  void deposit(int num) {
        if (num > 0) {
            balance = balance + num;
            System.out.println("Deposited " + num + " Current Balance is  " + balance);
        }
    }

   synchronized void withdraw(int num) {
        if (num <= balance) {
            balance = balance - num;
            System.out.println(num + "  Withdrawn  Remaining Balance is " + balance);
        } else {
            System.out.println("Not Enough Balance");
            System.out.println("Current Balance is " + balance);
        }
    }

}

public class Seventeen {
    public static void main(String[] args) {

        Account account = new Account(100);
        Thread depositThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.deposit(100);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }

        });

        Thread withdrawThread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.withdraw(100);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }

        });
        depositThread.start();
        withdrawThread.start();

    }
}
