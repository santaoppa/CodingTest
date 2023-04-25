package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class No1 {
    public static void main(String args[]){
        System.out.println(twoSum(new int[]{2,7,11,15}, 9));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                return new int[]{hm.get(nums[i]), i};
            }
            hm.put(target-nums[i], i);
        }
        return new int[]{};
    }
}
