
class Runclass implements Runnable {
    int name;

    Runclass(int name) {
        this.name = name;
    }

    public void run() {

        for (int i = 1; i < 6; i++) {
            System.out.println("Thread Name " + Thread.currentThread().getName());
            System.out.println("Thread Priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}


public class Thirteen {

    public static void main(String[] args) {

        // Runclass r1 = new Runclass();
        // Thread t1 = new Thread(r1);
        // Runclass2 r2 = new Runclass2();
        // Thread t2 = new Thread(r2);
        for (int i = 1; i < 3; i++) {
            // Runclass r1 = new Runclass(i);
            Thread t1 = new Thread(new Runclass(i));
            t1.setName("Thread " + i);
            t1.setPriority(Thread.MAX_PRIORITY);
            t1.start();
        }

    }

}
