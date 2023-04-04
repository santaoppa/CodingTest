package LeetCode;

import java.util.Arrays;

public class No1480 {
    public static void main(String args[]){
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<=i; j++) sum[i] += nums[j];
        }
        return sum;
    }
}
