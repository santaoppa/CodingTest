package LeetCode;

import java.util.Arrays;

public class No16 {
    public static void main(String args[]){
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = nums[0]+nums[1]+nums[nums.length-1];

        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j = i+1 , k = nums.length-1;

            while(j<k) {
                int sum = nums[j]+nums[k]+nums[i];
                if(sum>target) k--;
                else if(sum<target) j++;
                else return target;

                if(Math.abs(sum-target) < Math.abs(answer-target)) answer = sum;
            }
        }
        return answer;
    }
}
