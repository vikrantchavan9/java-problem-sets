package src.array;

import java.sql.SQLOutput;

public class LargestNumber {
    public static int findLargest(int[] nums) {
        int max = nums[0];

        for (int i =1; i < nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num1 = {3,3,6,1};
        int[] num2 = {3,3,0,99,-40};

        System.out.println("Largest in nums1: " + findLargest(num1));
        System.out.println("Largest in nums2: " + findLargest(num2));
    }
}
