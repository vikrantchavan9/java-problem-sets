package src.basics;

import java.util.Scanner;

public class ReverseaString {
     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a string: ");
          String str = scanner.nextLine();

          String reversedstr = "";

          for(int i = str.length() - 1; i>=0; i-- ) {
               reversedstr += str.charAt(i);
          }
          System.out.println(reversedstr);
          }
}
