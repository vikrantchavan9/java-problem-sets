package src.basics;

import java.util.Scanner;

public class Tables {
    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        for(int i=1; i<=12; i++){
            int output = num * i;
            System.out.println(num+ " X " + i + " = " + output);
        }
    }
}
