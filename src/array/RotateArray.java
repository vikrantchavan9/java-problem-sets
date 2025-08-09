package src.array;

public class RotateArray {

    // Helper method to reverse part of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Left rotate array by d steps (in place)
    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle case when d > n

        if (d == 0) return; // No rotation needed

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse last n-d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        leftRotate(arr1, 2);
        System.out.println(java.util.Arrays.toString(arr1));
        // Output: [3, 4, 5, 1, 2]

    }
}
