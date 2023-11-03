import java.util.*;

public class Eight {

    public static int[][] Add(int[][] arr1, int[][] arr2, int l, int b) {
        int[][] arr3 = new int[l][b];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }

    public static int[][] Subtract(int[][] arr1, int[][] arr2, int l, int b) {
        int[][] arr3 = new int[l][b];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return arr3;
    }

    public static int[][] Multiply(int[][] arr1, int[][] arr2, int l, int b) {
        int[][] arr3 = new int[l][b];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < l; k++)
                    arr3[i][j] = arr3[i][j] + (arr1[i][k] * arr2[k][j]);
            }
        }
        return arr3;
    }

    public static void display(int[][] arr, int l, int b) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] input(int l, int b) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Row and Colums");
        // int l = sc.nextInt();
        // int b = sc.nextInt();

        int[][] arr3 = new int[l][b];
        System.out.println("Enter Elements");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = sc.nextInt();
            }

        }
        return arr3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Colums");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix1 = input(l, b);
        int[][] matrix2 = input(l, b);

        int choice;
        while (true) {
            System.out.println("Matrix Manipulation Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int[][] additionResult = Add(matrix1, matrix2, l, b);
                    // System.out.println(Arrays.toString(additionResult));
                  display(additionResult, l, b);
                    break;
                case 2:
                    int[][] subtractionResult = Subtract(matrix1, matrix2, l, b);
                    display(subtractionResult, l, b);
                    break;
                case 3:
                    int[][] multiplicationResult = Multiply(matrix1, matrix2, l, b);
                    display(multiplicationResult, l, b);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
