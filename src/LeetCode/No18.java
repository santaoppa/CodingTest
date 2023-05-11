package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class No18 {
    public static void main(String args[]){
     System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {
            int j = nums.length - 1;
            while (i < j) {
                int left = i + 1, right = j - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (target == sum) {
                        result.add(Arrays.asList(nums[i],nums[left],nums[right],nums[j]));
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    }
                }

                j--;
            }
        }
        return new ArrayList<>(result);
    }
}
