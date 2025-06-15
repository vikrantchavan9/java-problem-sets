import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter first string: ");
          String num = scanner.nextLine();

          String reversednum = "";

          for (int i = num.length() - 1; i >= 0; i--) {
               reversednum += num.charAt(i);
          }
          System.out.println(reversednum);

          if (reversednum.equals(num)) {
               System.out.println("String is a palindrome");
          } else {
               System.out.println("String is not a palindrome");
          }
     }
}
