package src.SortingTechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // swap in one line
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
