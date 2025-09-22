package src.patterns;

public class CenterPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i =1; i <= n; i++) {
            for (int s=5; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j=1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}