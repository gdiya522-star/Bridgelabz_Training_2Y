package Arrays.Leetcode;

import java.util.Arrays;

public class leetcode_215 {
    public static int[] findKthLargest(int[] nums, int k) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return new int[]{(nums[nums.length - k])};
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println("Given Array: "+ Arrays.toString(nums));
        System.out.println("Kth Largest Element in an Array: "+Arrays.toString(findKthLargest(nums,k)));
    }
}