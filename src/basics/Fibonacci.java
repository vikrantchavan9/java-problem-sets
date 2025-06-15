import java.util.Scanner;

public class Fibonacci {
     // 0 1 1 2 3 5 8 ...
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the number of terms: ");
          int n = scanner.nextInt();
          int a = 0, b = 1;

          for (int i = 1; i <= n; i++) {
               int sum = a + b;
               System.out.println(" " + a);
               a = b;
               b = sum;
          }
     }
}
