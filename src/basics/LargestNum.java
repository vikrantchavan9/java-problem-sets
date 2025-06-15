import java.util.Scanner;

public class LargestNum {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter first number: ");
          int a = scanner.nextInt();

          System.out.println("Enter second number: ");
          int b = scanner.nextInt();

          System.out.println("Enter third number: ");
          int c = scanner.nextInt();

          if (a >= b && a >= c) {
               System.out.println("A is greater than b and c");
          } else if (b >= a && b >= c) {
               System.out.println("B is greater than a and c");
          } else {
               System.out.println("C is greater than a and b");
          }
     }
}
