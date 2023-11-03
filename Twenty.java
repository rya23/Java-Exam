
//concatenate
//replace
//to lower,toupper
//trim
//split







import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println("Enter a string to concatenate");
        String s1=sc.next();
        System.out.println("Before Appending : " + s);
        String s3=s.concat(s1);
        System.out.println("After Appending : " + s3);

        
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println("To upper : " + s);
        s=s.toLowerCase();
        System.out.println("To lower :" + s );

        s=s.replace("l", "a");
        System.out.println("After replacement  : " + s);

        s=s.trim();
        System.out.println(s);
        
        s=s.substring(2,5);
        System.out.println(s);

        sc.close();
    }
}
