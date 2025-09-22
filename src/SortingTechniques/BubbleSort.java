package src.SortingTechniques;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = {1,3,7,4,8};
        int n = nums.length;

        for (int i = 0; i < n -1; i++) {
            for (int j=0; j < n-i-1; j++){
                if (nums[j] > nums [j + 1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int num : nums ) {
            System.out.print( num + " ");
        }
    }
}
