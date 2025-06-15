import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator");

        System.out.println("Enter your first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your second number");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an Operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':

                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Number is not divisible by 0");
                }
                break;
            default: {
                System.out.println("Enter a valid operator");
            }

                scanner.close();
        }
    }
}
