import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter full name");
        String name = sc.nextLine();
        sc.close();
        System.out.println(name);
        int i = name.indexOf(" ");
        int j = name.lastIndexOf(" ");
        if(i==j)
        {
            System.out.println("Invalid Input");
        }
       else System.out.println(name.charAt(0)+"."+name.charAt(i+1)+"."+name.substring(j+1, name.length()));
    }
    
}
