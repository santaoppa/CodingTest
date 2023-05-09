package LeetCode;

import java.util.*;

public class No15 {
    public static void main(String args[]){
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        if(nums == null || nums.length < 3){return new ArrayList<>(result);}

        Arrays.sort(nums);
        for (int i=0; i < nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }else if(sum < 0){
                    j++;
                }else if(sum > 0) {
                    k--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
