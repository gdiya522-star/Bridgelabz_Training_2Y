package arrays.logicbuilding;

public class PairSum {
    public static int pairSum(int nums[], int target) {
        int count = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int tripleSum(int nums[],int target){
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        int nums[]={1,2,3,4,5,6,7,8,9};
        int target=9;
        System.out.println(pairSum(nums,target));
        System.out.println(tripleSum(nums,target));
    }
}
