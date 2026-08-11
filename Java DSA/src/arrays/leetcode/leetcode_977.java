package Arrays.Leetcode;

import java.util.Arrays;

public class leetcode_977 {
    public static int[] sortedSquares(int[] nums) {
        int[] s = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = nums[i] * nums[i];
        }
        for(int i=1;i<s.length;i++){
            for(int j=0;j<s.length-1;j++){
                if(s[j]>s[j+1]){
                    int temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        return s;

    }

    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        System.out.println("Given Array: "+ Arrays.toString(nums));
        System.out.println("Square of a Sorted Array: "+Arrays.toString(sortedSquares(nums)));
    }
}
