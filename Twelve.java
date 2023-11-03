import java.util.Scanner;
import java.io.*;

public class Twelve {

    public static void main(String[] args) {

        int[] a = new int[2];
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("a");
        }

        try {

            int e = 5;
            int b = 0;
            System.out.println(e / b);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter a number : ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(x);
            sc.close();
        } catch (Exception e) {
            System.out.println(e);

        }

        try {
            String str = new String("abc");
            int e = Integer.parseInt(str);
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // System.in.close();
            // String input = reader.readLine();
            // System.out.println("Input: " + input);
            throw new IOException("Io Exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
